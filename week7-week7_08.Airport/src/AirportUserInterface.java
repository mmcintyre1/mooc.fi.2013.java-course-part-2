
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

        while (true) {
            System.out.println(
                    "Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit"
            );

            String command = this.reader.nextLine();
            if (command.equals("1")) {
                this.addPlane();
            } else if (command.equals("2")) {
                this.addFlight();
            } else if (command.equals("x")) {
                break;
            } else {
                System.out.println("Unknown command.");

            }
        }

    }

    public void flightService() {

        while (true) {
            System.out.println(
                    "Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");

            String command = this.reader.nextLine();
            if (command.equals("1")) {
                this.airport.printPlanes();
            } else if (command.equals("2")) {
                this.airport.printFlights();
            } else if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                System.out.println(this.airport.getPlane(this.reader.nextLine()));
            } else if (command.equals("x")) {
                break;
            } else {
                System.out.println("Unknown command.");
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
