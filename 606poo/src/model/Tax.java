package model;

/**
 *
 * @author LPS
 */
public enum Tax {
    Tax1(VehicleType.BIKE, 1),
    Tax2(VehicleType.CAR, 2);
    
    private final VehicleType type;
    private final int value;
    
    Tax(VehicleType vt, int val){
        type = vt;
        value = val;
    }
}
