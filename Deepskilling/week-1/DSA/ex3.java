class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
}
public class ex3 {
    public static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].totalPrice < pivot) {
                i++;

                Order t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        Order t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;

        return i + 1;
    }

}
