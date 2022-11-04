
package DBFunction;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GetConnection {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost; database = QLSV";
    private static String user = "sa";
    private static String password = "123456";

    public static Connection connJDBC() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        
        Connection conn = DriverManager.getConnection(url, user, password);

        return conn;
    }
}
