package Tables;

import DataStructure.Card;
import DataStructure.CardPack;
import java.util.ArrayList;
import Players.Player;

/**
 *
 * @author LPS
 */
public class Table {
    public ArrayList<Card> tablePack;
    public ArrayList<Card> descartPack;
    public ArrayList<Player> tablePlayers;
    
    public void DefaultTable(){
        tablePack = new ArrayList<>();
        tablePack.addAll(CardPack.completeDefault());
        descartPack = new ArrayList<>();
        tablePlayers = new ArrayList<>();
    }
}
