package pkg502poo;
/**
 *
 * @author LPS
 */
public enum Character {
    //Criação de objetos enumerados:
    MARIO("mario", 0, false),
    LUIGGI("luiggi", 0, false);
    
    //Atributos:
    public final String sName;
    int iState; //(0) Pequeno, (1) Grande e (2) - Poderoso
    boolean bOnYoshi;
    
    //Construtores:    
    private Character(String sName, int iState, boolean bOnYoshi) {
        this.sName = sName;
        this.iState = iState;
        this.bOnYoshi = bOnYoshi;
    }
    
    protected int getiState() {
        return iState;
    }

    protected boolean isbOnYoshi() {
        return bOnYoshi;
    }
}