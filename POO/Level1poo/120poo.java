package pkg101poo;
/**
 * Instruções:
 * 1. Crie um projeto java default no NetBeans;
 * 2. Veja se o arquivo é uma Classe, ou o Main.java;
 * 3. Coloque os arquivos dentro do diretório correto e execute.
 *
 * @author João Pedro LPS
 * Ex.17 - Main do excercício da classe Cachorro através dos
 * métodos get & set.
 */
import java.util.Scanner;                               //Lib. Scanner: método consultor.
public class Main {
    public static void main(String[] args) {
        Cachorro dog1;
        dog1=new Cachorro();                //Criação de objeto "dog1" com método set;
        dog1.setsNomedog("Mr. Doggo");
        dog1.setsCordog("Vermelho");
        dog1.setsRacadog("Fila");
        dog1.setdPesodog(22);
        
        Cachorro dog2=new Cachorro();       //Criação de objeto "dog2" com método set;
        dog2.setsNomedog("Loki");
        dog2.setsCordog("Verde");
        dog2.setsRacadog("Pastor Belga");
        dog2.setdPesodog(15);
        
        Cachorro dog3=new Cachorro();       //Criação de objeto "dog3" com método set;
        dog3.setsNomedog("Mendigo");
        dog3.setsCordog("Amarelo");
        dog3.setsRacadog("Labrador");
        dog3.setdPesodog(18);
        
        System.out.println("Peso antes de comer: "+dog1.getdPesodog());         //Print com método get;
        dog1.comer();               //Chamada de método "comer" para "dog1";
        System.out.println("Peso depois de comer: "+dog1.getdPesodog());        //Print com método get
        
        System.out.println("Peso antes de brincar: "+dog2.getdPesodog());       //Print com método get
        dog2.brincar();             //Chamada de método "brincar" para "dog2";
        System.out.println("Peso depois de brincar: "+dog2.getdPesodog());      //Print com método get
        
        dog3.latir();               //Chamada de método "latir" para "dog3";
        System.out.println("Calado "+dog3.getsNomedog()+"!");                   //Print com método get

        Scanner leitura=new Scanner(System.in);
        System.out.println("Insira o número de cachorros: ");
        int qtd;
        qtd=Integer.parseInt(leitura.nextLine());               //Nota: há conflito quando usa-se o mesmo
        Cachorro[] dogs;                                        //método scanner (no caso "leitura.nextLine")
        dogs=new Cachorro[qtd];                                 //para mais de um tipo de variável (dentro
                                                                //do laço de repetição). Por isso converte-se
                                                                //o mais utilizado (.nextLine para .nextInt
        for(int i=0;i<qtd;i++){                                 //com Integer.parseInt(leitura.nextLine());)
            dogs[i]=new Cachorro();                             //quando necessário. Outra alternativa é usar
            System.out.println("Qual o nome do "+i+"º dog? ");  //diferentes "leitura" para cada tipo de variável;
            dogs[i].setsNomedog(leitura.nextLine());
            System.out.println("Qual o peso do "+i+"º dog? ");
            dogs[i].setdPesodog(Integer.parseInt(leitura.nextLine()));
            System.out.println("Qual a raça do "+i+"º dog? ");
            dogs[i].setsRacadog(leitura.nextLine());
            System.out.println("Qual a cor do "+i+"º dog? ");
            dogs[i].setsCordog(leitura.nextLine());
            System.out.print(dogs[i].getsNomedog()+": ");dogs[i].latir();
        }
    }
}
