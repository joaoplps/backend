package pkg502poo;
/**
 *
 * @author LPS
 */
public class Collectionables extends Item {
    public Collectionables(String sName, boolean bNewVisual, boolean bNewControl, boolean bBox, boolean bWorld) {
        super(sName, bNewVisual, bNewControl, bBox, bWorld);
    }
    
    @Override
    public boolean Affects(Mario mario) {
        return false;
    }
    
}
