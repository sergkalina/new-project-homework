public class Book {
    private final String name;
    private final String write;
    private final int countPages;
    private final String numberISBN;

    public Book(String name, String write, int countPages, String numberISBN) {
        this.name = name;
        this.write = write;
        this.countPages = countPages;
        this.numberISBN = numberISBN;
    }
    public String getName() { return name; }
    public String getWrite() { return write; }
    public int getCountPages() { return countPages; }
    public String getNumberISBN() { return numberISBN; }

}
