package Auto;
/**
 * Enumerado direção, para representar o universo possível de
 * direções disponíveis compatíveis com o Gps.
 *
 * @author LPS
 */
public enum Direction {
    FRENTE("frente"),
    DIREITA("direita"),
    ESQUERDA("esquerda");
    
    public final String sDirId;
    
    private Direction(String id){
        sDirId = id;
    }
    
    //Renomeando:
    @Override
    public String toString(){
        return sDirId;
    }
}
