package pkg503poo;
/**
 * Os sensores servem para detecção de velocidade:
 * Rápido / Devagar.
 *
 * @author LPS
 */
public enum Sensor implements SensorControl {
    SENS01("S-ID01", 0);
    
    //Atributos do GPS:
    public final String sSensId;
    int iMainVel; //RÁPIDO ou DEVAGAR
    
    //Renomeando:
    public String StringtoString(){
        return sSensId;
    }
    
    //Construtor:
    private Sensor(String id, int vel){
        sSensId = id;
        iMainVel = vel;
    }

    //Método de modificação de direção do carro:
    @Override
    public void MudaVel(Automovel auto) {
        if (iMainVel != auto.iCarVel)
            auto.iCarVel = iMainVel;
    }
}
