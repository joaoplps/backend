package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.13 - Classe Cachorro, criações e métodos dos objetos:
 * Esse código precisa existir dentro da árvore do projeto com fonte
 * no endereço: "101poo/src/pkg101poo/Main.java". Observe que aqui
 * temos a Classe Main, onde o programa deverá rodar. Nesse exemplo
 * importaremos informações da classe Cachorro que está no arquivo
 * "101poo/src/pkg101poo/Cachorro.java" ou no caso prático de exemplo
 * deste repositório como "113poo.java".
 */
import java.util.Scanner;               //Lib. Scanner: método consultor.
public class Main {
  public static void main(String[] args) {
    Cachorro dog1;
    dog1=new Cachorro();                //Criação de objeto "dog1";
    dog1.sNomedog="Mr. Doggo";
    dog1.sCordog="Vermelho";
    dog1.sRacadog="Fila";
    dog1.dPesodog=22;

    Cachorro dog2=new Cachorro();       //Criação de objeto "dog2";
    dog2.sNomedog="Loki";
    dog2.sCordog="Verde";
    dog2.sRacadog="Pastor Belga";
    dog2.dPesodog=15;

    Cachorro dog3=new Cachorro();       //Criação de objeto "dog3";
    dog3.sNomedog="Mendigo";
    dog3.sCordog="Amarelo";
    dog3.sRacadog="Labrador";
    dog3.dPesodog=18;

    System.out.println("Peso antes de comer: "+dog1.dPesodog);
    dog1.comer();               //Chamada de método "comer" para "dog1";
    System.out.println("Peso depois de comer: "+dog1.dPesodog);

    System.out.println("Peso antes de brincar: "+dog2.dPesodog);
    dog2.brincar();             //Chamada de método "brincar" para "dog2";
    System.out.println("Peso depois de brincar: "+dog2.dPesodog);

    dog3.latir();               //Chamada de método "latir" para "dog3";
    System.out.println("Calado "+dog3.sNomedog+"!");

    Scanner leitura=new Scanner(System.in);
    System.out.println("Insira o número de cachorros: ");
    int qtd;
    qtd=Integer.parseInt(leitura.nextLine());           //Nota: há conflito quando usa-se o mesmo
    Cachorro[] dogs;                                    //método scanner (no caso "leitura.nextLine")
    dogs=new Cachorro[qtd];                             //para mais de um tipo de variável (dentro
                                                        //do laço de repetição). Por isso converte-se
                                                        //o mais utilizado (.nextLine para .nextInt
    for(int i=0;i<qtd;i++){                             //com Integer.parseInt(leitura.nextLine());)
      dogs[i]=new Cachorro();                           //quando necessário. Outra alternativa é usar
      System.out.println("Qual o nome do dog? ");       //diferentes "leitura" para cada tipo de variável;
      dogs[i].sNomedog=leitura.nextLine();
      System.out.println("Qual o peso do dog? ");
      dogs[i].dPesodog=Integer.parseInt(leitura.nextLine());
      System.out.println("Qual a raça do dog? ");
      dogs[i].sRacadog=leitura.nextLine();
      System.out.println("Qual a cor do dog? ");
      dogs[i].sCordog=leitura.nextLine();
      System.out.print(dogs[i].sNomedog+": ");dogs[i].latir();
    }
  }
}
