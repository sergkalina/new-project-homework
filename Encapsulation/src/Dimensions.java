public class Dimensions {

    private final double width;
    private final double height;
    private final double length;

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, height, length);
    }
    public Dimensions setHeight(double height) {
        return new Dimensions(width, height, length);
    }
    public Dimensions setLength(double length) {
        return new Dimensions(width, height, length);
    }
    public double volumeCargo() {
        return (getWidth() * getHeight() * getLength());
    }
    public String dimensionsCargo() {
               return "Ширина: " + width + " м." +
                "\n" + "Высота: " + height + " м." +
                "\n" + "Длина: " + length + " м.";
    }
}
