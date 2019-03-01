package Obstacle;
/**
 *
 * @author LPS
 */
public enum Obstacle {
    ESTRADA(0),
    JACU(1),
    PEDESTRE(2);

    public final int iObstCod;
    
    Obstacle(int id){
        iObstCod = id;
    }

    public int getiObstCod() {
        return iObstCod;
    }

}
