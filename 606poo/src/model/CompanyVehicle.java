package model;

/**
 *
 * @author LPS
 */
public class CompanyVehicle {
    private final VehicleType type;
    private final String plate;
    
    CompanyVehicle(VehicleType t, String p){
        type = t;
        plate = p;
    }
}
