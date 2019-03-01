package Auto;

import Obstacle.Obstacle;

/**
 * São três as câmeras, uma frontal e duas laterais.
 *
 * @author LPS
 */
public enum Camera {
    CAMF(0, "frontal"),
    CAME(0, "esquerda"),
    CAMD(0, "direita");
    
    public final String sCamId;
    int iCamObstCod;
    
    private Camera(int obst, String id){
        sCamId = id;
        iCamObstCod = obst;
    }
    
    @Override
    public String toString(){
        return sCamId;
    }
    
    public int getCamObstCod(){
        return iCamObstCod;
    }
    
    public void FilmObstacle(Obstacle obst){
        iCamObstCod = obst.getiObstCod();
    }
}
