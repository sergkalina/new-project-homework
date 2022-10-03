public class Screen {

    private final int diagonal;
    private final ScreenType type;  // IPS, TN, VA
    private final int weight;

    public Screen(int diagonal, ScreenType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }
    public int getDiagonal() {
        return diagonal;
    }
    public ScreenType getType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }


}
