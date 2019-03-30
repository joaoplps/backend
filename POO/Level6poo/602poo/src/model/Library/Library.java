package model.Library;

import Books.Book;
import com.sun.java.util.jar.pack.ConstantPool.Index;
import java.util.ArrayList;

/**
 *
 * @author LPS
 */
public class Library {
    private final ArrayList<Index> indexes;
    
    public Library () {
        indexes = IndexConstructor.createIndexes();
    }
    
    public void RegisterBook(Book b){
        for(Index i : indexes)
            i.addBook(b);
    }
}
