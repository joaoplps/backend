package Auto;
/**
 * O GPS está presente no carro e gerencia as direções do mesmo.
 *
 * @author LPS
 */
public enum Gps {
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
    
    //Método de leitura de inf:
    public void updateGps(Camera cam){
        switch (cam.getCamObstCod()){
            case 1:
                //Logic for the obstacle here
                break;
            case 2:
                //Logic for the obstacle here
                break; 
            //(...)
        }
    }
    
    //Método de modificação de direção do carro:
    public void MudaDir(Automovel auto) {
        if (MainDir != auto.CarDir)
            auto.CarDir = MainDir;
    }
}
