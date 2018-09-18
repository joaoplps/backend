/*
 * Atividade de revisão:
 * 1. Cria uma classe Calculadora, que tenha como atributos(int
 * valor1,int valor2 e char operador), esta classe também deverá ter
 * um método chamado calcular() que irá retornar o resultado de uma
 * operação matemática. Quando invocado o método calcular(), ele irá
 * acessar os atributos do objeto que invocou, e realizar a operação
 * conforme os atributos que constam no objeto.
 * Obs: Utiliza o conceito de encapsulamento, torne os atributos privados
 * e utilize os métodos da classe Calculadora(getters e setters) para
 * acessar os atributos do objeto.
 * 
 * a) Se o operador for ‘+’, deverá realizar a adição do valor1 com
 * valor2;
 * b) Se for ‘-’, deverá realizar a subtração do valor1 com valor2;
 * c) Se for ‘*’, deverá realizar a multiplicação do valor1 com valor2;
 * d) Se for ‘/’, deverá realizar a divisão do valor1 com valor2;
 * e) Se for ‘%’, deverá realizar a porcentagem do valor1 em
 * relação ao valor2;
 * f) Crie cinco objetos da Classe Calculadora e inicie cada objeto com os
 * valores e operadores, utilizando os métodos setters. (Cada objeto com
 * um operador diferente).
 * h) Mostre os resultados das operações, que pode ser impressa dentro
 * do método  calcular().
 */
package pkg301poo;

/**
 *
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {

        calculadora calc1=new calculadora();       //Criação de objeto "calc1" com método set;
        calc1.setiValor1(1);
        calc1.setiValor2(2);
        calc1.setcOperador('-');
        
        calc1.calcular();
        
        calculadora calc2=new calculadora();       //Criação de objeto "calc2" com método set;
        calc2.setiValor1(1);
        calc2.setiValor2(2);
        calc2.setcOperador('+');
        
        calc2.calcular();
        
        calculadora calc3=new calculadora();       //Criação de objeto "calc3" com método set;
        calc3.setiValor1(1);
        calc3.setiValor2(2);
        calc3.setcOperador('/');
        
        calc3.calcular();
        
        calculadora calc4=new calculadora();       //Criação de objeto "calc4" com método set;
        calc4.setiValor1(1);
        calc4.setiValor2(2);
        calc4.setcOperador('*');
        
        calc4.calcular();
        
        calculadora calc5=new calculadora();       //Criação de objeto "calc5" com método set;
        calc5.setiValor1(1);
        calc5.setiValor2(2);
        calc5.setcOperador('%');
        
        calc5.calcular();
        
    }

}
