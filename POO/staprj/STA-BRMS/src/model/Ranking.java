package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Ranking {
    public String name;
    public ArrayList<Offer> offers;
    
    public Ranking(String n){
        offers = new ArrayList();
        name = n;
        validate();
    }
    
    private void validate(){
        if(name == null)
            throw new IllegalArgumentException("The ranking's name cannot be empty.");
    }
    
    public void addOffer(Offer o){
        offers.add(o);
    }

    @Override
    public String toString() {
        return name;
    }
}
