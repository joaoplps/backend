package pkg402poo;
/**
 * Ex. Ordenação em array com o método compareTo:
 *
 * @author João Pedro LPS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Chamado do método de input e declaração de array:
        Scanner scan = new Scanner(System.in);
        String[] times = new String[4];
        
        //Looping para entrada de cada posição:
        for(int i=0; i<times.length; i++ ){
            System.out.println("Digite o time para ser inseiro em um grupo de times da copa");
            times[i] = scan.nextLine();
        }
     
        //Variável auxiliar para trocar posições caso a comparação retorne a condição:
        String aux;
        for (String time : times) { //O mesmo que: "for(int i=0; i< times.length; i++)"
            int tamanho = times.length - 1;
            for(int j =0; j < tamanho; j++){
                if (times[j].compareTo(times[j+1]) > 0) {
                    aux = times[j];
                    times[j] = times[j+1];
                    times[j+1] = aux;    
                }
            }
        }
    }
    
}
