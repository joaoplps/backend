package Players;

import DataStructure.Card;
import Tables.Table;
import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Player {
    public ArrayList<Card> playerCards;

    //Métodos de compra e descarte de cartas:
    public void DescartCard(int n, Table t){
        //Criando referência para colocar na pilha de descarte:
        Card c = playerCards.get(n);
        
        //Remove a carta segundo índice n:
        playerCards.remove(n);
        
        //Coloca a referência na pilha de descarte:
        t.descartPack.add(c);
    }
    
    public void BuyCard(Table t){
        t.tablePack.remove(0);
    }
}
