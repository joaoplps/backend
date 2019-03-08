package Cards;
/**
 *
 * @author LPS
 */
public class PifCard extends ConvCard {
    public PifCard(int i, int v) {
        super(i, v);
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof PifCard){ //Only compares to same type;
            Card c_ref = (Card) o;
            return iVal == c_ref.iVal;
        }
        
        return false;
    }
}
