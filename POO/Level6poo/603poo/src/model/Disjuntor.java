package model;

/**
 *
 * @author LPS
 */
public class Disjuntor {
    private boolean bIsOn;
    
    public Disjuntor(){
        bIsOn = false;
    }
    
    public void TurnOn(){
        bIsOn = true;
    }
    
    public void TurnOff(){
        bIsOn = false;
    }
}
