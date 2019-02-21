package pkg502poo;
/**
 *
 * @author LPS
 */
public enum Character {
    //Criação de objetos enumerados:
    MARIO("mario", State.PEQUENO, false),
    LUIGGI("luiggi", State.PEQUENO, false);
    
    //Atributos:
    public final String sName;
    State CharState; //(0) Pequeno, (1) Grande e (2) - Poderoso
    boolean bOnYoshi;
    
    //Método sobrecarregado:
    public String StringtoString(){
        return "It's me "+ sName;
    }
    
    //Construtores:    
    private Character(String sName, State CharState, boolean bOnYoshi) {
        this.sName = sName;
        this.CharState = CharState;
        this.bOnYoshi = bOnYoshi;
    }
    
    protected State getCharState() {
        return CharState;
    }

    protected boolean isbOnYoshi() {
        return bOnYoshi;
    }
}