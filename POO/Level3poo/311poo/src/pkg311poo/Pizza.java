package pkg311poo;
/**
 * Classe Abstrata não permite criação de objetos, serve exclusivamente para
 * reutilizar código generalizando e abstraindo características gerais à um
 * grupo de Objetos mais específicos (dentro de outras classes herdeiras):
 *
 * @author João Pedro LPS
 */
public abstract class Pizza {
    //Métodos Públicos Abstratos: Cada SubClasse definirá o preparo específico;
    public abstract void Preparar();
    public abstract void Cobrar();
    
    public void Assar(){
        System.out.println("Assando a 280º celcius...");
    }
    
}
