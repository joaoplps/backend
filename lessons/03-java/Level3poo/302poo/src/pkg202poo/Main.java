package pkg202poo;
/**
 * Método Construtor: Get & Set!!! Construção das variáveis, posicionamento
 * de dados.
 * 
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {
        //Criação de Objeto:
        String[] heropowers, heroenemies;
        heropowers = new String[2];
        heroenemies = new String[3];
        heropowers[0] = "Money";
        heropowers[1] = "Martial Arts";
        heroenemies[0] = "Joker";
        heroenemies[1] = "Penguin";
        heroenemies[2] = "Riddler";
        
        Superhero hero1 = new Superhero("Batman", "Bruce Wayne", heropowers, "Gothan City", "Bats", heroenemies);
        
        System.out.println(hero1);
        
    }
}
