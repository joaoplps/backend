package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.13 - Classe Carro, criações e métodos dos objetos:
 * Esse código precisa existir dentro da árvore do projeto com fonte
 * no endereço: "101poo/src/pkg101poo/Carro.java". Observe que aqui
 * temos a Classe "Carro", onde o programa Main importará informações.
 * Neste exemplo é criada a classe Carro que está, no caso prático
 * de exemplo deste repositório como "115poo.java".
 */
public class Carro {
  public String sNomecar;
  public String sCorcar;
  public int iAnocar;
  public String sModelocar;
  public int sSpeedcar=0;
  public boolean bStatuscar=false;

  public void ligar(){
    if(bStatuscar==false){
      bStatuscar=true;
      System.out.println("Você ligou o carro.");
    }
    else{System.out.println("O carro já está ligado!");}
  }

  public void desligar(){
    if(bStatuscar==true){
      bStatuscar=false;
      System.out.println("Você desligou o carro.");
    }
    else{System.out.println("O carro já está desligado!");}
  }

  public void acelerar(){
    if(bStatuscar==true)sSpeedcar++;
    else{System.out.println("Primeiro ligue o carro.");}
  }

  public void freiar(){
    if(bStatuscar==false){
      if(sSpeedcar>0)sSpeedcar--;
      else{System.out.println("O carro está parado.");}
    }
    else{System.out.println("Há necessidade de freiar com o carro desligado?");}
  }
}
