package Auto;
/**
 * Os sensores servem para detecção de velocidade:
 * Rápido / Devagar.
 *
 * @author LPS
 */
public enum Sensor implements Control {
    SENS01("S-ID01", 0);
    
    //Atributos do GPS:
    public final String sSensId;
    int iMainVel; //(2)RÁPIDO, (1)DEVAGAR e (0)PARADO
    
    //Construtor:
    private Sensor(String id, int vel){
        sSensId = id;
        iMainVel = vel;
    }
    
    //Renomeando:
    @Override
    public String toString(){
        return sSensId;
    }

    //Método de modificação da velocidade do carro:
    public void MudaVel(Automovel auto) {
        if (iMainVel != auto.iCarVel)
            auto.iCarVel = iMainVel;
    }

    @Override
    public void ChangeCarState(Camera cam) {
        switch (cam.iCamObst){
            case JACU:
                
                break;
            case PEDESTRE:
                //Full stop
                break;
        }
    }
}
