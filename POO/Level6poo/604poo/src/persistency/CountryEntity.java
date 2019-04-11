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
public class CountryEntity extends Entity {
    //Object constructor:
    public Country create(int id) throws SQLException { //Erro que não é tratado dentro da função;
        //Criar País:
        Country country = null;
        
        try {
            //Criar query/comando "cmd":
            Statement cmd = createCmd();

            //Executar consulta (cmd) atribuindo ao resultado "res":
            ResultSet result = cmd.executeQuery("select * from country where idcountry=" + id + ";");

            while(result.next()){
                String name = result.getString("name");
                Integer army = result.getInt("army");
                country = createCountry(name, army);
            }
        }
        catch (SQLException e){
            System.out.println("Database Error.");
        }
        finally {
            closeConn();
        }

        return country;
    }
           
    private Country createCountry(String n, Integer a){
        return new Country(n);
    }
}
