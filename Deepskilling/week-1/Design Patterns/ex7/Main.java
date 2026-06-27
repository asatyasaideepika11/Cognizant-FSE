public class Main {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        System.out.println("Updating stock price to 2500");
        stockMarket.setStockPrice(2500);

        System.out.println();

        System.out.println("Updating stock price to 2750");
        stockMarket.setStockPrice(2750);
    }
}