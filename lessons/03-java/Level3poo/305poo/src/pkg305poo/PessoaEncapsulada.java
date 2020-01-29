package pkg305poo;
/**
 * g. Crie novas classes chamadas FilmeEncapsulado e PessoaEncapsulada, que
 * devem possuir os mesmos atributos das classes(Filme e Pessoa) porém privados
 * e os métodos necessários para acessar estes atributos(getters e setters)
 *
 * h. Crie um método construtor na classe PessoaEncapsulada e na classe
 * FilmeEncapsulado que recebam todos os atributos e façam as atribuições
 * necessárias
 * 
 * @author João Pedro LPS
 */
public class PessoaEncapsulada {
    //Atributos Privados:
    private String sNome;
    private int iIdade;
    private String sCategoria;

    //Encapsulamento:
    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public int getiIdade() {
        return iIdade;
    }

    public void setiIdade(int iIdade) {
        this.iIdade = iIdade;
    }

    public String getsCategoria() {
        return sCategoria;
    }

    public void setsCategoria(String sCategoria) {
        this.sCategoria = sCategoria;
    }
    
        //Método Construtor:
    public PessoaEncapsulada(){
    }
    
    public PessoaEncapsulada(String sNome, int iIdade, String sCategoria){
        this.sNome = sNome;
        this.iIdade = iIdade;
        this.sCategoria = sCategoria;
        
    }
    
    
    
}
