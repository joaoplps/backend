package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public abstract class ShowCase {
    public String name;
    public ArrayList<Offer> offers;
    
    public ShowCase(String n){
        offers = new ArrayList();
    }
    
    public void addOffer(Offer o){
        offers.add(o);
    }

    @Override
    public String toString() {
        return name;
    }
}
