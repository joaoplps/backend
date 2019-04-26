package persistency;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import model.Totem;

/**
 *
 * @author aluno
 */
public class TotemEntity extends Entity {
    private final HashMap<Totem, Integer> dbMapping;
    //Public totem list
    public final ArrayList<Totem> totens;
    
    TotemEntity() {
        dbMapping = new HashMap();
        totens = new ArrayList();
        createAll();
        totens.addAll(dbMapping.keySet());
    }
    
    private void createAll() {
        try {
            openConn();
            Statement cmd = createCmd();
            //Get all totens 
            ResultSet result = cmd.executeQuery("SELECT * FROM totem;");
            
            while(result.next())
                dbMapping.put(new Totem(result.getString("rua")), result.getInt("id"));
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
    }
}