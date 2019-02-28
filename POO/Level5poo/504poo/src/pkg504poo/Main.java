package pkg504poo;

import Rangers.PowerRanger;
import java.util.Scanner;

/**
 * Project: Singleton Model.
 *
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        //Entrada de usuário:
        int aux = 0;
        
        while (aux <= 2){
        System.out.println("Insira a cor:");
        Scanner scan = new Scanner(System.in);
        String sColor = scan.next();
        PowerRanger.NewRanger(sColor);
        
        aux++;
        }
        
        //Printing Refs:
        System.out.println(PowerRanger.ranger1);
        System.out.println(PowerRanger.ranger2);
    }
}
