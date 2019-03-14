package Obstacle;
/**
 *
 * @author LPS
 */
public enum Obstacle {
    ESTRADA(0, "estrada"),
    JACU(1, "jacu"),
    PEDESTRE(2, "pedestre");

    public final int iObstCod;
    public final String sObstId;
    
    Obstacle(int cod, String id){
        iObstCod = cod;
        sObstId = id;
    }
    
    @Override
    public String toString(){
        return sObstId;
    }
}
