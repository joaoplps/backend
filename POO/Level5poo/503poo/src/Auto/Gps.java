package Auto;
/**
 * O GPS está presente no carro e gerencia as direções do mesmo.
 *
 * @author LPS
 */
public enum Gps implements Control {
    GPS01("G-ID01", Direction.FRENTE);
    
    //Atributos do GPS:
    public final String sGpsId;
    Direction MainDir; //FRENTE, DIREITA, PARADO ou ESQUERDA
    Sensor GpsSensor;
    
    //Renomeando:
    @Override
    public String toString(){
        return sGpsId;
    }
    
    //Construtor:
    private Gps(String id, Direction dir){
        sGpsId = id;
        MainDir = dir;
    }
    
    //Método de modificação da direção do carro:
    public void MudaDir(Automovel auto) {
        if (MainDir != auto.CarDir)
            auto.CarDir = MainDir;
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
