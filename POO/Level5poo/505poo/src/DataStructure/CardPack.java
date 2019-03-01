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
    //Lista completa de cartas de um baralho comum:
    public static ArrayList <Card> complete(){
        ArrayList <Card> MasterPack1 = new ArrayList <> ();
        for(Nipes n : Nipes.values())
            for(CardValue v : CardValue.values())
                MasterPack1.add(new Card(n, v));
        return MasterPack1;
    }
    
    //Construtor Privado, impedindo criações externas:
    private CardPack (){}
    
    @Override
    public String toString(){
        return "I'm a Card Pack!";
    }
    
    //Lista completa de cartas para um jogo de canastra (dois baralhos completos):
    public static ArrayList<Card> canastra() {
        ArrayList<Card> MasterPack2 = complete();
        
        MasterPack2.addAll(complete());
        
        return MasterPack2;
}
}
