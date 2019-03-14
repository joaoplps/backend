package Books;

/**
 *
 * @author LPS
 */
public class Book {
    public final Datasheet BDataS;
    public final String sBGender;
    public final int iBYear;
    
    public Book(Datasheet ds, String gen, int y){
        BDataS = ds;
        sBGender = gen;
        iBYear = y;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Book){
            Book b = (Book) o;
            return (BDataS.equals(b.BDataS));
        }
        
        else if (o instanceof Datasheet){
            Datasheet d = (Datasheet) o;
            return (BDataS.equals(d));
        }
            
        return false;
    }
}
