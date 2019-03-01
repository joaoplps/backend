package Obstacle;
/**
 *
 * @author LPS
 */
public enum Obstacle {
    ESTRADA(1),
    JACU(2),
    PEDESTRE(3);

    int iObstId;
    
    Obstacle(int id){
        iObstId = id;
    }

    public int getiObstId() {
        return iObstId;
    }

}
