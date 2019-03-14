package Auto;

import Obstacle.Obstacle;

/**
 * Câmeras, frontal / lateral.
 *
 * @author LPS
 */
public enum Camera {
    CAMF(Obstacle.ESTRADA, "frontal"),
    CAML(Obstacle.ESTRADA, "lateral");
    
    public final String sCamId;
    Obstacle iCamObst;
    
    private Camera(Obstacle obst, String id){
        sCamId = id;
        iCamObst = obst;
    }
    
    @Override
    public String toString(){
        return sCamId;
    }
    
    public Obstacle getCamObstCod(Camera cam){
        return cam.iCamObst;
    }
    
    public void FilmObstacle(Camera cam, Obstacle obst){
        cam.iCamObst = obst;
    }
}
