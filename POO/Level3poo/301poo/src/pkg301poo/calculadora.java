/*
 * Classe calculadora, atributos e métodos:
 */
package pkg301poo;

/**
 *
 * @author João Pedro LPS
 */
public class calculadora { //Cria uma classe Calculadora;
    //Atributos: int valor1, int valor2 e char operador:
    private int iValor1;
    private int iValor2;
    private char cOperador;
    private double dResult;
    
    //Método calcular() retorna o resultado de uma operação matemática:
    public void calcular(){
        switch (cOperador) {
            case '+':
                dResult=iValor1+iValor2;
                break;
            case '-':
                dResult=iValor1-iValor2;
                break;
            case '/':
                dResult=iValor1/iValor2;
                break;
            case '*':
                dResult=iValor1*iValor2;
                break;
            case '%':
                dResult=(iValor1*100)/iValor2;
                break;
            default:
                System.out.println("Insira um operador válido.");
                break;
        }
        
        System.out.println(iValor1+" "+cOperador+" "+iValor2+" = "+dResult);
        
    }
    
    //Getters & Setters:
    public void setiValor1(int iValor1){
        this.iValor1=iValor1;
    }
    public int getiValor1(){
        return iValor1;
    }
    
    public void setiValor2(int iValor2){
        this.iValor2=iValor2;
    }
    public int getiValor2(){
        return iValor2;
    }    
    
    public void setcOperador(char cOperador){
        this.cOperador=cOperador;
    }

    public char getcOperador(){
        return cOperador;
    }
    
    public void setdResult(double dResult){
        this.dResult=dResult;
    }

    public double getdResult(){
        return dResult;
    }
    
}
