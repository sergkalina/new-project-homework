public class Main {
    public static void main(String[] args) {

        Car car = new Car(EngineType.DIESEL, CarType.SUV, 2700);
        Engine engine = new Engine(EngineType.DIESEL, 3.5, 156);

        System.out.println("Тип автомобиля: " + car.getType());
        System.out.println("Масса автомобиля: " + car.getWeight());
        System.out.println("Объём двигателя: " + engine.getVolume());
        System.out.println("Можность двигателя: " + engine.getPower());


    }
}
