
package Books;

import Characteristics.Comparable;

/**
 *
 * @author LPS
 */
public class Datasheet extends Comparable {
    public final String sDName;
    public final String sDAuth;
    public final int iDEd;

    public Datasheet(String name, int ed, String auth) {
        sDName = name;
        iDEd = ed;
        sDAuth = auth;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Identity) {
            Datasheet d = ((Identity) o).id();
            return sDName.equals(d.sDName) && sDAuth.equals(d.sDAuth) && iDEd == d.iDEd;
        }
            
        return false;
    }

    @Override
    public Datasheet id() {
        return this;
    }
    
}
