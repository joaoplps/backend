package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.12 - Criação de Classe, Atributos e Métodos:
 * Esse código precisa existir dentro da árvore do projeto com fonte
 * no endereço: "101poo/src/pkg101poo/Lampada.java". Observe que aqui
 * temos a Classe Lampada, onde o programa Main importará informações.
 * Neste exemplo é criada a classe Lampada que está, no caso prático
 * de exemplo deste repositório como "112poo.java".
 */
public class Lampada {
             //Características, atributos;
    public String tipo;         //Default: public não precisa ser declarado, apenas privado ou protegido;
    boolean estado;
    String forma;
    int voltagem;
            //Métodos ou comportamentos;
    public void ligar(){
            System.out.println("Lâmpada está sendo ligada...");
            estado=true;
            System.out.println("Lâmpada está ligada!");
    }
    public void desligar(){
            System.out.println("Lâmpada está sendo desligada...");
            estado=false;
            System.out.println("Lâmpada está desligada!");
    }
}
