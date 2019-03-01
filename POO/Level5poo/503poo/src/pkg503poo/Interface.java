package pkg503poo;

import java.util.Scanner;

/**
 * Classe estatica para realizar interacoes com o usuario.
 * 
 * @author LPS
 */
public class Interface {
    private static final Scanner sc = new Scanner(System.in);
    
    private Interface(){}
    
    public static void inform(String msg) {
        System.out.println(msg);
    }
    
    public static int informInt(String msg) {
        inform(msg);
        return sc.nextInt();
    }
    
    public static int informInt() {
        return sc.nextInt();
    }
    
    public static boolean informBoolean(String msg) {
        inform(msg);
        return sc.nextInt() == 0;
    }
    
    public static boolean informBoolean() {
        return sc.nextInt() == 0;
    }
}
