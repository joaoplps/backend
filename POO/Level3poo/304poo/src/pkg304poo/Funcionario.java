package pkg304poo;
/**
 * - Superclasse chamada Funcionários com os atributos nome, salario, com o
 * método receber_salario(); 
 * 
 * @author João Pedro LPS
 */
public class Funcionario {
    //Atributos da Classe:
    private String nome;
    private double salario;

    //Getters & Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Método Construtor:
    public Funcionario(){
    }
    
    public Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }
    
    //Método receber_salario(); :
    public void receber_salario(){
        System.out.println("$$$-TCHIC TCHIN-$$$");
    }
    
}
