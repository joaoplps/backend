package Cards;

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
 * ***Os Valores são: As, Dois, Tres, Quatro, Cinco, Seis, Sete,
 * Oito, Nove, Dez, Valete, Dama e Rei.
 *
 * @author LPS
 */
public enum CardValue {
    AS(0, "Às"),
    DOIS(1, "Dois"),
    TRES(2, "Três"),
    QUATRO(3, "Quatro"),
    CINCO(4, "Cinco"),
    SEIS(5, "Seis"),
    SETE(6, "Sete"),
    OITO(7, "Oito"),
    NOVE(8, "Nove"),
    DEZ(9, "Dez"),
    VALETE(10, "Valete"),
    DAMA(11, "Dama"),
    REI(12, "Rei");

    public final int iCardValue;
    public final String sCardId;
    
    //Construtor:
    private CardValue(int val, String n){
        iCardValue = val;
        sCardId = n;
    }
    
    //Identificador:
    @Override
    public String toString() {
        return sCardId;
}
}
