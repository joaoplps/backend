package pkg312poo;
/**
 * Classe Abstrata: não permite criação de objetos.
 * Serve de referenciação, abstraindo e generalizando condições
 * de cada ator do programa.
 *
 * @author João Pedro LPS
 */
public abstract class PoketMonster {
    //Atributos Gerais:
    private String sName;
    private String sType;
    private String sMaster;
    private int iLevel;
    
    //Métodos Abstratos:
    public abstract void MakeSound();
    public abstract void Evolve();
    public abstract void Attack();
    public abstract void Deffense();

    //Métodos Construtores Públicos:
    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getsMaster() {
        return sMaster;
    }

    public void setsMaster(String sMaster) {
        this.sMaster = sMaster;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getiLevel() {
        return iLevel;
    }

    public void setiLevel(int iLevel) {
        this.iLevel = iLevel;
    }
    
}
