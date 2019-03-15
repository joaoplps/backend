package DataStructure;
/**
 * ***Os Naipe são Ouro, Paus, Copas e Espadas.
 *
 * @author LPS
 */
public enum Nipes {
    ESPADAS(0, "Espadas"),
    OURO(1, "Ouro"),
    COPAS(2, "Copas"),
    PAUS(3, "Paus");
    
    public final int iNipeValue;
    public final String sNipeName;
    
    //Construtor:
    private Nipes(int val, String n){
        iNipeValue = val;
        sNipeName = n;
    }
    
    //Identificador:
    @Override
    public String toString() {
        return sNipeName;
}
}
