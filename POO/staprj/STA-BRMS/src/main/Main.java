package main;

import model.ShowCaseCentral;

/**
 *
 * @author PGS @LPS
 */
public class Main {
    public static void main(String[] args) {
        
        //Using ShowCaseCentral
        ShowCaseCentral SCC = new ShowCaseCentral();
        SCC.newProduct("Brownie", "Tradicional", 5.50, 20);
        SCC.newProduct("Brownie", "Castanha", 5.50, 15);
        SCC.newProduct("Brownie", "Damasco", 5.50, 10);
        
    }
}
