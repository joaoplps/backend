package pkg502poo;
/**
 *
 * @author LPS
 */
public class Collection{
    //Atributos:
    public final Item viItems[];
    
    //Construtores:    
    public Collection(){
        //Definição de vetor:
        viItems = new Item[5];
        
        //Criação de objetos:
        viItems[0] = new IncrementalState("Cogumelo Vermelho", true, false, true, true);
        viItems[1] = new IncrementalState("Flor de Fogo", true, true, true, true);
        viItems[2] = new StateIndependent("Yoshi", false, true, true, false);
        viItems[3] = new IncrementalState("Pena", true, true, true, true);
        viItems[4] = new Collectionables("Moeda", false, false, true, true);
    }
}