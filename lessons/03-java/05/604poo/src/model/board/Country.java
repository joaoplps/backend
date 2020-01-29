package model.board;

import model.player.Army;
import model.player.Color;
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
    
    public void assignArmy(Army a){
        if(army == null)
            army = a;
        
        else
            throw new IllegalStateException("A Country can't recieve this Army.");
    }
    
    public ArrayList<Country> neighboors(){
        return countries();
    }

    @Override
    public Color conquered() {
        if(army == null)
            return null;
        
        return army.color;
    }
}
