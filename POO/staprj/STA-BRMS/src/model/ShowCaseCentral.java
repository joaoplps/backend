package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Facade Pattern
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
    public void newProduct(String n, String d, double p, int q){
        allProducts.put(n, new Product(n, d, p));
        Product prod = allProducts.get(n);
        allOffers.add(new Offer(q, prod));
    }
    
    //Return list of products by names
    public ArrayList<String> productsByName(){
        return new ArrayList(allProducts.keySet());
    }
    
    //Return list of offers by product name
    public ArrayList<Offer> offersByProduct(){
        return allOffers;
    }
    
    //Creates new known ShowCase
    public void newShowCase(String n){
        allShowCases.add(new ShowCase(n));
    }
}
