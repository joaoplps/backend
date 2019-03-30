package control.Characteristic;

import Books.Identity;

/**
 *
 * @author LPS
 */
public abstract class Comparable implements Identificable {
    //Abstração de comparáveis compara identidade de objetos:
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Identity))
            return false;
        Identity i = (Identity) obj;
        return sameId(i);
    }

    //Retorna igualidade entre fichas técnicas:
    @Override
    public boolean sameId(Identity i) {
        return id().equals(i);
    }
}
