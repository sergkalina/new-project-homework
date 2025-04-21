public class Car {
    public final EngineType engine;
    public final CarType type;
    public final int weight;

    public Car(EngineType engine, CarType type, int weight) {
        this.engine = engine;
        this.type = type;
        this.weight = weight;
    }
    public EngineType getEngine() {
        return engine;
    }
    public CarType getType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }
}
