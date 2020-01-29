package model.board;

import model.player.Color;
import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public abstract class Territory {
    public final String name;
    protected ArrayList<Country> countries;
    
    protected Territory(String n){
        name = n;
        validate();
        
        countries = new ArrayList();
    }
    
    private void validate(){
        if(name == null)
            throw new IllegalStateException("The name can't be null.");
    }
    
    public ArrayList<Country> countries(){
        return countries;
    }
    
    public abstract Color conquered();
}
