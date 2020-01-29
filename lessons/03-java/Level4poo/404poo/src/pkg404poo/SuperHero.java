package pkg404poo;
/**
 * Classe Abstrata: não permite criação de objetos!
 * Serve de referenciação, abstraindo e generalizando condições
 * de cada ator do programa.
 *
 * @author João Pedro LPS
 */
import java.util.Random;
public abstract class SuperHero {
    //Atributos Gerais:
    private String sName;
    private String sLocation;
    private String sSecretId;
    private String[] vsWeakSpots;
    private String[] vsSkills;
    private String[] vsEnemies;
    
    //Métodos Abstratos:
    public abstract void SpecialAttack();
    public abstract void Attack();
    public abstract void Deffend();

    //Get&Set:
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsLocation() {
        return sLocation;
    }
    public void setsLocation(String sLocation) {
        this.sLocation = sLocation;
    }

    public String getsSecretId() {
        return sSecretId;
    }
    public void setsSecretId(String sSecretId) {
        this.sSecretId = sSecretId;
    }

    public String[] getVsWeakSpots() {
        return vsWeakSpots;
    }
    public void setVsWeakSpots(String[] vsWeakSpots) {
        this.vsWeakSpots = vsWeakSpots;
    }

    public String[] getVsSkills() {
        return vsSkills;
    }
    public void setVsSkills(String[] vsSkills) {
        this.vsSkills = vsSkills;
    }

    public String[] getVsEnemies() {
        return vsEnemies;
    }
    public void setVsEnemies(String[] vsEnemies) {
        this.vsEnemies = vsEnemies;
    }
    
    public int RandomVilan(){
        //Gerar número aleatório:
        Random rand = new Random();
        int iNumber = rand.nextInt(vsEnemies.length);
        
        return iNumber;
    }
}
