package model.book;

/**
 *
 * @author LPS
 */
public class DataSheet extends Comparable {
    public final String name, author;
    public final int edition;

    public DataSheet(String n, String a, int e) {
        name = n;
        author = a;
        edition = e;
    }

    @Override
    public DataSheet id() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Id) {
            DataSheet outra = ((Id) obj).id();
            return name.equals(outra.name) && author.equals(outra.author) && edition == outra.edition;
        }
        return false;
    }
}
