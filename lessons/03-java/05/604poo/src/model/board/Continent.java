package model.board;

import model.player.Color;
import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Continent extends Territory {
    public Continent(String n, ArrayList<Country> c) {
        super(n);
        validate(c);
        
        countries.addAll(c);
    }
    
    private void validate(ArrayList<Country> c) {
        if(c == null || c.size() < 1)
            throw new IllegalArgumentException("Continents must have at least one country.");
    }

    @Override
    public Color conquered() {
        Color c = countries.get(0).conquered();
        
        for(Country y : countries)
            if(c != y.conquered())
                return null;
        
        return c;    
    }
}
