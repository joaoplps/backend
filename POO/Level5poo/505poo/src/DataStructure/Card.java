package DataStructure;
/**
 *
 * @author LPS
 */
public class Card {
    public final Nipes nipe;
    public final CardValue value;
    
    public Card (Nipes n, CardValue v){
        nipe = n;
        value = v;
    }
    
    @Override
    public String toString() {
        return value + " de " + nipe;
    }
}
