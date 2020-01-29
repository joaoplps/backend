package model;

/**
 *
 * @author LPS
 */
public enum Tax {
    Tax1(VehicleType.BIKE, 1),
    Tax2(VehicleType.CAR, 2);
    
    private final VehicleType type;
    final int value;
    
    Tax(VehicleType vt, int val){
        type = vt;
        value = val;
    }
    
    public static Tax byType(VehicleType vt) {
        switch(vt) {
            case CAR:
                return Tax2;
            default:
                return Tax1;
        }
    }
}
