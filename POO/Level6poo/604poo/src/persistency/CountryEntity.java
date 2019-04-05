package persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.board.Country;

/**
 * Fábrica: entidade País.
 *
 * @author LPS
 */
public class CountryEntity {
    protected static final String user = "root";
    protected static final String passwd = "aluno";
    protected static final String url = "jdbc:mysql://localhost/war";
    
    //Object constructor:
    public Country create(int id) throws SQLException { //Erro que não é tratado dentro da função;
        //Criar conexão "conn" e país:
        Connection conn = null;
        Country country = null;
        
        try {
            conn = DriverManager.getConnection(url, user, passwd);

            //Criar query/comando "cmd":
            Statement cmd = conn.createStatement();

            //Executar consulta (cmd) atribuindo ao resultado "res":
            ResultSet res = cmd.executeQuery("select * from country where idcountry=" + id + ";");

            while(res.next()){
                String name = res.getString("name");
                Integer army = res.getInt("army");
                country = createCountry(name, army);
            }
        }
        catch (SQLException e){
            System.out.println("Database Error.");
        }
        finally {
            if(conn != null)
                conn.close();
        }

        return country;
    }
           
    private Country createCountry(String n, Integer a){
        return new Country(n);
    }
}
