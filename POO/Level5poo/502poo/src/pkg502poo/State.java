package pkg502poo;
/**
 *
 * @author LPS
 */
public enum State {
    PEQUENO(0, "Pequeno"),
    GRANDE(1, "Grande"),
    PODEROSO(2, "Poderoso"),
    VOADOR(2, "Voador");
    
    //Atributos:
    final String sStateName;
    final int iStateRepr;
    
    //Construtor privado (acesso somente pela própria classe):
    private State(int iStateRepr, String sStateName){
        this.iStateRepr = iStateRepr;
        this.sStateName = sStateName;
    }

    //Construtor protegido (acesso pelo mesmo pacote):
    protected String getsStateName() {
        return sStateName;
    }    
}
