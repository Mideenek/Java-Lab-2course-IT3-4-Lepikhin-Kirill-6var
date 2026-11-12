package ru.lepikhin.main;

import java.io.IOException;
import ru.lepikhin.stream.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import ru.lepikhin.coll.*;
import ru.lepikhin.cat.Cat;
import ru.lepikhin.cat.MeowCounter;
import ru.lepikhin.cat.MeowOps;
import ru.lepikhin.fraction.CachedFraction;
import ru.lepikhin.fraction.Fraction;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("=== Лаб 5. Задание 1, задача 1: Дробь и кэш ===");

        Fraction fraction = new Fraction(3, -4);
        System.out.println("Дробь с отрицательным знаменателем: " + fraction);
        System.out.println("Вещественное значение: " + fraction.doubleValue());

        Fraction same = new Fraction(-3, 4);
        System.out.println("Сравнение -3/4 и 3/-4: " + fraction.equals(same));

        CachedFraction cached = new CachedFraction(3, 4);
        cached.doubleValue();
        cached.doubleValue();
        cached.doubleValue();
        System.out.println(cached + ", реальных вычислений после 3 вызовов: " + cached.getComputeCount());

        cached.set(1, 2);
        cached.doubleValue();
        System.out.println("После set(1, 2) вычислений заново: " + cached.getComputeCount());

        System.out.println();
        System.out.println("=== Лаб 5. Задание 2, задача 1: Количество мяуканий ===");

        Cat cat = new Cat("Барсик");
        MeowCounter counter = new MeowCounter(cat);

        MeowOps.meowAll(counter, counter, counter);

        System.out.println(cat + " мяукнул раз: " + counter.getCount());

        System.out.println();
        System.out.println("=== Лаб 5. Задание 3, задача 4: Список ===");

        ListInserter inserter = new ListInserter(new ArrayList<>(List.of(1, 2, 3, 2, 5)));
        System.out.println("До: " + inserter);
        inserter.insertAllAfterFirst(2);
        System.out.println("После вставки за первым вхождением 2: " + inserter);

        System.out.println();
        System.out.println("=== Лаб 5. Задание 4, задача 6: Мап (файл applicants.txt) ===");

        try {
            Applicants applicants = new Applicants("src/Lab 5/applicants.txt");
            System.out.println(applicants);
            System.out.println("Допущены в первый поток: " + applicants.admitted());
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Лаб 5. Задание 5, задача 8: Сет (файл text.txt) ===");

        try {
            MissingLetters missingLetters = new MissingLetters("src/Lab 5/text.txt");
            System.out.println(missingLetters);
            System.out.println("Сколько букв не встречается: " + missingLetters.missing().size());
            System.out.println("Какие: " + missingLetters.missing());
        } catch (IOException e) {
            System.out.println("Не удастся прочитать файл: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Лаб 5. Задание 6, задача 2: Очередь ===");

        QueueBuilder<Integer> queueBuilder = new QueueBuilder<>(new ArrayList<>(List.of(1, 2, 3)));
        System.out.println(queueBuilder);
        System.out.println("Очередь: " + queueBuilder.build());

        System.out.println();
        System.out.println("=== Лаб 5. Задание 7, задача 1: Стрим по точкам ===");

        Line line = new Line(new Point(0, 0), new Point(3, 4));
        System.out.println(line);

        List<Point> points = new ArrayList<>(List.of(
                new Point(5, -3),
                new Point(1, 4),
                new Point(5, -3),
                new Point(-2, -8),
                new Point(3, 2)));
        System.out.println("Исходные точки: " + points);

        Polyline polyline = StreamDemo.buildPolyline(points);
        System.out.println("Ломаная: " + polyline);

        System.out.println();
        System.out.println("=== Лаб 5. Задание 7, задача 2: Стрим по файлу people.txt ===");

        try {
            Map<Integer, List<String>> groups = StreamDemo.groupPeople("src/Lab 5/people.txt");
            System.out.println("Группы по номерам: " + groups);
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл: " + e.getMessage());
        }
    }


    private static MeowCounter counter(Cat cat) {
        return new MeowCounter(cat);
    }
}