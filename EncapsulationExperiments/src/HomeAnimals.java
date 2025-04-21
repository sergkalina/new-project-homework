public class HomeAnimals {

    private String name;
    private String typeAnimal;
    private int countAnimal;
    private boolean groomingAnimal;
    private double weightAnimal;

    public HomeAnimals(String typeAnimal, String name) {
        this.typeAnimal = typeAnimal;
        this.name = name;
    }
    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }
    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setCountAnimal(int countAnimal) { this.countAnimal = countAnimal; }
    public int getCountAnimal() { return countAnimal; }

    public void setGroomingAnimal(boolean groomingAnimal) { this.groomingAnimal = groomingAnimal; }
    public boolean getGroomingAnimal() { return groomingAnimal; }

    public void setWeightAnimal( double weightAnimal) { this.weightAnimal = weightAnimal; }
    public double getWeightAnimal() { return weightAnimal; }

}
