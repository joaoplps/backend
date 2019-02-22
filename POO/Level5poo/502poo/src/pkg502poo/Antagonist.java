package pkg502poo;
/**
 *
 * @author LPS
 */
public enum Antagonist {
    //Obejtos Enumerados ():
    KOOPA("koopa", KoopaAttack.BASICO),
    TROOPA("troopa", KoopaAttack.LANCA),
    PARAKOOPA("parakoopa", KoopaAttack.DISTANCIA),
    MAGIKOOPA("magikoopa", KoopaAttack.DISTANCIA);
    
    public final String sKoopaName;
    KoopaAttack kaKoopaAttack;

    private Antagonist(String sKoopaName, KoopaAttack kaKoopaAttack) {
        this.sKoopaName = sKoopaName;
        this.kaKoopaAttack = kaKoopaAttack;
    }
}