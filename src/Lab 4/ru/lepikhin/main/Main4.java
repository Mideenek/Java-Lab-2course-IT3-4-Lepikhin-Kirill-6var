package ru.lepikhin.main;

import java.util.HashSet;
import java.util.Set;
import ru.lepikhin.generic.GenericOps;
import java.util.ArrayList;
import java.util.List;
import ru.lepikhin.generic.ListOps;
import java.util.Scanner;

import ru.lepikhin.generic.ComparableTo;
import ru.lepikhin.list.ValueList;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Лаб 4. Задание 1, задача 3: Сравнимое ===");

        ComparableTo<Integer> numberComparer = other -> Integer.compare(42, other);
        System.out.println("compare(42, 10) = " + numberComparer.compare(10));
        System.out.println("compare(42, 42) = " + numberComparer.compare(42));
        System.out.println("compare(42, 100) = " + numberComparer.compare(100));


        ComparableTo<String> stringComparer = other -> "apple".compareTo(other);
        System.out.println("compare(apple, banana) = " + stringComparer.compare("banana"));

        System.out.println();
        System.out.println("=== Лаб 4. Задание 1, задача 6: Обобщенный изменяемый массив ===");

        ValueList<Integer> intList = new ValueList<>(1, 2, 3);
        System.out.println("Список Integer: " + intList);

        ValueList<String> strList = new ValueList<>("a", "b");
        System.out.println("Список String: " + strList);

        ValueList<Integer> sized = new ValueList<>(5);
        sized.set(0, 10);
        sized.set(4, 50);
        System.out.println("Список размера 5 после set: " + sized);
        System.out.println("Размер: " + intList.size() + ", пустой: " + intList.isEmpty());

        System.out.print("Введи значение для позиции 1 списка Integer: ");
        int newValue4 = scanner.nextInt();
        intList.set(1, newValue4);
        System.out.println("После замены: " + intList);

        System.out.println();
        System.out.println("=== Лаб 4. Задание 2, задача 4: Заполнение списка ===");

        List<Integer> intNumbers = new ArrayList<>();
        ListOps.fillHundred(intNumbers);
        System.out.println("List<Integer>: размер = " + intNumbers.size()
                + ", первый = " + intNumbers.get(0)
                + ", последний = " + intNumbers.get(99));


        List<Number> numNumbers = new ArrayList<>();
        ListOps.fillHundred(numNumbers);
        System.out.println("List<Number>: размер = " + numNumbers.size()
                + ", первый = " + numNumbers.get(0)
                + ", последний = " + numNumbers.get(99));


        ValueList<Integer> valueHundred = new ValueList<>(100);
        ListOps.fillHundred(valueHundred);
        System.out.println("ValueList<Integer>: размер = " + valueHundred.size()
                + ", первый = " + valueHundred.get(0)
                + ", последний = " + valueHundred.get(99));

        System.out.println();
        System.out.println("=== Лаб 4. Задание 3, задача 1: Функция ===");

        List<String> words = new ArrayList<>(List.of("qwerty", "asdfg", "zx"));
        List<Integer> lengths = GenericOps.map(words, s -> s.length());
        System.out.println("Длины строк: " + lengths);

        List<Integer> numbers = new ArrayList<>(List.of(1, -3, 7));
        List<Integer> abs = GenericOps.map(numbers, n -> Math.abs(n));
        System.out.println("Модули чисел: " + abs);

        List<int[]> arrays = new ArrayList<>(List.of(new int[]{1, 2, 3}, new int[]{-5, -9}, new int[]{7, -1, 0}));
        List<Integer> maxes = GenericOps.map(arrays, arr -> {
            int max = arr[0];

            for (int v : arr) {
                if (v > max) {
                    max = v;
                }
            }

            return max;
        });
        System.out.println("Максимумы массивов: " + maxes);

        System.out.println();
        System.out.println("=== Лаб 4. Задание 3, задача 2: Фильтр ===");

        System.out.print("Введи минимальную длину строки для фильтра: ");
        int minLen = scanner.nextInt();

        List<String> longWords = GenericOps.filter(words, s -> s.length() >= minLen);
        System.out.println("Строки не короче " + minLen + ": " + longWords);

        List<Integer> notPositive = GenericOps.filter(numbers, n -> n <= 0);
        System.out.println("Неположительные числа: " + notPositive);

        List<int[]> noPositive = GenericOps.filter(arrays, arr -> {
            for (int v : arr) {
                if (v > 0) {
                    return false;
                }
            }
            return true;
        });
        List<String> noPositiveViews = GenericOps.map(noPositive, arr -> java.util.Arrays.toString(arr));
        System.out.println("Массивы без положительных: " + noPositiveViews);

        System.out.println();
        System.out.println("=== Лаб 4. Задание 3, задача 3: Сокращение ===");

        String joined = GenericOps.reduce(words, (a, b) -> a + b, "");
        System.out.println("Склеенная строка: " + joined);

        Integer sum = GenericOps.reduce(numbers, (a, b) -> a + b, 0);
        System.out.println("Сумма чисел: " + sum);

        List<List<Integer>> listOfLists = new ArrayList<>(List.of(List.of(1, 2, 3), List.of(4, 5)));
        List<Integer> sizes = GenericOps.map(listOfLists, l -> l.size());
        Integer total = GenericOps.reduce(sizes, (a, b) -> a + b, 0);
        System.out.println("Всего элементов во всех списках: " + total);

        Integer emptySum = GenericOps.reduce(new ArrayList<Integer>(), (a, b) -> a + b, 0);
        System.out.println("Сумма пустого списка (без null и без ошибки): " + emptySum);

        System.out.println();
        System.out.println("=== Лаб 4. Задание 3, задача 4: Коллекционирование ===");

        List<List<Integer>> split = GenericOps.collect(numbers, () -> {
            List<List<Integer>> target = new ArrayList<>();
            target.add(new ArrayList<>());
            target.add(new ArrayList<>());
            return target;
        }, (target, n) -> {
            if (n > 0) {
                target.get(0).add(n);
            } else if (n < 0) {
                target.get(1).add(n);
            }
        });
        System.out.println("Положительные: " + split.get(0) + ", отрицательные: " + split.get(1));

        List<String> words2 = new ArrayList<>(List.of("qwerty", "asdfg", "zx", "qw"));
        List<List<String>> byLength = GenericOps.collect(words2, ArrayList::new, (target, s) -> {
            for (List<String> group : target) {
                if (group.get(0).length() == s.length()) {
                    group.add(s);
                    return;
                }
            }

            List<String> group = new ArrayList<>();
            group.add(s);
            target.add(group);
        });
        System.out.println("Группы строк по длине: " + byLength);

        Set<String> unique = GenericOps.collect(
                new ArrayList<>(List.of("qwerty", "asdfg", "qwerty", "qw")),
                HashSet::new,
                (target, s) -> target.add(s));
        System.out.println("Набор без дубликатов: " + unique);
    }
}