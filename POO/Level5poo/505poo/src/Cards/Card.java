package Cards;
/** 
 * ***A Carta é composta por dois atributos imutáveis e públicos,
 * um Naipe e um Valor.
 * 
 * **Implementação de interface do java: Comparable; Sobrescreve
 * o método compareTo() esplanando as características da abstração
 * da diferença.
 *
 * @author LPS
 */
public class Card implements Comparable<Card> {
    public final Nipes nipe;
    public final CardValue value;
    
    public Card (Nipes n, CardValue v){
        nipe = n;
        value = v;
    }
    
    //Identificador:
    @Override
    public String toString() {
        return value + " de " + nipe;
    }
    
    // 
    @Override
    public boolean equals(Object o){
        if (o instanceof Card){
            Card c = (Card) o;
            return c.nipe == nipe && c.value == value;
        }
        
        else{
            return false;
        }
    }

    @Override
    public int compareTo(Card o) {
        return value.iCardValue - o.value.iCardValue;
    }

    
    
}
