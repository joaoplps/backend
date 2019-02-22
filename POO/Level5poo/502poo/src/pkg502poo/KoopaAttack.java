package pkg502poo;
/**
 *
 * @author LPS
 */
public enum KoopaAttack {
    BASICO(0, "basico"),
    LANCA(1, "lança"),
    DISTANCIA(2, "à distância");
    
    //Atributos:
    final String sKoopaAttackName;
    final int iKoopaAttackRepr;
    
    //Construtor privado (acesso somente pela própria classe):
    private KoopaAttack(int iKoopaAttackRepr, String sKoopaAttackName){
        this.iKoopaAttackRepr = iKoopaAttackRepr;
        this.sKoopaAttackName = sKoopaAttackName;
    }

    //Construtor protegido (acesso pelo mesmo pacote):
    protected String getsKoopaAttackName() {
        return sKoopaAttackName;
    }   
}
