package pkg312poo;
/**
 * Continuação de Herança, Polimorfismo, Abstração de Classes e Sobrescrita de
 * Métodos:
 *
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {
        //Criação de Objetos e chamados de métodos:
        Pikachu pm0 = new Pikachu("Pikachu", "Terra", "Ash", 0);
        pm0.Attack();
        pm0.Deffense();
        pm0.Evolve();
        pm0.MakeSound();
        pm0.Evolve();
        pm0.Attack();
        pm0.Deffense();
        
        Charmander pm1 = new Charmander("José", "Fogo", "Ash", 0);
        pm1.Attack();
        pm1.Deffense();
        pm1.Evolve();
        pm1.MakeSound();
        pm1.Evolve();
        pm1.Attack();
        pm1.Deffense();
        
        Bubassaur pm2 = new Bubassaur("Bubba", "Terra", "Ash", 0);
        pm2.Attack();
        pm2.Deffense();
        pm2.Evolve();
        pm2.MakeSound();
        pm2.Evolve();
        pm2.Attack();
        pm2.Deffense();
        
        PoketMonster[] poketCapture = new PoketMonster[3];
        poketCapture[0] = pm0;
        poketCapture[1] = pm1;
        poketCapture[2] = pm2;
        
        PoketBall pokeBall = new PoketBall(poketCapture);
        pokeBall.ReleasePM();
        
    }
}
