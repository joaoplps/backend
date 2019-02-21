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
    public boolean Affects(Character character){
        return (character.iState + 1) == iState;
    }

    @Override
    public void ApllyEffect(Character character) {
        if (Affects(character)){
            character.iState = iState;
        }
    }
}
