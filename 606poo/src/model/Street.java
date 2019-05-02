package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Street implements OccrContainer {
    public final String name;
    private final ArrayList<ParkOccr> occurrences;
    
    Street(String n){
        name = n;
        occurrences = new ArrayList();
    }
    
    @Override
    public void registerOccr(ParkOccr po) {
        occurrences.add(po);
    }
    
    public int quantosEventos() {
        return occurrences.size();
    }
}
