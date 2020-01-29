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
    Obstacle CamObst;
    
    private Camera(Obstacle obst, String id){
        sCamId = id;
        CamObst = obst;
    }
    
    @Override
    public String toString(){
        return sCamId;
    }
    
    public Obstacle getCamObstCod(Camera cam){
        return cam.CamObst;
    }
    
    public void FilmObstacle(Camera cam, Obstacle obst){
        cam.CamObst = obst;
    }
}
