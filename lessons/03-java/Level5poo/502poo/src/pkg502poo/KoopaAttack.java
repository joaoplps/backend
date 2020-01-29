package pkg502poo;
/**
 *
 * @author LPS
 */
public enum KoopaAttack {
    BASICO(new Strategy(Interaction.PULO)),
    LANCA(new Strategy(Interaction.FRENTE, Interaction.PULO)),
    DISTANCIA(new Strategy(Interaction.TRAS, Interaction.PULO));
    
    //Atributos:
    public final Strategy WinnerStrat;
    
    //Construtor privado (acesso somente pela própria classe):
    private KoopaAttack(Strategy strat){
        WinnerStrat = strat;
    }
}