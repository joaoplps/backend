package pkg304poo;
/**
 * Herança: Reutilização de código. Divisão das classes em subclasses e super-
 * classes para poupar código otimizando o programa, generalizando atributos e/ou
 * métodos comuns às subclasses nas superclasses.
 * 
 * Override: Com a notação @Override um método pode ser sobrescrito para diferente
 * comportamento dentro de uma subclasse.
 * 
 * Exemplo:
 * - Superclasse chamada Funcionários com os atributos nome, salario, com o
 * método receber_salario(); 
 * - Subclasse chamada Vendedor com o método atender_cliente(), vender();
 * - Subclasse Gerente com o método tomar_decisão(), contratar_funcionario() e
 * demitir_funcionario;
 * 
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {
        Gerente g;                      //Para uma subclasse acessar a superclasse,
        g = new Gerente("JP", 9800);    //deve-se existir um método construtor;
        
        System.out.println("Name: "+g.getNome()+"\nPaycheck: $"+g.getSalario());
        
    }
    
}
