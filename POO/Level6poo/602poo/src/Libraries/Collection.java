package Libraries;

import Books.Book;
import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Collection implements IdxInterface {
    ArrayList<Book> collection;
    
    public Collection(){
        collection = new ArrayList();
    }
    
    @Override
    public boolean AddBook(Book b){
        if (!collection.contains(b))
            collection.add(b);
        
        else
            System.out.println("O livro já existe na coleção!");
    }
   
}
