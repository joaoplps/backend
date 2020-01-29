package pkg404poo;
/**
 * 
 *
 * @author João Pedro LPS
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Criação de Objetos:
        String[] lhero0ENMY = new String[3];
        lhero0ENMY[0] = "Joker";
        lhero0ENMY[1] = "Charade";
        lhero0ENMY[2] = "Penguin";
        String[] lhero0SKLS = new String[2];
        lhero0SKLS[0] = "Ninja";
        lhero0SKLS[1] = "Samurai";
        String[] lhero0WEAK = new String[2];        
        lhero0WEAK[0] = "Robin";
        lhero0WEAK[1] = "Alfred";
        LowHero lhero0 = new LowHero("Batman", "Gothan City", "Bruce Wayne", "Ninjitsu", lhero0ENMY, lhero0SKLS, lhero0WEAK);
        
        lhero0.Attack();
        lhero0.Deffend();
        lhero0.SpecialAttack();
        lhero0.RandomVilan();
        
        String[] hhero0ENMY = new String[1];
        lhero0ENMY[0] = "Lex Luthor";
        String[] hhero0SKLS = new String[2];
        lhero0SKLS[0] = "X-Ray Vision";
        lhero0SKLS[1] = "Super Strength";
        String[] hhero0WEAK = new String[2];
        lhero0WEAK[0] = "Kryptonite";
        lhero0WEAK[1] = "Lois Lane";
        HighHero hhero0 = new HighHero("SuperMan", "Metropolis", "Clark Kent", "Krypton", lhero0ENMY, lhero0SKLS, lhero0WEAK);

        hhero0.Attack();
        hhero0.Deffend();
        hhero0.SpecialAttack();
        hhero0.RandomVilan();
    }
}
