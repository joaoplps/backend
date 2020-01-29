package Auto;

/**
 *
 * @author LPS
 */
public enum AutoState {
    ULTRAPASSANDO(0, "ultrapassando"),
    SE_PREPARANDO(1, "se preparando para ultrapassar"),
    SEM_INTENCOES(2, "sem intenções");

    public final int iStateCod;
    public final String sStateId;
    
    AutoState(int cod, String id){
        iStateCod = cod;
        sStateId = id;
    }
    
    @Override
    public String toString(){
        return sStateId;
    }
}
