
import java.util.ArrayList;

public class Airport {
    private ArrayList<Airplane> airplanes;

    public Airport() {
        this.airplanes =  new ArrayList<Airplane>();
    }
    
    public void addPlane(String planeId, int planeCapacity) {
        Airplane plane = new Airplane(planeId, planeCapacity);
        this.addPlane(plane);
    }
    
    public void addPlane(Airplane airplane) {
        this.airplanes.add(airplane);
    }
    
    public Airplane getPlane(String planeId) {
        for ( Airplane plane: this.airplanes ) {
            if ( plane.getId().equals(planeId) ) {
                return plane;
            }
        }
        return null;
    }
    
    public void printPlanes() {
        for ( Airplane airplane : this.airplanes ) {
            System.out.println(airplane);
        }
        System.out.println("");
    }
    
    public void printFlights(){
        for ( Airplane airplane : this.airplanes ) {
            airplane.printFlights();
        }
        System.out.println("");
    }
    
}
