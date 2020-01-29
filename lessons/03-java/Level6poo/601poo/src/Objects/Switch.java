package Objects;

/**
 * Interruptor: liga e desliga as luzes.
 *
 * @author aluno
 */
public class Switch implements Onnable {
    //Atributos:
    public Light lightId;
    
    //Construtor recebe a Luz:
    public Switch(Light l){
        lightId = l;
    }
    
    //Métodos:
    @Override
    public void TurnOn(){
        lightId.TurnOn();
    }
    
    @Override
    public void TurnOff(){
        lightId.TurnOff();
    }
}
