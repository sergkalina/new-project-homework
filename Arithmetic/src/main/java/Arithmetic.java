public class Arithmetic {
    private int a;
    private int b;
    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void sum() {
        System.out.println("Произведение чисел = " + (a + b));
    }
    public void multiplication() {
        System.out.println("Умножение чисел = " + (a * b));
    }
    public void maxNumber() {
        System.out.println("Максимальное число = " + (a > b ? a : b));
    }
    public void minNumber() {
        System.out.println("Минимальное число = " + (a < b ? a : b));
    }

}






