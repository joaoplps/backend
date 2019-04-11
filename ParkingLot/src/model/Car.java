package model;

/**
 *
 * @author LPS
 */
public class Car {
    private Totem totem;
    public final String plate;
    
    public Car(String p){
        plate = p;
        validate();
    }
    
    private void validate(){
        if(plate == null)
            throw new IllegalArgumentException("Plate cannot be null.");
    }
    
    public void park(Totem t){
        totem = t;
        totem.regEntry(this);
    }
    
    public void leave(){
        totem.regLeave(this);
        totem = null;
    }
}
