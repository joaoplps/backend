package pkg503poo;
/**
 * O GPS está presente no carro e gerencia as direções do mesmo.
 *
 * @author LPS
 */
public enum Gps {
    GPS1("gps1", null);
    
    //Atributos do GPS:
    public final String sGpsId;
    Direcao MainDir; //(0) FRENTE, (1)DIREITA, (2)PARADO, (3)ESQUERDA
    
    //Renomeando:
    public String StringtoString(){
        return sGpsId;
    }
    
    //Construtor:
    private Gps(String id, Direcao dir){
        this.sGpsId = id;
        this.MainDir = dir;
    }
}
