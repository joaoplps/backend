package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.11 - Criação de Objeto:
 * Esse código precisa existir dentro da árvore do projeto com fonte
 * no endereço: "101poo/src/pkg101poo/Main.java". Observe que aqui
 * temos a Classe Main, onde o programa deverá rodar. Nesse exemplo
 * importaremos informações da classe Lampada que está no arquivo
 * "101poo/src/pkg101poo/Lampada.java" ou no caso prático de exemplo
 * deste repositório como "112poo.java".
 */
import java.util.Scanner;	//Lib. Scanner: método consultor.
public class Main {
  public static void main(String[] args) {
    Lampada lamp1;              		//Criação de variável para guardar referência (endereço na memória);
    lamp1=new Lampada();       			//Criação de objeto atribuído ao endereço "lamp1";
    lamp1.forma="Redonda";      		//Atributos do objeto "lamp1";
    lamp1.tipo="Incandescente";
    lamp1.voltagem=110;
    System.out.println(lamp1.forma+" "+lamp1.tipo);
    lamp1.ligar();        				//Chamada de método alterando atributos do objeto "lamp1" declarados na sua classe "Lampada";
  }
}
