package model;

import java.util.ArrayList;

/**
 * @author LPS
 */
public abstract class ShowCase implements OfferDependent { //Showcase model, offer dependent;
    public ArrayList<Offer> offers;
    
    public ShowCase(String n){
        offers = new ArrayList();
    }
    
    public void addOffer(Offer o){ //Method to add one offer in the showcase;
        offers.add(o);
    }
    
    @Override
    public void updateOffers(Object o){ //Remove offer from showcase;
        Offer ofr = (Offer) o;
        offers.remove(ofr);
    }
    
    @Override
    public String toString() {
        return offers.toString();
    }
}
