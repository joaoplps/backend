package pkg502poo;
/**
 *
 * @author LPS
 */
public class IncrementalState implements PowerUp {
    //Objetos de estato incremental implementam poderes conforme estado do mario:
    public final State isState;
    
    //Contrutor público:
    public IncrementalState(State isState){
        this.isState = isState;
    }
    
    //Sobrecargas da interface PowerUp:
    @Override
    public boolean Affects(Character character){
        return (character.CharState.iStateRepr + 1) == isState.iStateRepr;
    }

    @Override
    public void ApllyEffect(Character character) {
        if (Affects(character)){
            character.CharState = isState;
        }
    }
}