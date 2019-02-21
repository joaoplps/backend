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
    final int iRepr;
    
    //Construtor privado (acesso somente pela própria classe):
    private State(int iRepr, String sStateName){
        this.iRepr = iRepr;
        this.sStateName = sStateName;
    }

    //Construtor protegido (acesso pelo mesmo pacote):
    protected String getsStateName() {
        return sStateName;
    }
    
}
