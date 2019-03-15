package Players;

import DataStructure.Card;
import Tables.Table;
import java.util.ArrayList;

/**
 * ***A modelagem do jogador se resume a sua mão, que é uma lista
 * de cartas inicialmente vazia. Um jogador deve ser capaz de
 * comprar de uma pilha de compra da mesa e descartar uma carta
 * de sua mão para a pilha de descarte da mesa.
 * 
 * ***O jogador deve sempre comprar da primeira carta do Baralho
 * (índice 0) e deve também sempre descartar para o topo da pilha
 * de descarte (índice 0).
 *
 * @author LPS
 */
public class Player {
    public ArrayList<Card> Hand;
    
    //Construtor do jogador:
    public Player(){
        Hand = new ArrayList<>();
    }
    
    //I AM MY HAND Identificador
    @Override
    public String toString() {
        String hand = "";
        
        if (!Hand.isEmpty()){
            for (Card c : Hand){
                hand += c.toString() + " ";
            }
            
            return hand + "\n";
        }
        
        return "A mão do jogador está vazia";
    }

    //Métodos de compra e descarte de cartas:
    public void DescartCard(int n, Table t){
        //Criando referência para remover da mão ecolocar na pilha de descarte:
        Card c = Hand.get(n);
        Hand.remove(n);
        t.descartPack.add(0, c);
    }
    
    public void BuyCard(Table t){
        Card c = t.tablePack.remove(0); //Remove a primeira carta da pilha;
        Hand.add(c); //Coloca na mão;
    }
}
