package model;

/**
 *
 * @author LPS
 */
public class ParkOccr {
    public final int entryTime, leaveTime;
    
    ParkOccr(int e, int l){
        entryTime = e;
        leaveTime = l;
    }
    
    public int period(){
        return leaveTime - entryTime;
    }
}
