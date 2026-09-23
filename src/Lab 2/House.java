// Задание 1 задача 5
public class House {
    private int floors;

    public House() {
        this.floors = 0;
    }

    public House(int floors) {
        setFloors(floors);
    }

    public void setFloors(int floors) {
        if (floors < 0) {
            this.floors = 0;
        } else {
            this.floors = floors;
        }
    }

    public int getFloors() {
        return floors;
    }

    private String floorsWord() {
        int lastTwo = floors % 100;

        if (lastTwo >= 11 && lastTwo <= 14) {
            return "этажами";
        }

        if (floors % 10 == 1) {
            return "этажом";
        }

        return "этажами";
    }

    @Override
    public String toString() {
        return "дом с " + floors + " " + floorsWord();
    }
}