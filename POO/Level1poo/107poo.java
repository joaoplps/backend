package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.7 - Métodos indexOf, length, toUpperCase, toLowerCase e replace.
 */
import java.util.Scanner;	//Lib. Scanner: método consultor.
public class Main {
    public static void main(String[] args) {
        String professor="Xavier";
        System.out.println(professor.indexOf('v'));		//Imprime a posição ou índice do char "v";
        System.out.println("O tamanho da String professor é "+professor.length());		//Concatenação já demonstrando resultado;
        System.out.println(professor.toUpperCase());		//Variável transformada para Maiúscula;
        System.out.println(professor.toLowerCase());		//Variável transformada para Minúscula;
        professor.replace("Xavier","Charles");				//Substituição do valor da variável;
    }
}
