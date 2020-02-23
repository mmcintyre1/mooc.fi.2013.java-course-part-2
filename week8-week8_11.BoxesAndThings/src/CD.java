
public class CD implements ToBeStored {
    private final String artist;
    private final String title;
    private final int publisherYear;
    private final double weight = 0.1;

    public CD(String artist, String title, int publisherYear) {
        this.artist = artist;
        this.title = title;
        this.publisherYear = publisherYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (%d)", artist, title, publisherYear);
    }

    
    
}
