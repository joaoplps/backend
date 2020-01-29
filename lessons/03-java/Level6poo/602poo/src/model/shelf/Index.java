package model.shelf;

import model.book.Book;

/**
 *
 * @author jp
 */
public abstract class Index implements IdxInterface {
    protected abstract BookCollection findColl(Book b);
    protected abstract void addIdx(Book b, BookCollection col);
    
    @Override
    public boolean addBook(Book b) {
        BookCollection col = findColl(b);
        
        if(col == null) {
            col = new BookCollection();
            addIdx(b, col);
        }
        
        return col.addBook(b);
    }
}
