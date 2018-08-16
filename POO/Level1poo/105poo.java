package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.5 - Método Equals, comparação de Strings.
 */
import java.util.Scanner;			                //Lib. Scanner: método consultor.
public class Main {
    public static void main(String[] args) {
        String x=new String("Segunda-Feira");		//Declarações com "new String" criam diferentes endereços na memória;
        String y=new String("Segunda-Feira");		//Podem guardar valores iguais, porém a comparação entre endereços será diferente;
        if(x.equals(y)){System.out.println("X e Y são iguais.");}       //Método de comparação das variáveis, teste e definições;
        else{System.out.println("X e Y são diferentes.");}
    }
}
