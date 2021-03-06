package model;

import java.util.ArrayList;
import persistency.ParkOccurrencesEntity;
import persistency.PersistencyLayer;

/**
 * Facade Pattern
 * 
 * A company has several vehicles;
 * 
 * In an existing API (ParkingLot project db), we wanna know:
 * - The street witch has more parking spots;
 * - The car that parked the most;
 * - Parked hours from a car;
 * - All parking cost;
 *
 * @author LPS
 */
public class Company {
    public final ArrayList<Vehicle> vehicles;
    public final ArrayList<Street> streets;
    
    Company(){
        vehicles = new ArrayList();
        streets = new ArrayList();
    }
    
    public void register(String plate, VehicleType type) {
        Vehicle v = new Vehicle(type, plate); //Getting ref
        vehicles.add(v); //Adding to the company list of vehicles
        ArrayList<ParkOccurrences> pos = PersistencyLayer.registry.getRegisters(v);
        for(ParkOccurrences po : pos) //Adding all po in query result to vehicle
            v.registerOccr(po);
    }
}
