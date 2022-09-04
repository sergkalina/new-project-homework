public class Arithmetic {

    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        int sum = a + b;
        System.out.println("\n" + "Сумма чисел: "
                + a + " + " + b + " = " + sum);
    }

    public void multiplication() {
        int sum = a * b;
        System.out.println("\n" + "Произведение чисел: "
                + a + " * " + b + " = " + sum);
    }

    public void max() {
        if (a > b) {
            System.out.println("\n" + "Максимальное из двух чисел : " + a);
        } else if (a == b) {
            System.out.println("\n" + "Числа одинаковые");
        } else {
            System.out.println("\n" + "Максимальное из двух чисел : " + b);
        }
    }

    public void min() {
        if (a < b) {
            System.out.println("\n" + "Минимальное из двух чисел : " + a);
        } else if (a == b) {
            System.out.println("\n" + "Числа одинаковые");
        } else {
            System.out.println("\n" + "Минимальное из двух чисел : " + b);
        }
    }
}



