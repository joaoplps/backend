package Cards;

/**
 * Overall Abstract Card class
 *
 * @author LPS
 */
public abstract class Card {
    public int iNipe, iVal;
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Card){
            Card c_ref = (Card) o;
            
            if (iNipe == c_ref.iNipe && iVal == c_ref.iVal)
                return true;
        }
            
        return false;
    }
    
    public Card(int i, int v){
        iNipe = i;
        iVal = v;
    }
}
