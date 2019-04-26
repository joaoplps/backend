package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Totem. 
 *
 * @author LPS
 */
public class Totem {
    private static final int firsthour = 0;
    
    private int time;
    public final String street;
    
    private HashMap<Car, Integer> cars;
    private ArrayList<Registry> regs;
        
    private void validate(){
        if(time < 0)
            throw new IllegalArgumentException("Totem time cannot be negative.");
        if(street == null)
            throw new IllegalArgumentException("Street cannot be null.");
    }
    
    public Totem(String s){
        street = s;
        time = firsthour;
        cars = new HashMap();
        regs = new ArrayList();
        validate();
    }
    
    public void regEntry(Car c){
        if(c != null && !cars.containsKey(c)){
            cars.put(c, time);
            System.out.println("The car " + c.plate + " parked at " + street + ".");
        }
    }

    public void regLeave(Car c){
        int entry;
        int leave;
        
        if(c == null || !cars.containsKey(c))
            return;
        
        entry = cars.get(c);
        leave = time;
        
        regs.add(new Registry(entry, leave, c.plate));
        cars.remove(c);
        
        System.out.println("The car " + c.plate + " left " + street + ".");
    }
    
    public void increaseTime(){
        time++;
    }

    @Override
    public String toString() {
        return street + ": " + time;
    }
}
