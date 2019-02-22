package pkg502poo;
/**
 *
 * @author LPS
 */
public enum State {
    PEQUENO(0),
    GRANDE(1),
    PODEROSO(2),
    VOADOR(2);
    
    //Atributos:
    public final int iValue;
    
    private State(int v) {
        iValue = v;
    }
    
    public static State PrevState(State e) {
        switch(e) {
            case VOADOR:
            case PODEROSO:
                return GRANDE;
            case GRANDE:
                return PEQUENO;
            default:
                return PEQUENO;
        }
    }
}
