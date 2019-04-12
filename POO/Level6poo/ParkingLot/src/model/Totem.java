package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author LPS
 */
class Totem {
    private int time;
    public final String street;
    
    private HashMap<Car, Integer> cars;
    private ArrayList<Registry> regs;
    
    public Totem(String s, int t){
        street = s;
        time = t;
        
        cars = new HashMap();
        regs = new ArrayList();
        validate();
    }
    
    private void validate(){
        if(time < 0)
            throw new IllegalArgumentException("Totem time cannot be negative.");
        if(street == null)
            throw new IllegalArgumentException("Street cannot be null.");
    }
    
    public void regEntry(Car c){
        cars.put(c, time);
    }

    public void regLeave(Car c){
        int entry = cars.get(c);
        int leave = time;
        
        regs.add(new Registry(entry, leave));
    }
    
    public void increaseTime(){
        time++;
    }
}
