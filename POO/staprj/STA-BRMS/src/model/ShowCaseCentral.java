package model;

import java.util.ArrayList;
import java.util.HashMap;
import persistency.EntityCentral;

/**
 * Facade Pattern
 *
 * @author LPS
 */
public class ShowCaseCentral {

    private final HashMap<String, Product> allProducts;
    private final ArrayList<Offer> allOffers;
    private final ArrayList<ShowCase> allShowCases;

    public ShowCaseCentral() {
        allProducts = new HashMap();
        for (Product p : EntityCentral.scc.getProductsFromDB()) {
            allProducts.put(p.name, p);
        }

        allOffers = new ArrayList();
        for (Offer o : EntityCentral.scc.getOffersFromDB()) {
            allOffers.add(o);
        }

        allShowCases = new ArrayList();
        for (ShowCase sc : EntityCentral.scc.getShowCasesFromDB()) {
            allShowCases.add(sc);
        }
    }

    //Creates a new known Product
    public void newProduct(String n, String d, double p) {
        EntityCentral.scc.insertProductInDB(n, d, p);
        allProducts.put(n, new Product(n, d, p));
    }

    //Remove a product from the system (hashmap and db)
    public void removeProduct(String n) {
        allProducts.remove(n);
        EntityCentral.scc.removeProductFromDB(n);
    }

    //Return list of products by names
    public ArrayList<String> productsByName() {
        return new ArrayList(allProducts.keySet());
    }

    //Creates a new known Offer
    public void newOffer(String n, int q) {
        if (!allProducts.containsKey(n)) {
            return;
        }
        Product p = allProducts.get(n);
        allOffers.add(new Offer(q, p));
        EntityCentral.scc.insertOfferInDB(q, p);
    }

    //Remove offer from system (db and endOffer method)
    public void removeOffer(Offer o) {
        EntityCentral.scc.removeOfferFromDB(o);
        o.endOffer();
    }

    //Updating offer
    public void updateOffer(Offer o, int i) {
        int q = allOffers.get(i).quantity();
        EntityCentral.scc.updateOfferFromDB(o, q);
    }

    //Creates new known ShowCase
    public void newShowCase(String n) {
        allShowCases.add(new ShowCase(n));
    }

    //Add Offer to ShowCase
    public void offerProduct(int io, int isc) {
        Offer o = getOfferByIndex(io);
        ShowCase sc = getShowCaseByIndex(isc);
        sc.addOffer(o);
    }

    //Get ShowCase by Index
    private ShowCase getShowCaseByIndex(int isc) {
        return allShowCases.get(isc);
    }

    //Get Offer by Index
    private Offer getOfferByIndex(int io) {
        return allOffers.get(io);
    }
}
