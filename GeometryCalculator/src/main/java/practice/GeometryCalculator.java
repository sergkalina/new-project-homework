package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        return radius < 0 ? -1.0 : Math.PI * radius * radius;
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        return radius >= 0 ? 4.0/3.0 * Math.PI * (radius * radius * radius) : -1.0;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double x;
        if (a > 0 && b > 0 && c > 0 && a + b > c == true) {
            x = (Math.sqrt(((a + b + c) / 2.0) * (((a + b + c) / 2.0) - a) * (((a + b + c) / 2.0) - b) * (((a + b + c) / 2.0) - c)));
        } else { return -1.0; }
        return x;
    }
}
