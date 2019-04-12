package model;

import java.util.HashMap;

/**
 * @author LPS
 */
public class TotemCentral {
    private HashMap<String, Totem> totens;
    private HashMap<String, Car> cars;
    
    TotemCentral(){
        totens = new HashMap();
        cars = new HashMap();

        //Creating two initical totens at time 00:00
        totens.put("X Street", new Totem("X Street"));
        totens.put("Y Street", new Totem("X Street"));
    }
    
    public void newCar(String s){
        
    }
}
