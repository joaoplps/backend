package pkg502poo;
/**
 *
 * @author LPS
 */
public abstract class Item implements Increment {
    //Atributos:
    String sName;
    boolean bNewVisual, bNewControl;
    boolean bBox, bWorld;
    
    //Construtores:    
    public Item(String sName, boolean bNewVisual, boolean bNewControl, boolean bBox, boolean bWorld){
        this.sName = sName;
        this.bNewVisual = bNewVisual;
        this.bNewControl = bNewControl;
        this.bBox = bBox;
        this.bWorld = bWorld;
    }
}