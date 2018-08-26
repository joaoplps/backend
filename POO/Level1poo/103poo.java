package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.3 - Entrada de dados com Biblioteca Scanner e Switch Case.
 */
import java.util.Scanner;								    //Lib. Scanner: método consultor.
public class Main {
  public static void main(String[] args) {
    int numero;
    Scanner scan;										//Variável guarda referência para objeto;
    scan=new Scanner(System.in);						//Reservar espaço de memória;
    System.out.println("Digite 1, 2 ou 3: ");
    numero=scan.nextInt();						        //Inserção de dados pelo usuário;
    switch(numero){								        //Teste Switch para cada caso segundo o número inserido;
      case 1: System.out.println("Abelhas!");
      break;										    //Break para o teste se a execução anterior for Verdade;
      case 2: System.out.println("Formigas!");
      break;
      case 3: System.out.println("Ratos!");
      break;
      default: System.out.println("Essa opção não existe.");		//Qualquer outro resultado;
    }
  }
}
