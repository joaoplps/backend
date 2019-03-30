package model.book;

/**
 *
 * @author LPS
 */
public class Book extends Comparable {
    public final DataSheet datasheet;
    public final Gender gender;
    public final int year;

    public Book(DataSheet ds, Gender g, int y) {
        datasheet = ds;
        gender = g;
        year = y;
    }

    @Override
    public DataSheet id() {
        return datasheet;
    }
}
