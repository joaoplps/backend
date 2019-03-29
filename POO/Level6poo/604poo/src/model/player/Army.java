package model.player;
/**
 *
 * @author LPS
 */
public class Army {
    //Quantidade e cor como atributos:
    private int quantity;
    public final Color color;
    
    public Army(int q, Color c){
        quantity = q;
        color = c;

        validate();
    }
    
    private void validate(){
        if(color == null)
            throw new IllegalStateException("The color can't be null.");
        
        if(quantity < 1)
            throw new IllegalStateException("The quantity can't be minor than one.");
    }
    
    //Método de retorno do Poder:
    public int power(){
        return quantity;
    }
}
