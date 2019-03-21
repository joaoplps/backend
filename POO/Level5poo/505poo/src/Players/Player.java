package Players;

import DataStructure.Card;
import Tables.Table;
import java.util.ArrayList;
import java.util.Collections;

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
            
            return hand;
        }
        
        return "A mão do jogador está vazia";
    }

    //Métodos de compra e descarte de cartas:
    public boolean DescartCard(int n, Table t){
        if (Hand.size() < n)
            return false;

        t.descartPack.add(0, Hand.remove(n));
        return true;
    }
    
    public void BuyCard(Table t){
        Card c = t.tablePack.remove(0); //Remove a primeira carta da pilha;
        Hand.add(c); //Coloca na mão;
    }
    
    public void BuyDesCard(Table t){
        for (Card c : t.descartPack){
            c = t.descartPack.remove(0); //Remove a primeira carta da pilha;
            Hand.add(c); //Coloca na mão;
        }
    }
    
    public void SortHand(ArrayList hand){
        Collections.sort(hand);
    }
}
