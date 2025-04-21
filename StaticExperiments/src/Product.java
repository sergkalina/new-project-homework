public class Product {

    private final String name;
    private final int price1;

    private static int count = 0;
    private static int totalPrice = 0;

    public Product (String name, int price) {
        Product.count = Product.count + 1;
        Product.totalPrice = Product.totalPrice + price;
        this.name = name;
        this.price1 = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice1() {
        return price1;
    }
    public static int getCount() {
        return Product.count;
    }
    public static double getAveragePrice() {
        return (double) Product.totalPrice / Product.count;
    }

}
