public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    public static int totalCost;
    public static int totalAmount;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add (String name, int price, int count) {
        add(name, price, count, 0);
    }

    public void add (String name, int price, double weight) {
        add(name, price, 1, weight);
    }

    public void add (String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб." + " - " + weight + " кг.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        totalCost = totalCost + count * price;
        totalAmount = totalAmount + count;
    }

    public static int finalAverageCost() {
         return (totalCost / totalAmount);
    }
    public static int averageCastBasket() {
        return (totalCost / Basket.count);
    }


    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() { return totalWeight; }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("\n" + items);
            System.out.println("Общий вес товаров: " + getTotalWeight() + " кг.");
            System.out.println("Общая цена товаров: " + getTotalPrice() + " руб." + "\n");
        }
    }
}
