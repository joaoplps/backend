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
    //Pack completo de cartas de um baralho comum:
    public static ArrayList <Card> completeDefault(){
        ArrayList <Card> pack = new ArrayList <> ();
        for(Nipes n : Nipes.values())
            for(CardValue v : CardValue.values())
                pack.add(new Card(n, v));
        return pack;
    }
    
    //Construtor Privado, impedindo criações externas:
    private CardPack (){}
    
    @Override
    public String toString(){
        return "I'm a Card Pack!";
    }
    
    //Pack de cartas para um jogo de canastra (dois baralhos completos):
    public static ArrayList<Card> canastra() {
        ArrayList<Card> pack = completeDefault();
        
        pack.addAll(completeDefault());
        
        return pack;
    }
}
