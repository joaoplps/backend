package pkg502poo;
/**
 * Herança, Polimorfismo, Enumerados e Especialização.
 * 
 * 
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        //Retorna Estado:
        System.out.println(Character.MARIO.getiState());
                
        //Ranga o cogu:
        Item.COGUMELOVERMELHO.incrementow.ApllyEffect(Character.MARIO);
        System.out.println(Character.MARIO.getiState());
        
        //Retorna Yoshi:
        System.out.println(Character.MARIO.isbOnYoshi());
        
        //Monta no Yoshi:
        Item.YOSHI.incrementow.ApllyEffect(Character.MARIO);
        System.out.println(Character.MARIO.isbOnYoshi());
        
        //Pega a Pena:
        Item.PENA.incrementow.ApllyEffect(Character.MARIO);
        System.out.println(Character.MARIO.getiState());
    }
}