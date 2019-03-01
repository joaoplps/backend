package pkg505poo;

import DataStructure.Card;
import DataStructure.CardPack;
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
public class Main {
    public static void main(String[] args) {
        ArrayList<Card> mypack = CardPack.complete();
        System.out.println("Meu é um baralho completo com " + mypack.size() + " cartas.");
        System.out.println("São elas:\n" + mypack);
    }
}
