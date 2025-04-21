public class CargoInfo {

    private final Dimensions dimensions;   // габариты груза
    private final int weight;              // масса 
    private final String deliveryAdress;  // адресс доставки
    private final boolean possibleToFlip;  // можно ли переворачивать 
    private final String regNumber;        // регистрационный 
    private final boolean fragileCargo;    // является ли груз хрупким

    public CargoInfo(Dimensions dimensions,
                     int weight,
                     String deliveryAdress,
                     boolean possibleToFlip,
                     String regNumber,
                     boolean fragileCargo) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAdress = deliveryAdress;
        this.possibleToFlip = possibleToFlip;
        this.regNumber = regNumber;
        this.fragileCargo = fragileCargo;
    }
    public CargoInfo setDimensions(Dimensions dimensions) {
        return new CargoInfo(dimensions, weight,
                deliveryAdress,
                possibleToFlip,
                regNumber,
                fragileCargo);
    }
    public CargoInfo setWeight(int weight) {
        return new CargoInfo(dimensions, weight,
                deliveryAdress,
                possibleToFlip,
                regNumber,
                fragileCargo);
    }
    public CargoInfo setDeliveryAdress(String deliveryAdress) {
        return new CargoInfo(dimensions, weight,
                deliveryAdress,
                possibleToFlip,
                regNumber,
                fragileCargo);
    }
    public Dimensions getDimensions() { return dimensions; }
    public int getWeight() {
        return weight;
    }
    public String getDeliveryAdress() {
        return deliveryAdress;
    }
    public boolean getPossibleToFlip() {
        return possibleToFlip;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public boolean getFragileCargo() {
        return fragileCargo;
    }
}
