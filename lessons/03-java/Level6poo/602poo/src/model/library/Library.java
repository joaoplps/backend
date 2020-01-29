package model.library;

import java.util.ArrayList;
import model.book.Book;
import model.shelf.IdxConstructor;
import model.shelf.Index;

/**
 *
 * @author LPS
 */
public class Library {
    private final ArrayList<Index> indexes;
    
    public Library () {
        indexes = IdxConstructor.createIndexes();
    }
    
    public void RegisterBook(Book b){
        for(Index i : indexes)
            i.addBook(b);
    }
}
