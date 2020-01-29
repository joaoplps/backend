package pkg101poo;
/**
 * Instruções:
 * 1. Crie um projeto java default no NetBeans;
 * 2. Veja se o arquivo é uma Classe, ou o Main.java;
 * 3. Coloque os arquivos dentro do diretório correto e execute.
 *
 * @author João Pedro LPS
 * Ex.16 - Classe Leitor (main=117poo.java), criação e atributos
 * privados:
 */
public class Leitor {
    //Atributos:
    private String sNomeLeitor;
    private int iQtdRead;
    
    //Métodos:
    public void setsNomeLeitor(String sNomeLeitor){
        this.sNomeLeitor = sNomeLeitor;
    }
    
    public String getsNomeLeitor(){
        return sNomeLeitor;
    }
    public void setiQtdRead(int iQtdRead){
        this.iQtdRead=iQtdRead;
    }
    public int getiQtdRead(){
        return iQtdRead;
    }
    
}
