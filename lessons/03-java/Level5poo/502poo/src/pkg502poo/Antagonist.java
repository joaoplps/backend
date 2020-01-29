package pkg502poo;
/**
 *
 * @author LPS
 */
public enum Antagonist implements Interactive {
    //Obejtos Enumerados ():
    KOOPA("koopa", KoopaAttack.BASICO),
    TROOPA("troopa", KoopaAttack.LANCA),
    PARAKOOPA("parakoopa", KoopaAttack.DISTANCIA),
    MAGIKOOPA("magikoopa", KoopaAttack.DISTANCIA);
    
    //Atributos:
    public final String sKoopaName;
    KoopaAttack kaKoopaAttack;

    //Construtor:
    private Antagonist(String sKoopaName, KoopaAttack kaKoopaAttack) {
        this.sKoopaName = sKoopaName;
        this.kaKoopaAttack = kaKoopaAttack;
    }
    
    public boolean LooseWithStrat(Strategy s) {
        return s.equals(kaKoopaAttack.WinnerStrat);
    }

    private void CauseDamage(Character c) {
        if(c.bOnYoshi) {
            c.bOnYoshi = false;
            return;
        }
        
        if(c.CharState == State.PEQUENO) {
            c.Die();
            return;
        }
        
        c.CharState = State.PrevState(c.CharState);
    }

    @Override
    public void Interact(Character c) {
        if(LooseWithStrat(c.strat))
            return;
        CauseDamage(c);
    }
}