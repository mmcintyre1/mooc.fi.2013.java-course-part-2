
import java.util.*;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for ( Card card: cards ) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }   
    
    public int getSum() {
        int sum = 0;
        for ( Card card: cards ) {
            sum += card.getValue();
        }
        return sum;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue() );
    }
    
    @Override
    public int compareTo(Hand otherHand) {
        if (this.getSum() == otherHand.getSum()) {
            return 0;
        } else if (this.getSum() < otherHand.getSum()) {
            return -1;
        }
        return 1;
    }
}
