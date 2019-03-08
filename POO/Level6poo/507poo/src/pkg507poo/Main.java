package pkg507poo;

import Cards.Card;
import Cards.ConvCard;
import Cards.PifCard;
import Cards.TrucoCard;

/**
 * Truco!
 * 
 * Comparando Cartas.
 *
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        
        Card c1 = new ConvCard(1, 5);
        Card c2 = new TrucoCard(2, 9);

        System.out.println(c2.equals(c2));
        System.out.println(c2.equals(c1));
        
        Card c3 = new PifCard(2, 8);
        
        System.out.println(c3.equals(c2));
    }
}
