package pkg502poo;
/**
 *
 * @author LPS
 */
public enum Interaction {
    FRENTE(0, "andar para frente"),
    TRAS(1, "andar para trás"),
    PULO(2, "pular");
    
    //Atributos:
    final String sInteractionName;
    final int iInteractionRepr;
    
    //Construtor privado (acesso somente pela própria classe):
    private Interaction(int iInteractionRepr, String sInteractionName){
        this.iInteractionRepr = iInteractionRepr;
        this.sInteractionName = sInteractionName;
    }

    //Construtor protegido (acesso pelo mesmo pacote):
    protected String getsInteractionName() {
        return sInteractionName;
    }
    
    
}
