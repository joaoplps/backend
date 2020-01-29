package model;

import java.util.HashMap;

/**
 * @author LPS
 */
public class Cart {

    public final HashMap<Offer, Integer> items;

    public Cart() {
        items = new HashMap();
    }

    public void addItem(Offer o, int q) {
        if (items.containsKey(o)) {
            items.put(o, q);
        }
    }

    private void sell() {

    }

    private void cancel() {

    }
}
