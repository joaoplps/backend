package Auto;
/**
 * Enumerado direção, para representar o universo possível de
 * direções disponíveis compatíveis com o Gps.
 *
 * @author LPS
 */
public enum Direction {
    FRENTE(0, "frente"),
    DIREITA(1, "direita"),
    ESQUERDA(2, "esquerda");
    
    public final String sDirId;
    public final int iDirCod;
    
    private Direction(int cod, String id){
        iDirCod = cod;
        sDirId = id;
    }
    
    //Renomeando:
    @Override
    public String toString(){
        return sDirId;
    }
}
