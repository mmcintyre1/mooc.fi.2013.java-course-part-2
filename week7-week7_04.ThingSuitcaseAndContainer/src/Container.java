
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Container(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        // no method for when adding to a suitcase
        // the check just happens at this add stage        
        
        if (suitcase.totalWeight() + this.currentWeight <= this.maxWeight) {
            
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        String thingString;
        int countOfThings = this.suitcases.size();

        if (countOfThings > 1) {
            thingString = countOfThings + " suitcases";
        } else if (countOfThings == 1) {
            thingString = countOfThings + " suitcase";
        } else {
            thingString = "empty";
        }

        return String.format("%s (%d kg)", thingString, this.currentWeight);
    }
}
