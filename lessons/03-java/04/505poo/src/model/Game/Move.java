package model.Game;

import java.util.ArrayList;
import java.util.Collections;
import model.Cards.Card;
import model.Cards.CardValue;
import model.Cards.Nipes;

/**
 *
 * @author LPS
 */
public class Move {
    private final ArrayList<Card> cards;
    
    public Move(ArrayList<Card> c){
        cards = new ArrayList<Card>();
        validate(c);
        cards.addAll(c);
    }
    
    private void validate(ArrayList<Card> c){
                //Garante que a jogada tenha 3 ou mais cartas;
        if (cards.size() < 3)
            throw new IllegalArgumentException("Minimum move: 3 cards.");
          
        //Mesmo Nipe:
        Nipes n1 = cards.get(0).nipe;   //Criando referência para o nipe;
        
        for (int i = 1; i < cards.size(); i++)
            if (!n1.equals(cards.get(i).nipe))
                throw new IllegalArgumentException("All nipes must be the same.");
        
        //Sequenciamento de valores:
        Collections.sort(cards);  //Ordenação de ArrayList;
        
        //Garantindo jogada especial:
        int kingAS = 0;
        if (cards.get(cards.size()-1).value.equals(CardValue.REI) && cards.get(0).value.equals(CardValue.AS))
            kingAS = 1;
        
        //Comparação de valores:
        Card c0 = cards.get(0);   //Atribuir valor Card para utilizar compareTo;
        for (int i = 1 + kingAS; i < cards.size(); i++){
            Card c = cards.get(i);   //Ref. para carta do índice atual;
            if (c0.compareTo(c) != -1)
                throw new IllegalArgumentException("There is no sequence formed!");
        }
    }
}
