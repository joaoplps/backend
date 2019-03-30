package model.book;

/**
 *
 * @author LPS
 */
public abstract class Comparable implements Identificable {
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Id))
            return false;
        
        Id i = (Id) obj;
        
        return sameId(i);
    }

    @Override
    public boolean sameId(Id i) {
        return id().equals(i);
    }
}
