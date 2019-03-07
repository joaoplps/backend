package pkg506poo;

/**
 * O Pescador Mentiroso.
 *
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        int iRealCatch, iFisherCatch;
        
        iRealCatch = UserInterface.informInt("Quantos kg de peixe o pescador de fato pegou?");
        iFisherCatch = UserInterface.informInt("Quantos kg de peixe o pescador diz que pegou?");
        
        if(fisher.iBoatCap >= iFisherCatch)
            System.out.println("Possivelmente é verdade.");
        else
            System.out.println("É mentira.");
    }
}
