public class Computer {

    private final String vendor;
    private final String name;
    private CPU cpu;
    private RAM ram;
    private InfoCarrier infoCarrier;
    private Screen screen;
    private Keyboard keyboard;


    public Computer(String vendor, String name, CPU cpu, RAM ram, InfoCarrier infoCarrier, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.infoCarrier = infoCarrier;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }
    public String getName() {
        return name;
    }
    public CPU getCpu() {
        return cpu;
    }
    public RAM getRam() {
        return ram;
    }
    public InfoCarrier getInfoAccumulator() {
        return infoCarrier;
    }
    public Screen getScreen() {
        return screen;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public void setInfoAccumulator(InfoCarrier infoCarrier) {
        this.infoCarrier = infoCarrier;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int finalWeight() {
        int finalWeight = cpu.getWeight() + ram.getWeight() + infoCarrier.getWeight()
                + screen.getWeight() + keyboard.getWeight();
        return finalWeight;
    }
    public String toString() {
        System.out.println("\n" + "Build name: " + name + "\n"
                + "Manufacturer: " + vendor + "\n"
                + "CPU: " + cpu.getFrequency() + " Hz," + " Number of Cores: " + cpu.getAmountCores() + "," + " Performance: " + cpu.getPerformance() + "TFLOOPS," + " Weight: " + cpu.getWeight() + " gr." + "\n"
                + "RAM: " + ram.getType() + ", " + ram.getVolume() + " GByte," + " Weight: " + ram.getWeight() + " gr." + "\n"
                + "Information carrier: " + infoCarrier.getType() + ", " + infoCarrier.getVolume() + " GByte, " + "Weight: " + infoCarrier.getWeight() + " gr." + "\n"
                + "Screen: " + screen.getDiagonal() + "'', " + screen.getType() + ", " + "Weight: " + screen.getWeight() + " gr." + "\n"
                + "Keyboard: " + keyboard.getType() + ", " + "Backlight: " + keyboard.getBacklight() + ", " + "Weight: " + keyboard.getWeight() + " gr. " + "\n" + "\n"
                + "Final weight build: " + finalWeight() + " gr.");
        return null;
    }
}
