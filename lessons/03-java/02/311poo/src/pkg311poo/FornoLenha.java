package pkg311poo;
/**
 * Classe Forno contendo os métodos para assar a pizza:
 *
 * @author João Pedro LPS
 */
public class FornoLenha {
    //Métodos Públicos:
    public void FabricarPizza(Pizza pizza){
        pizza.Preparar();
        pizza.Assar();
        pizza.Cobrar();
    }
    
}
