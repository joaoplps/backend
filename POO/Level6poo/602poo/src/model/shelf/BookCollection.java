package model.shelf;

import java.util.ArrayList;
import model.book.Book;

/**
 *
 * @author jp
 */
public class BookCollection implements IdxInterface {
    private final ArrayList<Book> books;
    
    public BookCollection(){
        books = new ArrayList();
    }
    
    @Override
    public boolean addBook(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void removeBook(Book b){
        books.remove(b);
    }
    
}
