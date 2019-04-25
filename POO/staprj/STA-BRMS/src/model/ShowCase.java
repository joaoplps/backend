package model;

import java.util.ArrayList;

/**
 * Showcase
 * 
 *  A Showcase has a list of Offers
 * 
 * @author LPS
 */
public abstract class ShowCase implements Observer { //Showcase model, offer dependent;
    private ArrayList<Offer> offers;
    
    public ShowCase(){
        offers = new ArrayList();
    }
    
    public void addOffer(Offer o){ //Method to add one offer in the showcase;
        o.register(this);
        offers.add(o);
    }
    
    @Override
    public void update(Object o){ //Remove offer from showcase;
        Offer ofr = (Offer) o;
        ofr.unregister(this);
        offers.remove(ofr);
    }
    
    public ArrayList<Offer> offers(){
        return offers;
    }
    
    @Override
    public String toString() {
        return offers.toString();
    }
}
