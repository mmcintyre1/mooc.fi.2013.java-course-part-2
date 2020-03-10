
import java.util.*;

public class Jumper implements Comparator<Jumper> {

    private String name;
    private int points;

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    
    public void jump() {
        Jump jump = new Jump();
        
    }
    
    public int tallyPoints() {
        return 0;
    }
    
    @Override
    public int compare(Jumper o1, Jumper o2) {
        return o1.points - o2.points;
    }

    @Override
    public String toString() {
        return String.format("%s (%d points)", name, points);
    }

}
