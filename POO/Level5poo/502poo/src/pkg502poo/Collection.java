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
        viItems[0] = Item.COGUMELOVERMELHO;
        viItems[1] = Item.FLORDEFOGO;
        viItems[2] = Item.YOSHI;
        viItems[3] = Item.PENA;
        viItems[4] = Item.MOEDA;
    }
}