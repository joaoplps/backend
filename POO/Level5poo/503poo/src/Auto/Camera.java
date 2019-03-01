package Auto;
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
    int iCamObst;
    
    private Camera(int cam, String id){
        sCamId = id;
        iCamObst = cam;
    }
    
    @Override
    public String toString(){
        return sCamId;
    }
    
    public int getCamObst(){
        return iCamObst;
    }
    
    public void FilmObstacle(Camera cam, int obst){
        cam.iCamObst = obst;
    }
}
