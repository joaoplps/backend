package model;

import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public abstract class OfferSubject {
    private ArrayList<OfferDependent> observers;
    
    protected OfferSubject(){
        observers = new ArrayList();
    }
    
    public void register(OfferDependent o){
        observers.add(o);
    }
    
    public void unregister(OfferDependent o){
        observers.remove(o);
    }
    
    protected void notification(){
        for(OfferDependent o : observers)
            o.update(this);
    }
}
