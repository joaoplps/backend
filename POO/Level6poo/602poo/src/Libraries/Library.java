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
    HashMap<String, Collection> idxAuth;
    HashMap<Integer, Collection> idxYear;
    HashMap<Gender, Collection> idxGen;
    
    public Library () {
        idxAuth = new HashMap();
        idxYear = new HashMap();
        idxGen = new HashMap();
    }
    
    public void RegisterBook(Book b){
        
    }
}
