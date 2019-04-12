package model;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public abstract class ObservedImpl implements Observed { //Implementation: type of observation)
    private final ArrayList<Observer> observers;
    
    protected ObservedImpl(){
        observers = new ArrayList();
    }
    
    @Override
    public void register(Observer od){
        observers.add(od);
    }
    
    @Override
    public void unregister(Observer od){
        observers.remove(od);
    }
    
    @Override
    public void notification(){ //Notify obervers;
        for(Observer od : observers)
            od.update(this);
    }
}
