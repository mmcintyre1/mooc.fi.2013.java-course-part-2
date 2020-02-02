
public class Thing {
    private String name;
    private int weightInKg;

    public Thing(String name, int weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weightInKg;
    }

    @Override
    public String toString() {
        return String.format("%s (%d kg)", this.name, this.weightInKg);
    }
    
    
    
            
}
