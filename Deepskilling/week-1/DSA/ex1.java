import java.util.*;

public class ex1 {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    static void updateProduct(int id, int qty, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = qty;
            p.price = price;
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    public static void main(String[] args) {
        addProduct(new Product(1, "Laptop", 10, 50000));
        addProduct(new Product(2, "Phone", 20, 20000));

        updateProduct(1, 15, 55000);

        deleteProduct(2);

        System.out.println(inventory);
    }
}