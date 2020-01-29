package persistency;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Street;
import model.Vehicle;

/**
 * Entity to get streets names where totens exists
 *
 * @author LPS
 */
public class StreetEnt extends Entity {
    public final ArrayList<Street> streets;
    
    StreetEnt() {
        streets = new ArrayList();
    }
    
    public ArrayList getStreets(Vehicle v) {
        try {
            openConn();
            //getAllRegs();
            final Statement allStreets = createCmd();
            final ResultSet result = allStreets.executeQuery(
                "SELECT registro.entrada, registro.saida, totem.rua"
                + " FROM registo, registro, totem blablablabla;"
            );
            //Workking with results
            while(result.next()){
                String n = result.getString("rua");
                Street street = new Street(n);
                streets.add(street);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
        //Return all regs
        return streets;
    }
}
