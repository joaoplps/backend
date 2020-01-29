package persistency;

import java.sql.ResultSet;
import java.sql.SQLException;
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
            ResultSet rs = cmd.executeQuery("SELECT id, name, description, price FROM product;");

            while (rs.next()) {

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return products;
    }

    public void insertProductInDB(String n, String d, double p) {

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("INSERT INTO product (" + n + ", " + d + ", " + p + ");");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

    }

    public void removeProductFromDB(String n) {

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("DELETE FROM product WHERE name = " + n + ");");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

    }

    public ArrayList<Offer> getOffersFromDB() {

        final ArrayList<Offer> offers = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT * FROM offer;");

            while (rs.next()) {

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return offers;
    }

    public void insertOfferInDB(int q, Product p) {

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("INSERT INTO offer (" + q + ", " + p.name + ");");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

    }

    public void removeOfferFromDB(Offer o) {

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("DELETE FROM offer WHERE name = " + o.product.name + ";");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
    }

    public void updateOfferFromDB(Offer o, int q) {

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("UPDATE offer SET quantity = " + q + " WHERE name = " + o.product.name + ";");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
    }
    
    public ArrayList<ShowCase> getShowCasesFromDB() {

        final ArrayList<ShowCase> showcases = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT * FROM showcase;");

            while (rs.next()) {

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return showcases;
    }

    public void addShowCaseInDB(String n) {

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("INSERT INTO showcase (" + n + ");");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

    }

    public void removeShowCaseFromDB(String n) {
        
        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("DELETE FROM showcase WHERE name = " + n + ";");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
        
    }
    
    public void updateShowCaseFromDB(ShowCase sc) {

        try {
            openConn();

            Statement cmd = createCmd();
//            cmd.executeUpdate("UPDATE showcase SET offer = " + ? + " WHERE name = " + sc.myName() + ";");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }
    }

}
