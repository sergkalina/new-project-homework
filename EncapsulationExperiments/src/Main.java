public class Main {
    public static void main(String[] args) {

        HomeAnimals homeAnimal = new HomeAnimals("cat", "Barsik");
        homeAnimal.setCountAnimal(1);
        homeAnimal.setWeightAnimal(16.6);
        homeAnimal.setGroomingAnimal(true);

        System.out.println("Тип животного : " + homeAnimal.getTypeAnimal());
        System.out.println("Кличка животного : " + homeAnimal.getName());
        System.out.println("Количество Барсиков : " + homeAnimal.getCountAnimal());
        System.out.println("Вес животного : " + homeAnimal.getWeightAnimal());
        System.out.println("Требует ухода : " + homeAnimal.getGroomingAnimal());
    }
}
