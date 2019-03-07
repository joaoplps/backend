package Auto;
/**
 * Classe pública automóvel terá objeto carro, que por sua vez terá
 * um objeto do tipo GPS abordo (embutido). É este equipamento que
 * deverá administrar as direções do carro. Além disso, possui
 * sensores que detectam sua velocidade (entre rápida e devagar), e
 * câmeras que passam informações para o gps que controla a direção.
 *
 * @author LPS
 */
public enum Automovel {
    CARRO("C-ID01", Gps.GPS01, Sensor.SENS01, 0, Direction.FRENTE);
    
    //Atributos de um objeto carro:
    public final String sCarId;
    Gps CarGps;
    Sensor CarSens;
    int iCarVel;
    public Direction CarDir;
    
    //Construtor:
    private Automovel(String id, Gps gps, Sensor sens, int v, Direction dir){
        sCarId = id;
        CarGps = gps;
        CarSens = sens;
        iCarVel = v;
        CarDir = dir;
    }
    
    //Renomeando:
    @Override
    public String toString(){
        return sCarId;
    }   
    
    //Métodos:
    public void SpeedUp(){
        iCarVel++;
    }
    
    public void StepOnBreak(){
        iCarVel--;
    }
    
    public void TurnRight(){
        CarDir = Direction.DIREITA;
    }
    
    public void TurnLeft(){
        CarDir = Direction.ESQUERDA;
    }
    
    public void KeepFoward(){
        CarDir = Direction.FRENTE;
    }
    
    public void FullStop(){
        CarDir = Direction.FRENTE;
        iCarVel = 0;
    }
}
