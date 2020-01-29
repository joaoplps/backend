package pkg101poo;
/**
 * Instruções:
 * 1. Crie um projeto java default no NetBeans;
 * 2. Veja se o arquivo é uma Classe, ou o Main.java;
 * 3. Coloque os arquivos dentro do diretório correto e execute.
 *
 * @author João Pedro LPS
 * Ex.18 - Re-criação da classe Cachorro, privatizando os atributos:
 */
public class Cachorro{
    //Atributos:
    private String sNomedog;
    private String sRacadog;
    private String sCordog;
    private double dPesodog;
    
    //Métodos:
    public void brincar(){
        dPesodog = dPesodog - 0.5;
    }
    public void comer(){
        dPesodog = dPesodog + 0.6;
    }
    public void latir(){
        System.out.println("Au!");
    }
    
    //Métodos Get & Set dos atributos:
    public void setsNomedog(String sNomedog){
        this.sNomedog=sNomedog;
    }
    public String getsNomedog(){
        return sNomedog;
    }
    public void setsRacadog(String sRacadog){
        this.sRacadog=sRacadog;
    }
    public String getsRacadog(){
        return sRacadog;
    }
    public void setsCordog(String sCordog){
        this.sCordog=sCordog;
    }
    public String getsCordog(){
        return sCordog;
    }
    public void setdPesodog(int dPesodog){
        this.dPesodog=dPesodog;
    }
    public double getdPesodog(){
        return dPesodog;
    }
    
}
