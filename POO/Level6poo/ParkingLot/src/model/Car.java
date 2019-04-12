package model;

/**
 *
 * @author LPS
 */
public class Car {
    private Totem totem;
    public final String plate;
    
    private void validate(){
        if(plate == null)
            throw new IllegalArgumentException("Plate cannot be null.");
    }
    
    public Car(String p){
        plate = p;
        validate();
    }
    
    public void park(Totem t){
        if(t != null){
            totem = t;
            totem.regEntry(this);
        }
    }
    
    public void leave(){
        if(totem != null){
            totem.regLeave(this);
            totem = null;
        }
    }

    @Override
    public String toString() {
        return plate;
    }
}
