package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Vehicle implements OccurrencesContainer {
    private final VehicleType type;
    public final String plate;
    private final ArrayList<ParkOccurrences> occurrences;
    
    public Vehicle(VehicleType t, String p){
        type = t;
        plate = p;
        occurrences = new ArrayList();
    }
    
    public int parkedTime() {
        int sum = 0;
        for(ParkOccurrences po : occurrences)
            sum += po.period();
        return sum;
    }
    
    public double totalSpent() {
        return parkedTime() * Tax.byType(type).value;
    }

    @Override
    public void registerOccr(ParkOccurrences po) {
        occurrences.add(po);
    }
}
