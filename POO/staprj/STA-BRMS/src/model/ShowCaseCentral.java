
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author aluno
 */
public class ShowCaseCentral {
    private final HashMap<String, Product> allProducts;
    private final ArrayList<Offer> allOffers;
    private final ArrayList<ShowCase> allShowCases;
    
    public ShowCaseCentral(){
        allProducts = new HashMap();
        allOffers = new ArrayList();
        allShowCases = new ArrayList();
    }
    
    //Creates a new known Product
    public void newProduct(String n, String d, int p){
        allProducts.put(n, new Product(n, d, p));
    }
    
    //Return list of products by names
    public ArrayList<String> productsByName(){
        return new ArrayList(allProducts.keySet());
    }
    
    //Creates a new known Offer
    public void newOffer(String n, int q){
        if(!allProducts.containsKey(n))
            return;
        Product p = allProducts.get(n);
        allOffers.add(new Offer(q, p));
    }
    
    //Return list of offers by product name
    public ArrayList<Offer> offersByProduct(){
        return allOffers;
    }
    
    //Creates new known ShowCase
    public void newShowCase(String r){
        allShowCases.add(new ShowCase(r));
    }
}
