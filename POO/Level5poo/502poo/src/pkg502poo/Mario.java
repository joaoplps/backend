package pkg502poo;
/**
 *
 * @author LPS
 */
public class Mario {
    //Atributos:
    int iState; //(0) Pequeno, (1) Grande e (2) - Poderoso
    boolean bOnYoshi;
    
    //Construtores:    
    public Mario(int iState, boolean bOnYoshi) {
        this.iState = iState;
        this.bOnYoshi = bOnYoshi;
    }
    
    //Criação de Objetos:
    Mario mario = new Mario(0, false);

    public int getiState() {
        return iState;
    }

    public boolean isbOnYoshi() {
        return bOnYoshi;
    }
}