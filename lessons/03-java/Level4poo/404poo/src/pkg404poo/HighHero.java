package pkg404poo;
/**
 *
 * @author João Pedro LPS
 */
public class HighHero extends SuperHero {
    //Atributos Específicos:
    private String sPwrOrigin;
    
    //Métodos Sobrescritos (Polimorfismo):
    @Override
    public void Attack() {
        System.out.println("High Attack!");
    }
    @Override
    public void Deffend() {
        System.out.println("High Deffense!");
    }
    @Override
    public void SpecialAttack() {
        System.out.println("There's no Special nothing!");
    }

    //Get&Set:
    public String getsPwrOrigin() {
        return sPwrOrigin;
    }
    public void setsPwrOrigin(String sPwrOrigin) {
        this.sPwrOrigin = sPwrOrigin;
    }
    
    //Métodos Construtores:
    public HighHero(){}
    
    public HighHero(String sName, String sLocation, String sSecretId, String sPwrOrigin, String[] vsWeakSpots, String[] vsSkills, String[] vsEnemies){
        super.setsName(sName);
        super.setsLocation(sLocation);
        super.setsSecretId(sSecretId);
        super.setVsWeakSpots(vsWeakSpots);
        super.setVsSkills(vsSkills);
        super.setVsEnemies(vsEnemies);
        this.sPwrOrigin = sPwrOrigin;
    }
    
}
