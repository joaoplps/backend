package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Country extends Territory {
    private Army army;

    public Country(String n) {
        super(n);
    }
    
    public Army troops(){
        return army;
    }
    
    public ArrayList<Country> neighboors(){
        return territories;
    }

    @Override
    public Color conquered() {
        if(army == null)
            return null;
        
        else
            return army.color;
    }
}
