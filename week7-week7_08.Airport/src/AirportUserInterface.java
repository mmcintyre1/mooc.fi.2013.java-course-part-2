
import java.util.Scanner;


public class AirportUserInterface {

    private Scanner reader;
    private Airport airport;

    public AirportUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void start() {
        System.out.println(
                "Airport panel\n"
                + "--------------------"
        );
        airportPanel();

        System.out.println(
                "Flight service\n"
                + "--------------------"
        );
        flightService();
        }
    
    public void airportPanel() {

        OUTER:
        while (true) {
            System.out.println(
                    "Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit"
            );

            String command = this.reader.nextLine();
            switch (command) {
                case "1":
                    this.addPlane();
                    break;
                case "2":
                    this.addFlight();
                    break;
                case "x":
                    break OUTER;
            }
        }

    }
    
    
    public void flightService() {

        OUTER:
        while (true) {
            System.out.println(
                    "Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");

            String command = this.reader.nextLine();
            switch (command) {
                case "1":
                    this.airport.printPlanes();
                    break;
                case "2":
                    this.airport.printFlights();
                    break;
                case "3":
                    System.out.print("Give plane ID: ");
                    System.out.println(
                            this.airport
                                    .getPlane(this.reader.nextLine())
                    );
                    break;
                case "x":
                    break OUTER;
            }
        }

    }
    
    public void addPlane() {
        System.out.print("Give plane ID: ");
        String planeId = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(this.reader.nextLine());
        
        this.airport.addPlane(planeId, planeCapacity);
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeId = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = this.reader.nextLine();
        
        this.airport
                .getPlane(planeId)
                .addFlight(departure, destination); 
    }

}
