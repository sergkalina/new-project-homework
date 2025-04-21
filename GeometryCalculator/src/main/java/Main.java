import practice.GeometryCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь круга = " + GeometryCalculator.getCircleSquare(0) + '\n');
        System.out.println("Объём шара = " + GeometryCalculator.getSphereVolume(0) + '\n');
        System.out.println("Является ли треугольник? = " + GeometryCalculator.isTrianglePossible(3, 40,20) + '\n');
        System.out.println("Площадь тругольника = " + GeometryCalculator.getTriangleSquare(5,5,5));

    }
}
