import static com.sun.beans.introspect.ClassInfo.clear;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 100, 10, 0.95);
        basket.add("Яблочный сок", 100, 1, 0.9);
        basket.add("Стейк из говядины", 100, 1, 1.95);
        basket.add("Бананы", 200, 1, 2);
        basket.add("Жевательная резинка", 50, 1);
        basket.print("Корзина №1");

        Basket basket2 = new Basket();
        basket2.add("Кефир", 100, 1, 0.95);
        basket2.add("Апельсиновый сок", 100, 1, 0.9);
        basket2.add("Стейк из баранины", 100, 1, 1.95);
        basket2.add("Ананасы", 200, 1, 2);
        basket2.add("Мятные леденцы", 50, 1);
        basket2.print("Корзина №2");

        System.out.println("\n" + "Общее количество товаров: " + Basket.totalAmount + " шт.");
        System.out.println("\n" + "Общая стоимость товаров: " + Basket.totalCost + " руб.");
        System.out.println("\n" + "Средняя цена товаров во всех корзинах: " + Basket.finalAverageCost());
        System.out.println("\n" + "Средняя стоимость корзины: " + Basket.averageCastBasket());
    }
}
