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
    
        //Criador de mesa default:
    public Player(){
        Hand = new ArrayList<>();
    }

    //Métodos de compra e descarte de cartas:
    public void DescartCard(int n, Table t){
        //Criando referência para remover da mão ecolocar na pilha de descarte:
        Card c = Hand.get(n);
        Hand.remove(n);
        t.descartPack.add(0, c);
    }
    
    public void BuyCard(Table t){
        t.tablePack.remove(0);
    }
}
