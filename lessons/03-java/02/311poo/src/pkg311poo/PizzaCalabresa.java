package pkg311poo;
/**
 * Herança da Classe Abstrata "Pizza", com a utilização do @Override para
 * sobrescrever os métodos básicos definidos na mesma:
 *
 * @author João Pedro LPS
 */
public class PizzaCalabresa extends Pizza {
    //Métodos Públicos Sobrescritos:
    @Override
    public void Preparar(){
        System.out.println("Abrindo a massa...");
        System.out.println("Passando o molho...");
        System.out.println("Colocando queijo...");
        System.out.println("Espalhando calabresas...");
    }
    
    @Override
    public void Cobrar(){
        System.out.println("Bom apetite! São $28,50.");
    }
    
}
