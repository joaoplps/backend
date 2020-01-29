package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Street implements OccurrencesContainer {
    public final String name;
    private final ArrayList<ParkOccurrences> occurrences;
    
    public Street(String n){
        name = n;
        occurrences = new ArrayList();
    }
    
    @Override
    public void registerOccr(ParkOccurrences po) {
        occurrences.add(po);
    }
    
    public int quantosEventos() {
        return occurrences.size();
    }
}
