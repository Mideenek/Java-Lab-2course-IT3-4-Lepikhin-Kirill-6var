package ru.lepikhin.house;

public class House {
    private int floors;

    public House(int floors) {
        setFloors(floors);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        if (floors <= 0) {
            throw new IllegalArgumentException(
                    "Количество этажей должно быть положительным, а передано: " + floors);
        }
        this.floors = floors;
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