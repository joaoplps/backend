package pkg506poo;

import java.util.Scanner;

/**
 *
 * @author LPS
 */
public class UserInterface {
    private static final Scanner sc = new Scanner(System.in);
    
    private UserInterface(){}
    
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
