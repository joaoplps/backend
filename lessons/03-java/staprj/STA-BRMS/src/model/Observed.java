package model;

import java.util.ArrayList;

/**
 * @author LPS
 */
public interface Observed { //Observed pattern for Offer;

    public void register(Observer or);

    public void unregister(Observer or);

    public void notification();
}
