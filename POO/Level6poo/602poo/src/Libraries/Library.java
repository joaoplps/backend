package Libraries;

import Books.Book;
import Books.Gender;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author LPS
 */
public class Library {
    HashMap<String, Collection> idxAuth, idxName;
    HashMap<Integer, Collection> idxYear;
    HashMap<Gender, Collection> idxGen;
    
    public Library () {
        idxAuth = new HashMap();
        idxYear = new HashMap();
        idxGen = new HashMap();
        idxName = new HashMap();
    }
    
    public void RegisterBook(Book b){
        //Criar coleção se não houver:
        if (!idxAuth.containsKey(b.BDataS.sDAuth))
            idxAuth.put(b.BDataS.sDAuth, new Collection());
            
        Collection c0 = idxAuth.get(b.BDataS.sDAuth);
        c0.AddBook(b);
        
        if (!idxYear.containsKey(b.iBYear))
            idxYear.put(b.iBYear, new Collection());
        
        Collection c1 = idxYear.get(b.iBYear);
        c1.AddBook(b);
        
        
        if (!idxGen.containsKey(b.BGender))
            idxGen.put(b.BGender, new Collection());
        
        Collection c2 = idxGen.get(b.BGender);
        c2.AddBook(b);
        
        if (!idxName.containsKey(b.BDataS.sDName))
            idxName.put(b.BDataS.sDName, new Collection());
        
        Collection c3 = idxName.get(b.BDataS.sDName);
        c3.AddBook(b);    
    }
}
