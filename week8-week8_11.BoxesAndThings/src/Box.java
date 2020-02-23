
import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things;
    private final double maxWeight;

    public Box(double maxWeight) {
        this.things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored item) {
        if ( (weight() + item.weight()) < maxWeight) {
            things.add(item);
        }
    }
    
    public double weight() {
        double weight = 0;
        for ( ToBeStored item : things ) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return String.format(
                "Box: %d things, total weight %.1f kg", 
                things.size(), weight()
        );
    }

}
