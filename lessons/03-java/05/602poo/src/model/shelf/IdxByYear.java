package model.shelf;

import java.util.HashMap;
import model.book.Book;

/**
 *
 * @author jp
 */
public class IdxByYear extends Index {
    public final HashMap<Integer, BookCollection> index;
    
    public IdxByYear(){
        index = new HashMap();
    }

    @Override
    protected BookCollection findColl(Book b) {
        return index.get(b.year);
    }

    @Override
    protected void addIdx(Book b, BookCollection col) {
        index.put(b.year, col);
    }
    
    
}
