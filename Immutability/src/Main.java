public class Main {
    public static void main(String[] args) {
        Book book = new Book("Золушка", "Братья Гримм",
                32, "9783314103926");
        System.out.println("\n" + "Название книги: " + book.getName());
        System.out.println("Автор: " + book.getWrite());
        System.out.println("Количество страниц: " + book.getCountPages());
        System.out.println("Номер ISBN: " + book.getNumberISBN());




    }
}
