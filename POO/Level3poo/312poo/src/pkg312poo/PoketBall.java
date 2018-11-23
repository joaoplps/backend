package pkg312poo;
/**
 * Agregação e Composição
 *
 * @author João Pedro LPS
 */
import java.util.Random;

public class PoketBall {
    //Variável em array para guardar Objetos:
    private PoketMonster[] poketCapture;
    
    //Métodos:
    public void ReleasePM(){
        //Gerar número aleatório:
        Random rand = new Random();
        int iNumber = rand.nextInt(poketCapture.length);
        System.out.println("Go " + poketCapture[iNumber].getsName() + "!");
    }
    
    //Construtor de array:    
    public PoketBall(PoketMonster[] poketCapture){
        this.poketCapture = poketCapture;
    }

    //Encapsulamento:
    public PoketMonster[] getPoketCapture() {
        return poketCapture;
    }
    public void setPoketCapture(PoketMonster[] poketCapture) {
        this.poketCapture = poketCapture;
    }
    
    
}
