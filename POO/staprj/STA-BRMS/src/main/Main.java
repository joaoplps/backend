package main;

import model.ShowCase;
import model.ShowCaseCentral;

/**
 *
 * @author PGS @LPS
 */
public class Main {
    public static void main(String[] args) {
        
        //Using ShowCaseCentral
        ShowCaseCentral SCC = new ShowCaseCentral();
        SCC.newProduct("Brownie Tradicional", "Validade 5 dias.", 5.50);
        SCC.newProduct("Brownie Castanha", "Validade 5 dias.", 6.50);
        SCC.newProduct("Brownie Damasco", "Validade 5 dias.", 6.50);
        
        SCC.newOffer("Brownie Tradicional", 25);
        SCC.newOffer("Brownie Castanha", 10);
        SCC.newOffer("Brownie Damasco", 10);
        
        SCC.newShowCase("ShowCase 1");
        SCC.newShowCase("ShowCase 2");
        
        SCC.offerProduct(0, 0);
        SCC.offerProduct(1, 1);
        SCC.offerProduct(2, 1);
        
        SCC.getShowCase(0).offers().get(0).sell(25);
        
    }
}
