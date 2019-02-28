package Rangers;
/**
 * Project: Singleton Model.
 * - Creating static objects with private constructors;
 * - Constant objects;
 * - Override object ref with toString();
 *
 * @author LPS
 */
public class PowerRanger {
    public static final PowerRanger ranger1 = new PowerRanger("White");
    public static final PowerRanger ranger2 = new PowerRanger("Black");
    
    String sRangeColor;
    
    private PowerRanger(String color){
        sRangeColor = color;
    }
    
    @Override
    public String toString(){
        return "I'm the " + sRangeColor + " one!";
    }
}
