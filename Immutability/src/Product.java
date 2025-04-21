public class Product {
    private final String name;
    private int price;

    private final String barCode;

    public Product(String name, String barCode) {
        this.barCode = barCode;
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
