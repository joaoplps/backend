package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.2 - Entrada de dados com Biblioteca Scanner.
 */
import java.util.Scanner;				//Lib. Scanner: método consultor, consultará input do usuário;
public class Main {
  public static void main(String[] args) {
      String nome;
      System.out.println("Qual seu nome?");		//Saída de dado;
      Scanner leitura=new Scanner(System.in);	//Atribuição do método scanner na variável leitura;
      nome=leitura.nextLine();			//Leitura de String nome com o método leitura;
      System.out.println("Olá "+nome);		//Saída de dados;
  }
}
