public class Keyboard {

    private final String type;
    private final boolean backlight;
    private final int weight;

    public Keyboard(String type, boolean backlight, int weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }
    public boolean getBacklight() {
        return backlight;
    }
    public int getWeight() {
        return weight;
    }
}
