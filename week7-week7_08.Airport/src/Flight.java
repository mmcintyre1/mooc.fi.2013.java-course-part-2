
public class Flight {
    
    private final String departureLoc;
    private final String destinationLoc;

    public Flight(String departureLoc, String destinationLoc) {
        this.departureLoc = departureLoc;
        this.destinationLoc = destinationLoc;
    }

    public String getDestinationLoc() {
        return this.destinationLoc;
    }

    public String getDepartureLoc() {
        return this.departureLoc;
    }

    @Override
    public String toString() {
        return String.format(
                "%s-%s", 
                this.departureLoc, this.destinationLoc);
    }

}
