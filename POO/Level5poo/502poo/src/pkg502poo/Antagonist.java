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
    
    public boolean LooserStrat(Strategy strat) {
        return strat.equals(kaKoopaAttack.WinnerStrat);
    }

    private void CauseDamage(Character c) {
        if(c.bOnYoshi) {
            c.bOnYoshi = false;
            return;
        }
        
        if(c.State.iValue == 0) {
            c.Die();
            return;
        }
        
        c.iValue = State.PrevState(c.iValue);
    }

    @Override
    public void Interact(Character c) {
        if(LooserStrat(c.strat))
            return;
        CauseDamage(c);
    }
}