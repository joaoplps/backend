package pkg304poo;
/**
 * - Subclasse Gerente com o método tomar_decisão(), contratar_funcionario() e
 * demitir_funcionario;
 * 
 * @author João Pedro LPS
 */
public class Gerente extends Funcionario { //Herda atributos da classe Funcionario;
    //Métodos públicos;
    public void tomar_decisao(){
        System.out.println("Analyzing...");
    }
    
    public void contratar_funcionario(){
        System.out.println("Hy new guy!");
    }
    
    public void demitir_funcionario(){
        System.out.println("You are FIRED!");
    }
    
    //Método construtor para setar atributos da superclasse:
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
}
