package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.6 - Método compareTo, com atenção para acentos e carácteres especiais:
 * Se a comparação retornar 0, o resultado é igualdade;
 * Se a comparação retornar positiva, o resultado é segunda variável depois da primeira;
 * Se a comparação retornar negativa, o resultado é primeira variável depois da segunda.
 */
import java.util.Scanner;								//Lib. Scanner: método consultor.
public class Main {
    public static void main(String[] args) {
        String nomex, nomey;
        nomex="Joao";
        nomey="Jose";
        if(nomex.compareTo(nomey)>0){System.out.println(nomex+" vem depois de "+nomey);}
        else if(nomex.compareTo(nomey)<0){System.out.println(nomex+" vem antes de "+nomey);}
        else{System.out.println(nomex+" é igual a "+nomey);}
    }
}
