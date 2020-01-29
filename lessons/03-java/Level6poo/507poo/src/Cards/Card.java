package Cards;
/**
 * Overall Abstract Card class
 *
 * @author LPS
 */
public abstract class Card {
    public final int iNipe, iVal;
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Card){
            Card c_ref = (Card) o;
            return iNipe == c_ref.iNipe && iVal == c_ref.iVal;
        }
            
        return false;
    }
    
    public Card(int i, int v){
        iNipe = i;
        iVal = v;
    }
    
    public boolean GreaterThan(Card c){
        return iVal > c.iVal;
    }
}
