package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Ranking {
    public ArrayList<Offer> offers;
    
    public Ranking(){
        offers = new ArrayList();
    }
    
    public void addOffer(Offer o){
        offers.add(o);
    }
}
