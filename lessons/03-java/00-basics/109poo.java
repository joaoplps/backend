package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.9 - Imprimir as iniciais de um nome completo.
 */
import java.util.Scanner;				//Lib. Scanner: método consultor.
public class Main {
  public static void main(String[] args) {
    String nomecompleto;
    System.out.println("Insira seu nome completo: ");
    Scanner leitura=new Scanner(System.in);
    nomecompleto=leitura.nextLine();		//Leitura do nome;
    String[] teste=nomecompleto.split(" ");
    for(int i=0;i<teste.length;i++){
      if(teste[i].charAt(0)!='d'){        //Aspas simples para retorno de apenas um caráctere, quando for diferente de "d" para eliminar "do(s)", "da(s)";
        System.out.print(teste[i].charAt(0));   //System.out.print (sem o "ln") não produz a quebra de linha;
      }
    }
  }
}
