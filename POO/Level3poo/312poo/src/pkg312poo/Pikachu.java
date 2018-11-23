package pkg312poo;
/**
 *
 * @author João Pedro LPS
 */
public class Pikachu extends PoketMonster {
    //Métodos Específicos Sobrescritos (Polimorfismo):
    @Override
    public void MakeSound(){
        System.out.println("Pika Pikaaa!");
    }
    
    @Override
    public void Evolve(){
        super.setiLevel(super.getiLevel() + 1);
        
        if(super.getiLevel() == 1){System.out.println("Pikachu is now Raichu!");}
        else{System.out.println("Pikachu already evolved to Raichu.");}
    }
    
    @Override
    public void Attack(){
        if(super.getiLevel() < 1){System.out.println("Eletric Attack!");}
        else{System.out.println("Thunder Attack!!");}
    }
    
    @Override
    public void Deffense(){
        if(super.getiLevel() < 1){System.out.println("Tail Deffense!");}
        else{System.out.println("'That's all you got?!' Deffense!!");}
    }
    
    //Construtores de Objetos:
    public Pikachu(){}
    
    public Pikachu(String sName, String sType, String sMaster, int iLevel){
        super.setsName(sName);
        super.setsType(sType);
        super.setsMaster(sMaster);
        super.setiLevel(iLevel);
    }
}
