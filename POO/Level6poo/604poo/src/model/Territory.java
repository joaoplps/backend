package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public abstract class Territory {
    public final String name;
    protected ArrayList<Country> territories;
    
    protected Territory(String n){
        name = n;
        validateCreation();
        
        territories = new ArrayList();
    }
    
    private void validateCreation(){
        if(name == null)
            throw new IllegalStateException("The name can't be null.");
    }
    
    public ArrayList territories(){
        return territories;
    }
    
    public abstract Color conquered();
}
