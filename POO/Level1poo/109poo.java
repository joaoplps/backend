package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.9 - Imprimir as iniciais de um nome completo.
 */
import java.util.Scanner;				//Lib. Scanner: método consultor.
public class Main {
    public static void main(String[] args) {
        String nomecompleto, iniciais="";			//Inicialização de variável "iniciais" vazía para receber as iniciais;
        System.out.println("Insira seu nome completo: ");
        Scanner leitura=new Scanner(System.in);
        nomecompleto=leitura.nextLine();		    //Leitura do nome;
        String[] teste=nomecompleto.split(" ");		//Split divide a variável nomecompleto antes e depois dos espaços
        for(int i=0;i<teste.length;i++){			//e atribui ao vetor teste;
            iniciais+=teste[i].charAt(0);					//Para cada cadeia de String antes e depois dos espaços, verifica o char
        }													//da primeira posição (0), e concatena-os em "iniciais".
        System.out.println(iniciais);						//Imprime a variável "iniciais";
    }
}
