package pkg305poo;
/**
 * b. Uma classe Pessoa com os atributos públicos (nome: String, idade: int e
 * categoria: String)
 *
 * @author João Pedro LPS
 */
public class Pessoa {
    //Atributos:
    public String sNome;
    public int iIdade;
    public String sCategoria;
    
    //Método Construtor:
    public Pessoa(){
    }
    
    public Pessoa(String sNome, int iIdade, String sCategoria){
        this.sNome = sNome;
        this.iIdade = iIdade;
        this.sCategoria = sCategoria;
        
    }
    
}
