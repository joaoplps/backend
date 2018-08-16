package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.4 - Media das notas inseridas por usuário.
 */
import java.util.Scanner;								//Lib. Scanner: método consultor.
public class Main {
    public static void main(String[] args) {
        double media=0;									//Variáveis inicializadas;
        int quantidade=0;
        System.out.println("Quantidade de notas a serem lidas: ");
        Scanner ler=new Scanner(System.in);		        //Método de leitura à variavel "ler";
        quantidade=ler.nextInt();					    //Lê a quantidade de notas;
        double[] notas=new double[quantidade];      	//Declara e define quantidade de posições do array "notas";
        for(int i=0;i<notas.length;i++){                //Loopíng para correr o comprimento (length) do array "notas";
            System.out.println("Nota " + (i+1) + ": ");
            notas[i]=ler.nextDouble();				    //Atribuição ao vetor de posição "i" (método de leitura "ler");
            media+=notas[i];							//Acumulador "media";
        }
        media=media/quantidade;						    //Cálculo da média;
        System.out.println(media);
        if(media<6){System.out.println("REPROVADO");}   //Testes e Definições;
        else{System.out.println("APROVADO");}
    }
}
