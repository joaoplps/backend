package pkg404poo;
/**
 *
 * @author João Pedro LPS
 */
public class LowHero extends SuperHero {
    //Atributo específico:
    private String sSpecialSkill;
    

    //Métodos Sobrescritos (Polimorfismo):
    @Override
    public void Attack() {
        System.out.println("Low Attack!");
    }
    @Override
    public void Deffend() {
        System.out.println("Low Deffense!");
    }
    @Override
    public void SpecialAttack() {
        System.out.println(getsSpecialSkill()+" Attack!!");
    }

    //Get&Set:
    public String getsSpecialSkill() {
        return sSpecialSkill;
    }
    public void setsSpecialSkill(String sSpecialSkill) {
        this.sSpecialSkill = sSpecialSkill;
    }
    
    //Métodos Construtores:
    public LowHero(){}
    
    public LowHero(String sName, String sLocation, String sSecretId, String sSpecialSkill, String[] vsWeakSpots, String[] vsSkills, String[] vsEnemies){
        super.setsName(sName);
        super.setsLocation(sLocation);
        super.setsSecretId(sSecretId);
        super.setVsWeakSpots(vsWeakSpots);
        super.setVsSkills(vsSkills);
        super.setVsEnemies(vsEnemies);
        this.sSpecialSkill = sSpecialSkill;
    }
    
}
