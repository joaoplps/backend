package pkg312poo;
/**
 *
 * @author João Pedro LPS
 */
public class Bubassaur extends PoketMonster {
    @Override
    public void MakeSound(){
        System.out.println("Bobbassaurrr!");
    }
    
    @Override
    public void Evolve(){
        super.setiLevel(super.getiLevel() + 1);
        
        switch (super.getiLevel()) {
            case 1:
                System.out.println("Bubassaur is now Ivysaur!");
                break;
            case 2:
                System.out.println("Ivysaur is now Venusaur!");
                break;
            default:
                System.out.println("Bubassaur already evolved.");
                break;
        }
    }
    
    @Override
    public void Attack(){
        if(super.getiLevel() < 1){System.out.println("Seed Attack!");}
        else{System.out.println("Big Tree Attack!!");}
    }
    
    @Override
    public void Deffense(){
        if(super.getiLevel() < 1){System.out.println("SafeHead Deffense!");}
        else{System.out.println("All in Deffense!!");}
    }
    
    //Construtores de Objetos:
    public Bubassaur(){}
    
    public Bubassaur(String sName, String sType, String sMaster, int iLevel){
        super.setsName(sName);
        super.setsType(sType);
        super.setsMaster(sMaster);
        super.setiLevel(iLevel);
    }
}
