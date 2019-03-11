package Auto;

/**
 *
 * @author LPS
 */
public enum Position {
    CENTER(0, "meio"),
    SIDE(1, "lateral");
    
    public final String sPosId;
    public final int iPosCod;
    
    private Position(int cod, String id){
        iPosCod = cod;
        sPosId = id;
    }
    
    //Renomeando:
    @Override
    public String toString(){
        return sPosId;
    }
}
