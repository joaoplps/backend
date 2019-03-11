package Auto;
/**
 * O GPS está presente no carro e gerencia as direções do mesmo.
 *
 * @author LPS
 */
public enum Gps implements Control {
    GPS01("G-ID01");
    
    //Atributos do GPS:
    public final String sGpsId;
    Sensor GpsSensor;
    
    //Renomeando:
    @Override
    public String toString(){
        return sGpsId;
    }
    
    //Construtor:
    private Gps(String id){
        sGpsId = id;
    }

    @Override
    public void ChangeCarState(Camera cam) {
        switch (cam.iCamObst){
            case JACU:
                
                break;
            case PEDESTRE:
                
                break;
        }
    }
    
}
