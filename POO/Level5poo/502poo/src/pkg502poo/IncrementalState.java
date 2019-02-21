package pkg502poo;
/**
 *
 * @author LPS
 */
public class IncrementalState implements PowerUp {
    public final int iState;
    
    public IncrementalState(int e){
        iState = e;
    }
    
    @Override
    public boolean Affects(Mario mario){
        return (mario.iState + 1) == iState;
    }
}
