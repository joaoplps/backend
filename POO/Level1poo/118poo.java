package pkg101poo;
/**
 * Instruções:
 * 1. Crie um projeto java default no NetBeans;
 * 2. Veja se o arquivo é uma Classe, ou o Main.java;
 * 3. Coloque os arquivos dentro do diretório correto e execute.
 *
 * @author João Pedro LPS
 * Ex.15 - Classe Livro (main=117poo.java), criação e atributos
 * privados:
 */
public class Livro {
    //Atributos:
    private String sTitle;
    private String sAuth;
    private String sGender;
    private int iQtdPgs;
    
    //Métodos:
    public void VerifyRead(Leitor leitor){
        if(leitor.getiQtdRead() >= iQtdPgs) System.out.println("Essa pessoa lerá o livro."); //Comparação entre dois objetos diferentes;
        else{System.out.println("São muitas páginas! Essa pessoa não lerá o livro.");}
    }
    
    //Métodos get & set: Através de métodos públicos, controlar os atributos privados. Um tipo de controle de segurança para que um atributo não seja modificado por uma classe desconhecida (integridade dos dados).
    public void setsTitle(String sTitle){
        this.sTitle=sTitle;
    }
    public String getstitle(){
        return sTitle;
    }
    public void setsAuth(String sAuth){
        this.sAuth=sAuth;
    }
    public String getsAuth(){
        return sAuth;
    }
    public void setsGender(String sGender){
        this.sGender=sGender;
    }
    public String getsGender(){
        return sGender;
    }
    public void setiQtdPgs(int iQtdPgs){
        this.iQtdPgs=iQtdPgs;
    }
    public int getiQtdPgs(){
        return iQtdPgs;
    }

}
