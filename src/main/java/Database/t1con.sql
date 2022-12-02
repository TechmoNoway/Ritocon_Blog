﻿create database t1con;

use t1con;

create table Users (
	id_user int identity(1,1),
	name_user nvarchar(50),
	fullname_user nvarchar(50),
	phoneNumber_user varchar(20),
	password_user varchar(20),
	role_user varchar(10)
)

create table Currents(
	id_user varchar(5),
	name_user nvarchar(50),
	fullname_user nvarchar(50),
	phoneNumber_user varchar(20),
	password_user varchar(20),
	role_user varchar(10)
)

create table Articles(
	id_article int identity(1,1),
	title_article nvarchar(100),
	description_article ntext,
	date_article date, 
	image_article varchar(100),
	state_article varchar(10),
	author_article int
)

create table Comments (
	id_comment int identity(1,1),
	id_user int,
	id_article int,
	content nvarchar(200)
)

create table PostAuths (
	id_authen int identity(1,1),
	id_user int,
	id_article int
)
/*Create trigger*/
/*When a user is deleted all of article is composed by this user also is deleted*/
/*The part is browse trigger of admin */
go
create trigger [UserDelete]
on [dbo].[Users]
for delete
as 
delete Articles where author_article like (select id_user from deleted)

go
create trigger [CurrentUpdate]
on [dbo].[Currents]
for update
as
begin
	update Users set fullname_user = (select fullname_user from inserted), 
						name_user = (select name_user from inserted),
						password_user = (select password_user from inserted),
						phoneNumber_user = (select phoneNumber_user from inserted)
					where cast(id_user as nvarchar(5)) = (select id_user from inserted)
end

go 
create trigger [ArticleInsert]
on [dbo].[Articles]
for insert
as 
insert into PostAuths select author_article, id_article from inserted

go 
create trigger [ArticleUpdate]
on [dbo].[Articles]
after update
as
begin 
	declare @state varchar(10)
	set nocount on;
	select @state = state_article from	inserted
	if(@state like 'fail')
	begin
		delete Articles where id_article = (select id_article from inserted)
		delete PostAuths where id_article = (select id_article from inserted)
	end
	else
	begin
		delete PostAuths where id_article = (select id_article from inserted)
	end
end
go
create trigger [DeleteArticle]
on [dbo].[Articles]
after delete
as
begin
	if exists(select * from Comments where id_article = (select id_article from deleted))
	begin
		delete Comments where id_article = (select id_article from deleted)
	end
end
go
create trigger [PostDelete] 
on [dbo].[Articles]
instead of delete 
as
begin
	declare @state varchar(10)
	set @state = (select state_article from deleted)
	if(@state like 'pending')
	begin
		Print 'You do not be deleted this article'
	end
	else
	begin
		delete Articles where id_article = (select id_article from deleted)
	end
end
go
create trigger [CreateUser]
on [dbo].[Users]
for insert
as 
	insert into Articles values (N'', N'', '2012-02-21T18:10:00', '', 'pending', (select id_user from inserted))
/*Fucntion*/
/*Count amount of comment in a article*/
go
create function count_amount_comment(@id_article int)
returns int
as 
begin 
	declare @result int
	set @result = (select count(*) from Comments where id_article = @id_article)
	return @result
end

go
create function extract_name_author(@id_user int)
returns nvarchar(50)
as 
begin
	declare @result nvarchar(50)
	set @result = (select name_user from Users where id_user = @id_user)
	return @result
end
go
create function identify_role(@id int)
returns varchar(10)
as
begin
	declare @result varchar(10)
	set @result = (select role_user from Users where id_user = @id)
	return @result
end

/*Views*/
/*For article*/
go
create view [CommentView]
as
	select  a.id_article, a.id_comment, b.name_user, a.content
	from Comments a
	inner join Users b 
	on a.id_user = b.id_user


go
create view [DetailView]
as
select title_article, 
	description_article, 
	dbo.count_amount_comment(id_article) as comments,
	dbo.extract_name_author(author_article) as author,
	image_article
from Articles
go


create view [AuthorView] as (
	select a.id_user, a.name_user,a.fullname_user, a.phoneNumber_user,
		count(b.id_article) as amount_created_article
	from Users a
	left join Articles b on a.id_user = b.author_article
	group by a.id_user, a.name_user, a.fullname_user, a.phoneNumber_user

)



/*Procedure*/
/*For Author*/

go
create procedure article_view @state varchar(10), @title varchar(10), @author varchar(10)
as 
begin
	with searchview as (
		select id_article,
			title_article, 
			dbo.count_amount_comment(id_article) as comments,
			dbo.extract_name_author(author_article) as author,
			date_article
		from Articles
		where state_article = @state
	),
	view_sort as (
		select a.*,	
				rank() over(order by a.comments desc) as rank
		from searchview a 
	)
	select * from view_sort where title_article like @title and author like @author
end



go
create procedure select_state_article @state varchar(10), @id int
as
begin 
	if(@state like 'pending')
	begin 
		select 
			title_article, 
			SUBSTRING(description_article, 1, 30) as desc_article, 
			image_article, 
			date_article 
		from Articles where state_article like @state and author_article = @id
	end
	else
	begin
		select 
			title_article, 
			SUBSTRING(description_article, 1, 30) as desc_article, 
			dbo.count_amount_comment(id_article) as comment,
			image_article, 
			date_article 
		from Articles where state_article like @state and author_article = @id
	end
end
go

create procedure udpate_state @id int, @id_article int, @state varchar(10)
as
begin
	declare @role varchar(10)
	set @role = dbo.identify_role(@id)

	if(@role like 'admin')
	begin
		update Articles set state_article = @state where id_article = @id_article
	end
end


/*Query Statement*/
/*Đăng nhập */

/*The inserted part*/
insert into Users values 
	(N'PhucKhoa', N'Nguyễn Khoa Minh Phúc', '0972495038', '12345', 'admin'),
	(N'SonNguyen', N'Nguyễn Ngọc Sơn', '0972493456', '12345', 'admin'),
	(N'TriKy', N'Nguyễn Trí Kỳ', '0972324242', '12345', 'admin'),
	(N'PhuLe', N'Lê Phan Đình Phú', '0972495343', '12345', 'admin'),
	(N'Ozawa', N'Shindo Ozawa', '0972495038', '12345', 'user'),
	(N'TuanDung', N'Nguyễn Tấn Dũng', '0972495038', '12345', 'user')

insert into Articles values
	(N'Điều gì xảy ra nếu bạn độc thân quá lâu? ', N'<html>Không chỉ bạn tôi, có nhiều người khác sau khi đã độc thân một thời gian, họ thường có xu hướng tận hưởng cuộc sống một mình, có phần né tránh các mối quan hệ tình cảm</html>', '2012-02-21T18:10:00', 'okbro.png', 'pending', 1),
	(N'Hello May cung ssssssssssss', N'Cho Son Hello May cung âfasfaf Hello May cung âfasfafHello May cung âfasfaf', '2012-02-21T18:10:00', 'okbro.png', 'pending', 1),
	(N'Hello May cung sssssssss', N'Cho Son Hello May cung âfasfaf Hello May cung âfasfafHello May cung âfasfaf', '2012-02-21T18:10:00', 'okbro.png', 'pending', 1),
	(N'Hello May cung ssssssss', N'Cho Son Hello May cung âfasfaf Hello May cung âfasfafHello May cung âfasfaf', '2012-02-21T18:10:00', 'okbro.png', 'pending', 2),
	(N'Hello May cungssssss', N'Cho Son Hello May cung âfasfaf Hello May cung âfasfafHello May cung âfasfaf', '2012-02-21T18:10:00', 'okbro.png', 'pending', 2),
	(N'Hello May cung sâfafaf', N'Cho Son Hello May cung âfasfaf Hello May cung âfasfafHello May cung âfasfaf', '2012-02-21T18:10:00', 'okbro.png', 'pending', 3),
	(N'Hello May cung âfafafaf', N'Cho Son Hello May cung âfasfaf Hello May cung âfasfafHello May cung âfasfaf', '2012-02-21T18:10:00', 'okbro.png', 'pending', 3)

insert into Comments values
	(1, 1, N'Đỉnh quá anh êy'),
	(1, 1, N'Đỉnh quá anh êy'),
	(2, 2, N'Đỉnh quá anh êy'),
	(3, 3, N'Đỉnh quá anh êy'),
	(1, 2, N'Đỉnh quá anh êy'),
	(2, 2, N'Đỉnh quá anh êy'),
	(3, 4, N'Đỉnh quá anh êy')

/*The query part*/
/*Get all of article have limit in amount word in descirption*/
select * from dbo.HomeView
/*Get data for detail page*/
select * from dbo.DetailView
/*Get data for comment dialog box */
select * from dbo.CommentDialog
/*Get data from the article is composed but don't be censored*/
exec dbo.select_state_article @state = 'pending', @id = 1
/*Get data from the article is composed but have censored*/
exec dbo.select_state_article @state = 'done', @id = 1
/*The update and delte ability have only queried when the state of it is done*/
delete Articles where id_article = 5
update Articles set title_article = N'Chó Phú' where id_article = 2


/*Admin Role*/
/*Display all of article need to censor*/
exec dbo.select_state_article @state = 'done', @id = 1
/*Update state of article*/
exec dbo.udpate_state @id = 1, @id_article =7  , @state = 'done'