package pkg304poo;
/**
 * - Subclasse chamada Vendedor com os métodos atender_cliente(), vender();
 * 
 * @author João Pedro LPS
 */
public class Vendedor extends Funcionario {
    //Métodos públicos;
    public void atender_cliente(){
        System.out.println("How u doin'?");
    }
    
    public void vender(){
        System.out.println("Payment please. Thank U!");
    }
    
    //Override modifica o salario do vendedor que tem comissão de 20%:
    @Override
    public void receber_salario(){
        System.out.println(getSalario()+getSalario()*0.2);
    }
    
}
