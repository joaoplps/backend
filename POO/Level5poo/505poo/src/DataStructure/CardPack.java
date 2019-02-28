package DataStructure;

import java.util.ArrayList;

/**
 * Data Structure & ArrayList!
 * 
 * Estrutura de dados em lista: vetor tratado diferentemente, dado
 * a imprevisibilidade do escopo.
 * 
 * Syntax:
 * ArrayList <int> arrayId = new ArrayList <int> ();
 * 
 * See more for manage items in the list.
 *
 * @author LPS
 */
public class CardPack {
    ArrayList <Character> cards = new ArrayList <> ();
    
    public static final CardPack pack1 = new CardPack();
    
    @Override
    public String toString(){
        return "I'm a Card Pack!";
    }
}
