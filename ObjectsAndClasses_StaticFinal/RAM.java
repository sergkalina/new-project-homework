public class RAM {

    private final RAMType type;
    private final int volume;
    private final int weight;

    public RAM(RAMType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RAMType getType() {
        return type;
    }
    public int getVolume() {
        return volume;
    }
    public int getWeight() {
        return weight;
    }
}
