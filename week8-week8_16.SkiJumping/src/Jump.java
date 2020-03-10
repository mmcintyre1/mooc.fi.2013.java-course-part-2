
import java.util.*;

public class Jump {

    private int length;
    private int[] scores = new int[5];

    public Jump() {
        Random rand = new Random();
        this.length = rand.nextInt((120-60) + 1) + 60;
        
        for ( int i=0; i < 5; i++ ) {
            scores[i] = rand.nextInt((20-10) + 1) + 10;
        }
    }
    
    public int getLength() {
        return length;
    }
    
    public int[] getScores() {
        return scores;
    }  
    

}
