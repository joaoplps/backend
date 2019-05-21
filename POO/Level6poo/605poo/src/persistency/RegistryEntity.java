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
            final Integer idTotem = PersistencyLayer.totem.dbMapping.get(t);
            final int nRegs = t.regs().size();
            int idLastReg;
            
            for(Registry r : t.regs())
                insertReg(r);
            
            idLastReg = lastReg();
            for(Registry r : t.regs())
                insertRegTotem(idTotem, idLastReg--);
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
    }
    
    private int lastReg() throws SQLException {
        final Statement getHigherId = createCmd();
        final ResultSet result = getHigherId.executeQuery("SELEC MAX(id) AS id FROM registro");

        Integer id = 1;
        if(result.next())
            id = result.getInt("id");
        return id;
    } 

    private void insertReg(Registry r) throws SQLException {
        Statement comando = createCmd();
        comando.executeUpdate("INSERT INTO registro(entrada,saida,placa) VALUES (" + r.entryTime + "," + r.leaveTime + ",'" + r.plate + "');");
    }

    private void insertRegTotem(Integer idTotem, int idRegistro) throws SQLException {
        Statement comandoTotemRegistro = createCmd();
        comandoTotemRegistro.executeUpdate("INSERT INTO totem_registro(tid, rid) VALUES(" + idTotem + "," + idRegistro + ");");
    }
    
}
