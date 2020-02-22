
import java.util.ArrayList;

public class Airplane {
    
    private final String id;
    private final int capacity;
    private ArrayList<Flight> flights;

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.flights = new ArrayList<Flight>();
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public String getId() {
        return this.id;
    }

    public void addFlight(String source, String dest) {
        Flight flight = new Flight(source, dest);
        this.addFlight(flight);
        
    }
    
    public void addFlight(Flight flight) {
        this.flights.add(flight);   
    }
    
    public void printFlights() {
        for ( Flight flight: this.flights ) {
            System.out.println(String.format("%s (%s)", this.toString(), flight));
        }
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s (%d ppl)", 
                this.id, this.capacity);
    }
    
}
