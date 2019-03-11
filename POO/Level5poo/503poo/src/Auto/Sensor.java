package Auto;
/**
 * Os sensores servem para detecção de velocidade:
 * Rápido / Devagar.
 *
 * @author LPS
 */
public enum Sensor implements Control {
    SENS01("S-ID01-FRN"),
    SENS02("S-ID02-LAT");
    
    //Atributos do GPS:
    public final String sSensId;
    
    //Construtor:
    private Sensor(String id){
        sSensId = id;
    }
    
    //Renomeando:
    @Override
    public String toString(){
        return sSensId;
    }

    @Override
    public void ChangeCarState(Camera cam) {
        switch (cam.iCamObst){
            case JACU:
                Automovel.CARRO.KeepSpeed();
                
                break;
            case PEDESTRE:
                if (Automovel.CARRO.iCarVel > 1)
                    Automovel.CARRO.StepOnBreak();
                else
                    Automovel.CARRO.FullStop();
                
                break;
            case ESTRADA:
                Automovel.CARRO.SpeedUp();
                
                break;
        }
    }
}
