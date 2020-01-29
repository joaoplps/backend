package pkg311poo;
/**
 * Ex.: Herança, Polimorfismo e Abstração de Classe, Override:
 *
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {
        //Criação de Objetos:
        PizzaCalabresa pizza = new PizzaCalabresa();
        PizzaQuatroQueijos pizza0 = new PizzaQuatroQueijos();
        FornoLenha forno = new FornoLenha();
        
        forno.FabricarPizza(pizza);
        forno.FabricarPizza(pizza0);
    }
    
}
