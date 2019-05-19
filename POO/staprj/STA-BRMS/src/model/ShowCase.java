package model;

import java.util.ArrayList;

/**
 * Showcase
 * 
 *  A Showcase has a list of Offers
 * 
 * @author LPS
 */
public class ShowCase implements Observer { //Showcase model, offer dependent;
    private final String name;
    private final ArrayList<Offer> offers;
    
    public ShowCase(String n){
        name = n;
        offers = new ArrayList();
        validate();
    }
    
    private void validate(){ //Validate object;
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("ShowCase's attributes cannot be empty.");
    }
    
    public void addOffer(Offer o){ //Method to add one offer in the showcase;
        o.register(this);
        offers.add(o);
    }
    
    @Override
    public void update(Object o){ //Remove offer from showcase;
        Offer ofr = (Offer) o;
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
