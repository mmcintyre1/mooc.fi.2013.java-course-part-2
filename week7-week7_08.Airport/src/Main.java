
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();
        Scanner reader = new Scanner(System.in);
        
        AirportUserInterface airportUI = new AirportUserInterface(reader, airport);
        airportUI.start();
    
    }
}
