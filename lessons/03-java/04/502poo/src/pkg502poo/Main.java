package pkg502poo;
/**
 * Herança, Polimorfismo, Enumerados e Especialização.
 * 
 * 
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {

        //MARIO:
        //Retorna Estado:
        System.out.println(Character.MARIO.getCharState());
                
        //Ranga o cogu:
        Item.COGUMELOVERMELHO.incrementow.ApllyEffect(Character.MARIO);
        System.out.println(Character.MARIO.getCharState());
        
        //Retorna Yoshi:
        System.out.println(Character.MARIO.isbOnYoshi());
        
        //Monta no Yoshi:
        Item.YOSHI.incrementow.ApllyEffect(Character.MARIO);
        System.out.println(Character.MARIO.isbOnYoshi());
        
        //Pega a Pena:
        Item.PENA.incrementow.ApllyEffect(Character.MARIO);
        System.out.println(Character.MARIO.getCharState());
        
        //String to String:
        System.out.println(Character.MARIO);
        
        //LUIGGI:
        //Retorna Estado:
        System.out.println(Character.LUIGGI.getCharState());
                
        //Pega a pena:
        Item.PENA.incrementow.ApllyEffect(Character.LUIGGI);
        System.out.println(Character.LUIGGI.getCharState());
        
        //Retorna Yoshi:
        System.out.println(Character.LUIGGI.isbOnYoshi());
        
        //Monta no Yoshi:
        Item.YOSHI.incrementow.ApllyEffect(Character.LUIGGI);
        System.out.println(Character.LUIGGI.isbOnYoshi());
        
        //Pega a flor de fogo:
        Item.FLORDEFOGO.incrementow.ApllyEffect(Character.LUIGGI);
        System.out.println(Character.LUIGGI.getCharState());
        
        //String to String:
        System.out.println(Character.LUIGGI);
        
    }
}