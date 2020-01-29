package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.8 - Método "split" divide variáveis em posições de um array, conforme
 * argumento (só aceita um char).
 */
public class Main {
  public static void main(String[] args) {
    String eletrodomestico="micro-ondas";
    String[] teste=null;							//Inicialização de variável composta vazia;
    teste=eletrodomestico.split("-");       //Split só aceita um caractere;
    System.out.println(teste[0]);				//Saída da posição 0 do vetor teste;
    System.out.println(teste[1]);				//Saída da posição 1 do vetor teste;
  }
}
