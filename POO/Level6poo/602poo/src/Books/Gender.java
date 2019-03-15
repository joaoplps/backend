package Books;

/**
 *
 * @author LPS
 */
public enum Gender {
    HORROR("terror"),
    FANTASY("fantasia"),
    FICTION("ficção");
    
    private final String sGName;
    
    private Gender(String n) {
        sGName = n;
    }

    @Override
    public String toString() {
        return sGName;
    }
}
