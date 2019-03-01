package DataStructure;
/**
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
    
    private Nipes(int val, String n){
        iNipeValue = val;
        sNipeName = n;
    }
    
    @Override
    public String toString() {
        return sNipeName;
}
}
