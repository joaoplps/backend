package pkg308poo;
/**
 * ● Crie uma classe chamada Carro, que tenha como atributos,
 * modelo (String), placa (String), velocidade (double). Os atributos
 * da classe carro devem ser privates, crie os métodos necessários
 * para manipulação dos atributos.
 * ● Crie um método construtor na classe Carro, que receba todos os
 * parâmetros/valores para criação de um objeto Carro.
 *
 * @author LPS
 */
public class Car {
    //Definindo atributos:
    private String sModel;
    private String sPlate;
    private double dSpeed;
    
    //Criando métodos públicos (GET & SET):
    public String getsModel() {
        return sModel;
    }

    public void setsModel(String sModel) {
        this.sModel = sModel;
    }

    public String getsPlate() {
        return sPlate;
    }

    public void setsPlate(String sPlate) {
        this.sPlate = sPlate;
    }

    public double getdSpeed() {
        return dSpeed;
    }

    public void setdSpeed(double dSpeed) {
        this.dSpeed = dSpeed;
    }
    
    //Métodos construtores:
    public Car(){}
    
    public Car(String sModel, String sPlate, double dSpeed){
        this.sModel = sModel;
        this.sPlate = sPlate;
        this.dSpeed = dSpeed;
    }
    
}
