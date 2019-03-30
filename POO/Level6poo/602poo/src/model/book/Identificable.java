package model.book;

/**
 *
 * @author LPS
 */
public interface Identificable extends Id {
    //Identificáveis através da identidade:
    public boolean sameId(Id i);
}
