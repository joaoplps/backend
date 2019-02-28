package pkg503poo;
/**
 * Classe pública automóvel terá objeto carro, que por sua vez terá
 * um objeto do tipo GPS abordo (embutido). É este equipamento que
 * deverá administrar as direções do carro. Além disso, possui
 * sensores que detectam sua velocidade (entre rápida e devagar), e
 * câmeras que passam informações para o gps que controla a direção.
 *
 * @author LPS
 */
public enum Automovel {
    CARRO("carro do joão", Gps.GPS01, 0, Direcao.PARADO);
    
    //Atributos de um objeto carro:
    public final String sTipo;
    Gps CarGps;
    int iCarVelo;
    Direcao CarDir;
    
    //Construtor:
    private Automovel(String tipo, Gps gps, int v, Direcao dir){
        sTipo = tipo;
        CarGps = gps;
        iCarVelo = v;
        CarDir = dir;
    }
}
