package model;

import java.util.ArrayList;

/**
 * @author LPS
 */
public abstract class OfferSubject { //Observed pattern for Offer;
    private ArrayList<OfferDependent> observers;
    
    protected OfferSubject(){
        observers = new ArrayList();
    }
    
    public void register(OfferDependent od){
        observers.add(od);
    }
    
    public void unregister(OfferDependent od){
        observers.remove(od);
    }
    
    protected void notification(){ //Notify obervers;
        for(OfferDependent od : observers)
            od.updateOffers(this);
    }
}
