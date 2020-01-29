package pkg312poo;
/**
 *
 * @author João Pedro LPS
 */
public class Charmander extends PoketMonster {
    @Override
    public void MakeSound(){
        System.out.println("Char Charrr!");
    }
    
    @Override
    public void Evolve(){
        super.setiLevel(super.getiLevel() + 1);
        
        switch(super.getiLevel()){
            case 1:
                System.out.println("Charmander is now Charmeleon!");
                break;
            case 2:
                System.out.println("Charmeleon is now Charizard!");
                break;
            case 3:
                System.out.println("Charmander already evolved.");
                break;
            default:
                break;
        }
    }
    
    @Override
    public void Attack(){
        if(super.getiLevel() < 1){System.out.println("Firetwist Attack!");}
        else{System.out.println("More Fire Attack!!");}
    }
    
    @Override
    public void Deffense(){
        if(super.getiLevel() < 1){System.out.println("Wings Deffense!");}
        else{System.out.println("Fleed Away Deffense!!");}
    }
    
    //Construtores de Objetos:
    public Charmander(){}
    
    public Charmander(String sName, String sType, String sMaster, int iLevel){
        super.setsName(sName);
        super.setsType(sType);
        super.setsMaster(sMaster);
        super.setiLevel(iLevel);
    }
}
