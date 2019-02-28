package pkg503poo;
/**
 * O GPS está presente no carro e gerencia as direções do mesmo.
 *
 * @author LPS
 */
public enum Gps implements GpsControl {
    GPS01("ID01", Direcao.PARADO);
    
    //Atributos do GPS:
    public final String sGpsId;
    Direcao MainDir; //FRENTE, DIREITA, PARADO ou ESQUERDA
    
    //Renomeando:
    public String StringtoString(){
        return sGpsId;
    }
    
    //Construtor:
    private Gps(String id, Direcao dir){
        sGpsId = id;
        MainDir = dir;
    }

    //Método de modificação de direção do carro:
    @Override
    public void MudaDir(Automovel auto) {
        if (MainDir != auto.CarDir)
            auto.CarDir = MainDir;
    }
}
