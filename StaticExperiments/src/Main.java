public class Main {
    public static void main(String[] args) {

        Car car = new Car(EngineType.DIESEL, CarType.SUV, 2700);
        Engine engine = new Engine(EngineType.DIESEL, 3.5, 156);

        System.out.println("��� ����������: " + car.getType());
        System.out.println("����� ����������: " + car.getWeight());
        System.out.println("����� ���������: " + engine.getVolume());
        System.out.println("�������� ���������: " + engine.getPower());


    }
}
