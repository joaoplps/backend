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
    public static PowerRanger ranger1;
    public static PowerRanger ranger2;
    
    String sRangeColor;
    
    private PowerRanger(String color){
        sRangeColor = color;
    }
    
    public static void NewRanger(String color){
        if (ranger1 == null)
            ranger1 = new PowerRanger(color);
        else if (ranger2 == null)
            ranger2 = new PowerRanger(color);
    }
    
    @Override
    public String toString(){
        return "I'm the " + sRangeColor + " one!";
    }
}
