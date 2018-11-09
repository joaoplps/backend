package pkg308poo;
/**
 * Ex. : Lidando com limite de Velocidade.
 * - Criação de objetos carro e radar para interação segundo métodos;
 *
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {   
        //Criação de Objetos:
        Car car0 = new Car("F1000", "adcd1970", 77.00);
        Radar radar0 = new Radar();
        
        radar0.checkSpeed(car0);
        
    }
    
}
