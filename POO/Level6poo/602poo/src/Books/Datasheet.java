
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
    
    public boolean CheckDS(Datasheet ds){
        return sDName == ds.sDName && sDEd == ds.sDEd && sDAuth == ds.sDAuth;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Datasheet){
            Datasheet d = (Datasheet) o;
            return CheckDS(d);
        }
        
        else if (o instanceof Book){
            Book b = (Book) o;
            b.BDataS.CheckDS(this);
        }
            
        return false;
    }
        
}
