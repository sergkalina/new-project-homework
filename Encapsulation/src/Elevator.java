public class Elevator {

    private int currentFloor = 1; // текущий этаж
    private int minFloor;         // минимальный этаж
    private int maxFloor;         // максимальный этаж

    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor - 1;
    }
    public void moveUp() {
        currentFloor = currentFloor + 1;
    }
    public void move(int floor) {

        if (floor < currentFloor && floor >= minFloor && floor <= maxFloor) {
            while (floor < currentFloor) {
                moveDown();
                System.out.println(" " + currentFloor + " этаж");
            }
        } if (floor > currentFloor && floor >= minFloor && floor <= maxFloor) {
            while (floor > currentFloor) {
                moveUp();
                System.out.println(" " + currentFloor + " этаж");
            }
        } if (floor == currentFloor) {
            System.out.println(" Текущий этаж!");
        }
        else {
            System.out.println(" Ошибка! Этаж выбран некорректно!");
        }
    }
}
