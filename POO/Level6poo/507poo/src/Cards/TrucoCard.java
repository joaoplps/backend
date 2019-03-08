package Cards;
/**
 * Truco Card class
 *
 * @author LPS
 */
public class TrucoCard extends Card {
    public TrucoCard(int i, int v) {
        super(i, v);
    }

    @Override
    public boolean GreaterThan(Card c) {
        //Logic decisions for comparing Truco cards:
        if(iVal == c.iVal)
            return iNipe > c.iNipe;
        
        if(iVal <= 3 && c.iVal <= 3)
            return iVal > c.iVal;
        if(iVal <= 3 && c.iVal > 3)
            return true;
        
        if(iVal > 3 && c.iVal > 3)
            return iVal > c.iVal;
        
        return false;
    }
}
