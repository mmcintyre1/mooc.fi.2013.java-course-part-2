
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;

    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + this.currentWeight <= this.maxWeight) {
            this.things.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }

    @Override
    public String toString() {
        String thingString;
        int countOfThings = this.things.size();

        if (countOfThings > 1) {
            thingString = countOfThings + " things";
        } else if (countOfThings == 1) {
            thingString = countOfThings + " thing";
        } else {
            thingString = "empty";
        }

        return String.format("%s (%d kg)", thingString, this.currentWeight);
    }

    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Thing heaviestThing() {
        
        if (this.things.isEmpty()) {
            return null;
        }

        Thing heaviestThing = this.things.get(0);
        
        for ( Thing thing : this.things ) {
            if (thing.getWeight() > heaviestThing.getWeight()) {
                heaviestThing = thing;
            }
        }
        return heaviestThing;
    }

}
