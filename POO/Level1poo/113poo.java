package pkg101poo;
/**
 * @author João Pedro LPS
 * Ex.13 - Classe Cachorro, criações e métodos dos objetos:
 * Esse código precisa existir dentro da árvore do projeto com fonte
 * no endereço: "101poo/src/pkg101poo/Cachorro.java". Observe que aqui
 * temos a Classe "Cachorro", onde o programa Main importará informações.
 * Neste exemplo é criada a classe Cachorro que está, no caso prático
 * de exemplo deste repositório como "113poo.java".
 */
public class Cachorro{
	//Atributos:
    public String sNomedog;
    public String sRacadog;
    public String sCordog;
    public double dPesodog;

    //Métodos:
    public void brincar(){
        dPesodog = dPesodog - 0.5;
    }
    public void comer(){
        dPesodog = dPesodog + 0.6;
    }
    public void latir(){
        System.out.println("Au!");
    }
    
}
