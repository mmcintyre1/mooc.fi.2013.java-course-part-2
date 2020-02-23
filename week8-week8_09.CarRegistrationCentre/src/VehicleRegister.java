
import java.util.HashMap;
import java.util.ArrayList;


public class VehicleRegister {
    private HashMap<RegistrationPlate, String> vehicleRegistry;

    public VehicleRegister() {
        vehicleRegistry = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.vehicleRegistry.keySet().contains(plate)) {
            vehicleRegistry.put(plate, owner);
            return true;
        } else {
            return false;
        } 
    }
    
    public String get(RegistrationPlate plate) {
        return vehicleRegistry.get(plate);
        
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (vehicleRegistry.keySet().contains(plate)) {
            vehicleRegistry.remove(plate);
            return true;
        } else {
            return false;
        } 
    }
    
    public void printRegistrationPlates() {
        for ( RegistrationPlate plate: vehicleRegistry.keySet() ) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> exclusionSet = new ArrayList<String>();
        for ( String owner: vehicleRegistry.values() ) {
            if ( !exclusionSet.contains(owner) ) {
                System.out.println(owner);
                exclusionSet.add(owner);
            }
        }  
    }
}
