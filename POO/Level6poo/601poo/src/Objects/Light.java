package Objects;
/**
 * Liga, desliga e queima:
 *
 * @author LPS
 */
public class Light {
    private boolean bOn, bBusted;
    public final int iColor;
    
    public Light (int c) {
        bOn = false;
        bBusted = false;
        iColor = c;
    }
    
    //Métodos:
    public boolean IsOn () {
        return bOn;
    }
    
    public boolean IsBusted () {
        return bBusted;
    }
    
    public void TurnOn () {
        if (!bBusted) //Só liga se não estiver queimada;
            bOn = true;
    }
    
    public void TurnOff () {
        bOn = false;
    }
    
    public void Destroy () {
        bBusted = true;
        TurnOff(); //
    }
}
