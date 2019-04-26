package persistency;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import model.Registry;
import model.Totem;

/**
 *
 * @author aluno
 */
public class RegistryEntity extends Entity {
    
    public void saveRegs(Totem t) {
        try {
            openConn();
            Statement cmd = createCmd();
            
            for(Registry r : t.regs()){
                cmd.executeUpdate(
                "INSERT INTO registro VALUES ("
                +r.entryTime+","+r.leaveTime+","+r.plate);
                
            }
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
    }
    
}
