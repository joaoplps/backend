package pkg502poo;
/**
 *
 * @author LPS
 */
public class IncrementalState implements PowerUp {
    //Objetos de estato incremental implementam poderes conforme estado do mario:
    public final State isState;
    
    //Contrutor público:
    public IncrementalState(State s){
        this.isState = s;
    }
    
    //Sobrecargas da interface PowerUp:
    @Override
    public boolean Affects(Character c){
        return (c.CharState.iValue + 1) == isState.iValue;
    }

    @Override
    public void ApllyEffect(Character c) {
        if (Affects(c)){
            c.CharState = isState;
        }
    }
}