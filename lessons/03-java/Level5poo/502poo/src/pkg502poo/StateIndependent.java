package pkg502poo;
/**
 *
 * @author LPs
 */
public class StateIndependent implements PowerUp {
    //Se o mario não tiver o Yoshi, surtirá efeito:
    @Override
    public boolean Affects(Character character){
        return !character.bOnYoshi;
    }
    
    //Aplicação do efeito:
    @Override
    public void ApllyEffect(Character character) {
        //Muda o estado da variavel:
        character.bOnYoshi = true;
    }
}
