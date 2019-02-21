package pkg502poo;
/**
 *
 * @author LPS
 */
public class IncrementalState implements PowerUp {
    //Objetos de estato incremental implementam poderes conforme estado do mario:
    public final State IsState;
    
    //Contrutor público:
    public IncrementalState(State IsState){
        this.IsState = IsState;
    }
    
    //Sobrecargas da interface PowerUp:
    @Override
    public boolean Affects(Character character){
        return (character.CharState.iRepr + 1) == IsState.iRepr;
    }

    @Override
    public void ApllyEffect(Character character) {
        if (Affects(character)){
            character.CharState = IsState;
        }
    }
}