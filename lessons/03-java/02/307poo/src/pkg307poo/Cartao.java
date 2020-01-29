package pkg307poo;
/**
 * Classe Cartao
 * 
 * @author João Pedro LPS
 */
public class Cartao {
    //Atributos Privados:
    private String sNomePassageiro;
    private String sCategoria;
    private double dCredito;

    //Encapsulamento:
    public String getsNomePassageiro() {
        return sNomePassageiro;
    }

    public void setsNomePassageiro(String sNomePassageiro) {
        this.sNomePassageiro = sNomePassageiro;
    }

    public String getsCategoria() {
        return sCategoria;
    }

    public void setsCategoria(String sCategoria) {
        this.sCategoria = sCategoria;
    }

    public double getdCredito() {
        return dCredito;
    }

    public void setdCredito(double dCredito) {
        this.dCredito = dCredito;
    }
    
    //Método Construtor:
    public Cartao(){
    }
    
    public Cartao(String sNomePassageiro, String sCategoria, double dCredito){
        this.sNomePassageiro = sNomePassageiro;
        this.sCategoria = sCategoria;
        this.dCredito = dCredito;
    }
    
}
