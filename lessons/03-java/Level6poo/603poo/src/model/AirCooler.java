package model;

/**
 *
 * @author LPS
 */
public class AirCooler {
    private boolean bIsOn;  //Guarda estado on/off;
    private int iTemp;  //Armazena temperatura;
    private final int iMaxTemp = 50;    //Estabelece a temperatura máxima;
    
    public AirCooler(){ //Construtor estado inicial: desligado/temperatura: 0;
        bIsOn = false;
        iTemp = 0;
    }
    
    public void TurnOn(){
        bIsOn = true;
    }
    
    public void TurnOff(){
        bIsOn = false;
    }
    
    public void Higher(){
        if (iTemp < iMaxTemp)
        iTemp++;
    }
    
    public void Lower(){
        if (iTemp > 0)
            iTemp--;
    }
}
