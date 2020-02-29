
import java.util.*;


public class Storehouse {
    
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Storehouse() {
        this.productPrice = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }
    
    public int price(String product) {
        return productPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        int currentStock = this.stock(product);
        
        if (currentStock - 1 < 0) {
            return false;
        }
        
        productStock.put(product, currentStock - 1);
        return true;
    }
    
    public Set<String> products() {
        return productPrice.keySet();
    }
    
    
}
