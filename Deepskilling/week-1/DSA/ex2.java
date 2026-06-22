class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class ex2 {

    static int binarySearch(Product[] arr, String name) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            int cmp = arr[m].productName.compareTo(name);

            if (cmp == 0)
                return m;
            else if (cmp < 0)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Camera", "Electronics"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Mobile", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

        int index = binarySearch(products, "Mobile");

        if (index != -1)
            System.out.println("Product Found at index: " + index);
        else
            System.out.println("Product Not Found");
    }
}