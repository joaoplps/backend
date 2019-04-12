package model;

/**
 *
 * @author LPS
 */
class Registry {
    private int entryTime, leaveTime;
    private String plate;

    private void validate() {
        if(entryTime < 0 || leaveTime < 0)
            throw new IllegalArgumentException("Time cannot be negative.");
    }
    
    Registry(int e, int l, String p) {
        entryTime = e;
        leaveTime = l;
        plate = p;
        validate();
    }

    @Override
    public String toString() {
        return "[ " + entryTime + ", " + leaveTime + " ]";
    }
    
    
}
