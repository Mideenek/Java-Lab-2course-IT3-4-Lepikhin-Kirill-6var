package ru.lepikhin.main;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String line = SCANNER.nextLine().trim();

            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: нужно ввести целое число. Попробуй ещё раз.");
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.print(message);
            String line = SCANNER.nextLine().trim();

            if (!line.isEmpty()) {
                return line;
            }

            System.out.println("Ошибка: имя не может быть пустым. Попробуй ещё раз.");
        }
    }
}