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
    public ArrayList<Card> defaultPack;
    public ArrayList<Card> descartPack;
    public ArrayList<Player> tablePlayers;
    
    public void DefaultTable(){
        defaultPack = new ArrayList<>();
        defaultPack.addAll(CardPack.completeDefault());
        descartPack = new ArrayList<>();
        tablePlayers = new ArrayList<>();
    }
}
