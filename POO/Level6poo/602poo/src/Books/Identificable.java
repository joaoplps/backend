package Books;

/**
 *
 * @author LPS
 */
public interface Identificable extends Identity {
    //Identificáveis através da identidade:
    public boolean sameId(Identity i);
}
