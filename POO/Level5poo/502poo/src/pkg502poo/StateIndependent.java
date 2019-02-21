package pkg502poo;
/**
 *
 * @author LPs
 */
public class StateIndependent implements PowerUp {
    //Se o mario não tiver o Yoshi, surtirá efeito:
    @Override
    public boolean Affects(Mario mario){
        return !mario.bOnYoshi;
    }

    @Override
    public void ApllyEffect(Mario mario) {
        mario.bOnYoshi = true;
        
    }
}
