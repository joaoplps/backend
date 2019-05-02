package model;

/**
 *
 * @author LPS
 */
public class ParkOccurrences {
    public final int entryTime, leaveTime;
    
    public ParkOccurrences(int e, int l){
        entryTime = e;
        leaveTime = l;
    }
    
    public int period(){
        return leaveTime - entryTime;
    }
}
