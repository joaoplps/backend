package pkg401poo;
/**
 * MasterChef
 * 1. Construa um programa para armazenar informações de pratos culinários.
 * ● Peça as informações ao usuário e capture-as para preencher objetos do
 * tipo Prato (crie os objetos);
 * ● Mostre os valores dos objetos criados;
 *
 * @author João Pedro LPS
 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Criação de Objetos com JOptionPane:
        String r = "n";
        int qtd;
        
        do{        
            //Coleta de Dados:
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos pratos deseja inserir?\n"));

            //Criação de Array de Objetos:
            Prato[] pratos = new Prato[qtd];

            //Looping para definir Atributos:
            for(int i = 0; i < qtd; i++){
                //Criação de Objeto:
                Prato prato = new Prato();
                
                prato.setsName(JOptionPane.showInputDialog("Qual é o nome do Prato?"));
                prato.setsCategory(JOptionPane.showInputDialog("Qual é a categoria do Prato? Entrada, Principal ou Sobremesa?"));
                prato.setsCheff(JOptionPane.showInputDialog("Qual é o nome do Cheff?"));
                prato.setsIngredients(JOptionPane.showInputDialog("Quais os ingredientes do Prato?"));
                prato.setdPrice(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor final do Prato?")));
                
                pratos[i] = prato;
                
            }
            
            //Mostrar valores criados:
            System.out.println("\nCARDAPIO\n");
            for(int i = 0; i <qtd; i++){
                System.out.println("----------------------------");
                System.out.println(
                    pratos[i].getsName()+"\n"+
                    pratos[i].getsCategory()+"\n"+
                    pratos[i].getsCheff()+"\n"+
                    pratos[i].getsIngredients()+"\n"+
                    pratos[i].getdPrice()+"\n"
                );
            }
            System.out.println("----------------------------");
            
            //Verificação de variável:
            do{
                //Começar o programa novamente:
                r = JOptionPane.showInputDialog("Deseja inserir mais pratos (s = refazer / n = prosseguir)?");
                if(!"s".equals(r) && !"n".equals(r)){System.out.println("Somente s ou n.\n");}
                
            }while(!"s".equals(r) && !"n".equals(r));
            
            //2ª Parte: Cliente:
            System.out.println("Mas antes, ouvi dizer que o cliente gostaria de saber mais sobre os pratos abaixo de $30,00... Aqui vai!\n");
            double aux;
            System.out.println("----------------------------");
            for(int i = 0; i < qtd; i++){
                aux = pratos[i].getdPrice();
                if(aux < 30.00){
                    System.out.println(
                        pratos[i].getsName()+"\n"+
                        pratos[i].getsCategory()+"\n"+
                        pratos[i].getsCheff()+"\n"+
                        pratos[i].getsIngredients()+"\n"+
                        pratos[i].getdPrice()+"\n"
                    );
                    System.out.println("----------------------------");
                }
            
            }
        
        }while("s".equals(r));
        
        System.out.println("SeeYa!");
        
    }
}
