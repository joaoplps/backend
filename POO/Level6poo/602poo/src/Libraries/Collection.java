package Libraries;

import Books.Book;
import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Collection {
    ArrayList<Book> collection;
    
    public Collection(){
        collection = new ArrayList();
    }
    
    public void AddBook(Book b){
        if (collection.contains(b))
            collection.add(b);
        
        else
            System.out.println("O livro já existe na coleção!");
    }
}
