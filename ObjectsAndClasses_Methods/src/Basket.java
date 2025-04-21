public class Basket {
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    public Basket() {
        increaseCount(1);
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
        count + " шт. - " + price + " руб." + " - " + weight + " кг.";
        totalPrice = totalPrice + count * price;
    }
    public void clear() {
        items = "";
        totalPrice = 0;
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("\n" + items);
            System.out.println("Общий вес товаров: " + getTotalWeight() + " кг.");
            System.out.println("Общая цена товаров: " + getTotalPrice() + " руб.");
            System.out.println("Общая цена товаров: " + getTotalPrice() + " руб." + "\n");
        }
    }
}


    }
