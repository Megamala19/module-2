import java.util.*;
class Product {
    int productId, quantity;
    String productName;
    double price;
    Product(int id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }
    
    public String toString() {
        return productId + " " + productName + " Qty:" + quantity + " Price:" + price;
    }
}
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Product> inventory = new HashMap<>();
        inventory.put(1, new Product(1, "Laptop", 10, 50000));
        inventory.put(2, new Product(2, "Mouse", 20, 500));
        inventory.get(1).quantity = 15;
        inventory.remove(2);
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
