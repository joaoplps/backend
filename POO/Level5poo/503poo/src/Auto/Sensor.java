package Auto;

import Obstacle.Obstacle;

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
        switch (cam.CamObst){
            case JACU:
                if (cam == Camera.CAMF)
                    Automovel.CARRO.MatchFrontVel();
                else if (cam == Camera.CAML)
                    if (cam.CamObst.JacuState == AutoState.ULTRAPASSANDO){
                        Automovel.CARRO.StayCenter();
                        Automovel.CARRO.MatchFrontVel();
                    }
                    else if (cam.CamObst.JacuState == AutoState.SEM_INTENCOES)
                        System.out.println("That's ok dude...");
                    else if (cam.CamObst.JacuState == AutoState.SE_PREPARANDO){
                        if (Automovel.CARRO.iCarVel > Obstacle.JACU.iJacuVel)
                            System.out.println("Holding on...");
                        else
                            Automovel.CARRO.PullSide();
                    }
                
                break;
            case PEDESTRE:
                if (cam == Camera.CAMF){
                    if (Automovel.CARRO.iCarVel > 1)
                        Automovel.CARRO.StepOnBreak();
                    else
                        Automovel.CARRO.FullStop();
                }

                break;
            case ESTRADA:
                if (cam == Camera.CAMF)
                    Automovel.CARRO.SpeedUp();

                break;
        }
    }
}
