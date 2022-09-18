
public class Main {
    public static void main(String[] args) {

        Dimensions dimensions300 = new Dimensions( 1.2, 1.8, 2.5);
        CargoInfo cargo300 = new CargoInfo(dimensions300,1500, " Новосибирский район, п. Элитный, ул. Венская, 20",
                false, "ABC606777", true);

        System.out.println("\n" + "Адресс доставки: " + cargo300.getDeliveryAdress());
        System.out.println("Масса груза: " + cargo300.getWeight() + " кг");
        System.out.println("Объём груза: " + dimensions300.volumeCargo() + " м3");

        cargo300 = cargo300.setDeliveryAdress("Новосибирский район, п. Элитный, ул. Венская, 19");
        cargo300 = cargo300.setWeight(1600);
        dimensions300 = dimensions300.setLength(2.4);

        System.out.println("\n" + "Адресс доставки: " + cargo300.getDeliveryAdress());
        System.out.println("Масса груза: " + cargo300.getWeight() + " кг");
        System.out.println("Объём груза: " + dimensions300.volumeCargo() + " м3");
        System.out.println(dimensions300.dimensionsCargo());
    }
}
