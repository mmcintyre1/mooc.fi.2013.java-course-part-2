
import java.util.*;

public class ShoppingBasket {

    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if ( purchases.keySet().contains(product) ) {
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, new Purchase(product, 1, price));
        }

    }

    public int price() {
        int totalCost = 0;

        for ( Purchase purchase : purchases.values() ) {
            totalCost += purchase.price();
        }
        return totalCost;
    }

    public void print() {
        for ( Purchase purchase : purchases.values() ) {
            System.out.println(purchase);
        }
    }

}
