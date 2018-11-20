package pkg309poo;
/**
 *
 * @author João Pedro LPS
 */
public class Contact {
    //Atributos Privados:
    private String sName;
    private String sPhone;
    
    //Métodos Construtores:
    public Contact(){}
    
    public Contact(String sName, String sPhone){
        this.sName = sName;
        this.sPhone = sPhone;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }
    
}
