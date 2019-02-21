package pkg502poo;
/**
 *
 * @author LPS
 */
public class IncrementalState implements PowerUp {
    //Objetos de estato incremental implementam poderes conforme estado do mario:
    public final int iState;
    
    //Contrutor público:
    public IncrementalState(int e){
        iState = e;
    }
    
    //Sobrecargas da interface PowerUp:
    @Override
    public boolean Affects(Mario mario){
        return (mario.iState + 1) == iState;
    }

    @Override
    public void ApllyEffect(Mario mario) {
        if (Affects(mario)){
            mario.iState = iState;
        }
    }
}
