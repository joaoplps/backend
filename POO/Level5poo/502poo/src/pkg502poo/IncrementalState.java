package pkg502poo;
/**
 *
 * @author LPS
 */
public class IncrementalState extends Item {
    int iState;

    public IncrementalState(String sName, boolean bNewVisual, boolean bNewControl, boolean bBox, boolean bWorld) {
        super(sName, bNewVisual, bNewControl, bBox, bWorld);
    }
    
    @Override
    public boolean Affects(Mario mario){
        return (mario.iState + 1) == iState;
    }
}
