package persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LPS
 */
public abstract class Entity {
    protected static final String user = "root";
    protected static final String passwd = "aluno";
    protected static final String url = "jdbc:mysql://localhost/Estacionamento";
    
    protected Connection conn;
    
    protected Statement createCmd() throws SQLException {
        if(conn == null)
            conn = DriverManager.getConnection(url, user, passwd);
        return conn.createStatement();
    }
    
    protected void closeConn() throws SQLException {
        if(conn != null)
            conn.close();
        conn = null; //Perde referência SOMENTE APÓS fechar a conexão;
    }
}
