package control.Characteristic;

import Books.Identity;

/**
 *
 * @author LPS
 */
public interface Identificable extends Identity {
    //Identificáveis através da identidade:
    public boolean sameId(Identity i);
}
