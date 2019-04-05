package persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static persistency.CountryEntity.url;

/**
 *
 * @author LPS
 */
public abstract class Entity {
    protected static final String user = "root";
    protected static final String passwd = "aluno";
    protected static final String url = "jdbc:mysql://localhost/war";
    
    protected Connection conn;
    
    protected Statement createCmd() throws SQLException {
        conn = DriverManager.getConnection(url, user, passwd);
        return conn.createStatement();
    }
    
    protected void closeConn() throws SQLException {
        if(conn != null)
            conn.close();
    }
}
