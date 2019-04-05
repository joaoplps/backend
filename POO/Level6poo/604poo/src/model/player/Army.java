package model.player;
/**
 *
 * @author LPS
 */
public class Army {
    //Quantidade e cor como atributos:
    private int units;
    public final Color color;
    
    public Army(int q, Color c){
        units = q;
        color = c;

        validate();
    }
    
    private void validate(){
        if(color == null)
            throw new IllegalStateException("The color can't be null.");
        
        if(power() < 1)
            throw new IllegalStateException("The quantity can't be minor than one.");
    }
    
    //Método de retorno do Poder:
    public int power(){
        return units;
    }
}
