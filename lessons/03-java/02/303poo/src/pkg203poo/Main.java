package pkg203poo;
/**
 * Ex. Desenvolver:
 * 1. Classe Funcionário com atributos  nome, função e salário.
 * 2. Faça um programa para criar 3 objetos do tipo Funcionário e solicite ao
 * usuário que entre com dados para os três funcionários criados. Ao final imprima
 * os valores fornecidos para estes funcionários.
 * 3. Altere a classe Funcionário para que esteja de acordo com as definições da
 * Orientação a Objetos com relação ao encapsulamento, ou seja, torne as
 * propriedades private e recompile a classe. Tente executar o programa.
 * 4. Altere a classe Funcionário adicionando métodos de acesso à classe de modo
 * que somente será possível ter acesso a estas variáveis mediante os métodos
 * criados.
 * 5. Altere o exercício 2 para que utilize os métodos ao invés das propriedades
 * diretamente.
 * 6. Crie um método construtor para a classe funcionário de modo que os valores
 * das propriedades sejam fornecidos na criação de um funcionário.
 * 7. Altere o exercício 2 para que utilize este novo método construtor.
 * 8. Faça um construtor que receba nome e função do funcionário, e conforme a
 * função o atributo salario receberá um valor correspondente.
 * - Função: diretor-salário: 5000,00
 * - Função: gerente-salário: 3000,00
 * - Função: vendedor-salário: 1000,00
 * 
 * @author João Pedro LPS
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Criação de vetor para receber objetos:        
        Employee[] emps;                                                //2
        emps = new Employee[3];
        
        //Método de Leitura:
        Scanner ler = new Scanner(System.in);
        
        //Definição de Objetos:
        System.out.println("Estabeleça atributos para:\n");
        for(int i=0; i<3; i++){
            //Criação de objeto dentro do vetor:
            emps[i] = new Employee();
            
            System.out.println("Nome do "+(i+1)+"º Empregado? ");       //5
            emps[i].setsName(ler.nextLine());
            System.out.println("Cargo do "+(i+1)+"º Empregado? ");
            emps[i].setsJob(ler.nextLine());
            
            //Definição de Salário conforme cargo:
            if(null != emps[i].getsJob())
            
            switch (emps[i].getsJob().toLowerCase()) {                                //8
                case "diretor":
                    emps[i].setdPaycheck(5000);
                    break;
                case "vendedor":
                    emps[i].setdPaycheck(1000);
                    break;
                case "gerente":
                    emps[i].setdPaycheck(3000);
                    break;
                default:
                    break;
            
            }
            
        }
        
        //Definição dos Atributos:
        Employee emp4;
        emp4 = new Employee("João Pedro", "CEO", 9500.00);
        
        //Relatório de Objetos Criados:
        int i;
        for(i=0; i<3; i++){
            System.out.println((i+1)+"º Empregado: "+emps[i].getsName()+", "+emps[i].getsJob()+", $"+emps[i].getdPaycheck()+".");
            
        }
        System.out.println((i+1)+"º Empregado: "+emp4.getsName()+", "+emp4.getsJob()+", $"+emp4.getdPaycheck()+".");
        
    }
}
