package persistency;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.ParkOccurrences;
import model.Vehicle;

/**
 * Entity to get entry and leave time from registers
 *
 * @author LPS
 */
public class ParkOccurrencesEntity extends Entity {
    public final ArrayList<ParkOccurrences> occurrs;

    ParkOccurrencesEntity() {
        occurrs = new ArrayList();
    }
    
    public ArrayList getRegisters(Vehicle v) {
        try {
            openConn();
            //getAllRegs();
            final Statement allOccurrencesByPlate = createCmd();
            final ResultSet result = allOccurrencesByPlate.executeQuery(
                "SELECT * FROM registro WHERE placa='" + v.plate + "';"
            );
            //Workking with results
            while(result.next()){
                int e = result.getInt("entrada");
                int l = result.getInt("saida");
                occurrs.add(new ParkOccurrences(e, l));
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
        //Return all regs
        return occurrs;
    }
}
