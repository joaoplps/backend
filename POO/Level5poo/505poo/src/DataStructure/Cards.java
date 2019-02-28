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
public enum Cards {
    c0('A', 12),
    c1('1', 0),
    c2('2', 1),
    c3('3', 2),
    c4('4', 3),
    c5('5', 4),
    c6('6', 5),
    c7('7', 6),
    c8('8', 7),
    c9('9', 8),
    c10('V', 9),
    c11('D', 10),
    c12('K', 11);

    char cCardId;
    int cCardValue;
    
    private Cards(char id, int val){
        cCardId = id;
        cCardValue = val;
    }
}
