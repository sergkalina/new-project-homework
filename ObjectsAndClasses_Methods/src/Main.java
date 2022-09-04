import static com.sun.beans.introspect.ClassInfo.clear;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 100, 1, 0.95);
        basket.add("Яблочный сок", 100, 1, 0.9);
        basket.add("Стейк из говядины", 100, 1, 1.95);
        basket.add("Бананы", 200, 1, 2);
        basket.add("Жевательная резинка", 50, 1);
        basket.print("Корзина №1");
    }
}
