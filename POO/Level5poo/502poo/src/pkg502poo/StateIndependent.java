package pkg502poo;
/**
 *
 * @author LPs
 */
public class StateIndependent extends Item {
    public StateIndependent(String sName, boolean bNewVisual, boolean bNewControl, boolean bBox, boolean bWorld) {
        super(sName, bNewVisual, bNewControl, bBox, bWorld);
    }
    
    //Se o mario não tiver o Yoshi, surtirá efeito:
    @Override
    public boolean Affects(Mario mario){
        return !mario.bOnYoshi;
    }
}
