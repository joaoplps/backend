package model.book;

/**
 *
 * @author LPS
 */
public enum Gender {
    HORROR("Terror"),
    FANTASY("Fantasia"),
    FICTION("Ficção");
    
    private final String name;
    
    private Gender(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }
}
