package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.10 - Substituição de uma palavra em uma frase:
 */
import java.util.Scanner;	//Lib. Scanner: método consultor.
public class Main {
  public static void main(String[] args) {
    Scanner leitura=new Scanner(System.in);
    String frase, palavra_escolhida, nova_palavra;
    System.out.println("Digite uma frase: ");
    frase=leitura.nextLine();
    System.out.println("Digite uma palavra para ser trocada: ");
    palavra_escolhida=leitura.nextLine();
    System.out.println("Digite a nova palavra: ");
    nova_palavra=leitura.nextLine();
    frase=frase.replace(palavra_escolhida, nova_palavra);
    System.out.println(frase);
  }
}
