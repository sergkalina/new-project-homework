public class main {
    public static void main(String[] args) {

        CPU cpu1 = new CPU(3.3, 4, 13.8, 29 );
        RAM ram1 = new RAM(RAMType.DDR3, 8, 31);
        InfoCarrier infoCarrier1 = new InfoCarrier(InfoCarrierType.SSD, 500, 37);
        Screen screen1 = new Screen(23, ScreenType.TN, 3370);
        Keyboard keyboard1 = new Keyboard("Mechanical", true, 240);
        Computer computer1 = new Computer("DELL", "SPECIAL BUILD 5", cpu1, ram1, infoCarrier1, screen1, keyboard1);

        CPU cpu2 = new CPU(3.7, 6, 19.8, 35 );
        RAM ram2 = new RAM(RAMType.DDR4, 16, 39);
        InfoCarrier infoCarrier2 = new InfoCarrier(InfoCarrierType.SSD, 1000, 46);
        Screen screen2 = new Screen(21, ScreenType.TN, 2870);
        Keyboard keyboard2 = new Keyboard("Membranous", true, 195);
        Computer computer2 = new Computer("Lenovo", "BUILD 3", cpu2, ram2, infoCarrier2, screen2, keyboard2);

        computer1.toString();
        computer2.toString();

    }
}
