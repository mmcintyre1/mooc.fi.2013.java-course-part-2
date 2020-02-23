
public class Main {

    public static void main(String[] args) {
        RegistrationPlate r1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate r2 = new RegistrationPlate("FI", "ABC-123");
        
        System.out.println(r1 == r2);
    }
}
