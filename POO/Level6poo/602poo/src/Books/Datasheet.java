
package Books;

/**
 *
 * @author LPS
 */
public class Datasheet {
    public final String sDName;
    public final String sDEd;
    public final String sDAuth;

    public Datasheet(String name, String ed, String auth) {
        sDName = name;
        sDEd = ed;
        sDAuth = auth;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Datasheet){
            Datasheet d = (Datasheet) o;
            return (sDName == d.sDName && sDEd == d.sDEd && sDAuth == d.sDAuth);
        }
        
        else if (o instanceof Book){
            Book b = (Book) o;
            return (equals(b.BDataS));
        }
            
        return false;
    }
        
}
