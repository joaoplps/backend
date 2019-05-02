package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Vehicle implements OccrContainer {
    private final VehicleType type;
    private final String plate;
    private final ArrayList<ParkOccr> occurrences;
    
    Vehicle(VehicleType t, String p){
        type = t;
        plate = p;
        occurrences = new ArrayList();
    }
    
    public int parkedTime() {
        int sum = 0;
        for(ParkOccr po : occurrences)
            sum += po.period();
        return sum;
    }
    
    public double totalSpent() {
        return parkedTime() * Tax.byType(type).value;
    }

    @Override
    public void registerOccr(ParkOccr po) {
        occurrences.add(po);
    }
}
