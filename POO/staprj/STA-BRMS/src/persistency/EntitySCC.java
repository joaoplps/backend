package persistency;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Offer;
import model.Product;
import model.ShowCase;

/**
 *
 * @author LPS
 */
public class EntitySCC extends Entity {

    public ArrayList<Product> getProductsFromDB() {

        final ArrayList<Product> products = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT name, description, price FROM product;");

            while (rs.next()) {

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return products;
    }

    public ArrayList<ShowCase> getShowCasesFromDB() {

        final ArrayList<ShowCase> showcases = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT * FROM showcase;");

            while (rs.next()) {

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return showcases;
    }

    public ArrayList<Offer> getOffersFromDB() {

        final ArrayList<Offer> offers = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT * FROM offer;");

            while (rs.next()) {

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return offers;
    }
}
