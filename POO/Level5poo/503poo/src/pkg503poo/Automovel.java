package pkg503poo;
/**
 * Classe pública automóvel terá objeto carro, que por sua vez terá
 * um objeto do tipo GPS abordo (embutido). É este equipamento que
 * deverá administrar as direções do carro.
 *
 * @author LPS
 */
public enum Automovel {
    CARRO("carro", Gps.GPS1);
    
    //Atributos de um objeto carro:
    public final String sTipo;
    Gps gps1;
    
    private Automovel(String tipo, Gps gps){
        this.sTipo = tipo;
        this.gps1 = gps;
    }
}
