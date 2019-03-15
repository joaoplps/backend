package Libraries;

import Books.Book;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author LPS
 */
public class Library {
    HashMap<String, ArrayList<Book>> idxAuth;
    HashMap<Integer, ArrayList<Book>> idxYear;
    HashMap<Enum, ArrayList<Book>> idxGen;
    
    public Library () {
        idxAuth = new HashMap();
        idxYear = new HashMap();
        idxGen = new HashMap();
    }
    
    public void RegisterBook(Book b){
        
    }
}
