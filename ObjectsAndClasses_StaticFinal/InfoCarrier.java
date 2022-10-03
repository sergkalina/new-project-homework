public class InfoCarrier {

    private final InfoCarrierType type;
    private final int volume;
    private final int weight;

    public InfoCarrier(InfoCarrierType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public InfoCarrierType getType() {
        return type;
    }
    public int getVolume() {
        return volume;
    }
    public int getWeight() {
        return weight;
    }

}
