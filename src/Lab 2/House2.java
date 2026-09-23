//Задание 4 задача 3
public class House2 {
    private final int floors;

    public House2(int floors) {
        this.floors = floors;
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