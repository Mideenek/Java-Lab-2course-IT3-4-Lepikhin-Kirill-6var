package ru.lepikhin.main;

import ru.lepikhin.geometry.Point;
import ru.lepikhin.house.House;
import ru.lepikhin.list.ImmutableValueList;
import ru.lepikhin.weapon.AutomaticRifle;
import ru.lepikhin.weapon.Pistol;
import ru.lepikhin.weapon.Shooter;
import ru.lepikhin.weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1, задача 1: Дом над землёй ===");

        int floors = InputUtil.readInt("Введи количество этажей для нового дома: ");

        try {
            House house = new House(floors);
            System.out.println("Создался: " + house);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании: " + e.getMessage());
        }

        House house = new House(5);
        System.out.println("Дом для проверки изменений: " + house);

        int newFloors = InputUtil.readInt("Введи новое количество этажей (можно отрицательное): ");

        try {
            house.setFloors(newFloors);
            System.out.println("После изменения: " + house);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при изменении: " + e.getMessage());
            System.out.println("Дом не изменился: " + house);
        }

        System.out.println();
        System.out.println("=== Задание 1, задача 5: Перезарядка Пистолета ===");

        Pistol pistol = new Pistol(7);
        System.out.println("Создан " + pistol);

        pistol.reload(3);

        for (int i = 0; i < 5; i++) {
            pistol.shoot();
        }

        System.out.println("Заряжаем 8 патронов, вернули лишних: " + pistol.reload(8));

        for (int i = 0; i < 2; i++) {
            pistol.shoot();
        }

        System.out.println("Разрядили, изъято патронов: " + pistol.unload());
        pistol.shoot();

        System.out.println();
        int capacity = InputUtil.readInt("Введи вместимость своего пистолета: ");

        Pistol my;

        try {
            my = new Pistol(capacity);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage() + ". Создаю с вместимостью 5.");
            my = new Pistol(5);
        }

        int load = InputUtil.readInt("Сколько патронов зарядить: ");

        try {
            System.out.println("Вернули лишних патронов: " + my.reload(load));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Состояние: " + my + ", заряжен: " + my.isLoaded());

        System.out.println();
        System.out.println("=== Задание 2, задача 1: Неизменяемый массив ===");

        ImmutableValueList fromVarargs = new ImmutableValueList(1, 2, 3, 4, 5);
        System.out.println("Список из перечня чисел: " + fromVarargs);

        int[] source = {10, 20, 30};
        ImmutableValueList fromArray = new ImmutableValueList(source);
        System.out.println("Список из массива: " + fromArray);

        ImmutableValueList copy = new ImmutableValueList(fromVarargs);
        System.out.println("Копия списка: " + copy);

        System.out.println("Размер: " + fromVarargs.size() + ", пустой: " + fromVarargs.isEmpty());

        int getIndex = InputUtil.readInt("Введи позицию для получения значения: ");

        try {
            System.out.println("Значение на позиции " + getIndex + ": " + fromVarargs.get(getIndex));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        int setIndex = InputUtil.readInt("Введи позицию для замены: ");
        int newValue = InputUtil.readInt("Введи новое значение: ");

        try {
            fromVarargs.set(setIndex, newValue);
            System.out.println("После замены: " + fromVarargs);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("В виде стандартного массива: " + java.util.Arrays.toString(fromVarargs.toArray()));

        System.out.println();
        System.out.println("=== Задание 3, задача 4: Автомат ===");

        AutomaticRifle defaultRifle = new AutomaticRifle();
        System.out.println("Без параметров: " + defaultRifle);

        try {
            AutomaticRifle bad = new AutomaticRifle(1);
            System.out.println(bad);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании с обоймой 1: " + e.getMessage());
        }

        int maxAmmo = InputUtil.readInt("Введи вместимость автомата: ");
        int rate = InputUtil.readInt("Введи скорострельность: ");

        AutomaticRifle rifle;

        try {
            rifle = new AutomaticRifle(maxAmmo, rate);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage() + ". Создаю автомат 10/5.");
            rifle = new AutomaticRifle(10);
        }

        System.out.println("Создан " + rifle);
        rifle.reload(rifle.getMaxAmmo());
        System.out.println("Заряжен полностью, одиночная очередь:");
        rifle.shoot();
        System.out.println("После очереди: " + rifle);

        int seconds = InputUtil.readInt("Сколько секунд стрелять: ");

        try {
            rifle.shoot(seconds);
            System.out.println("После стрельбы " + seconds + " сек: " + rifle);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Задание 4, задача 1: Оружие ===");

        Pistol pistol4 = new Pistol(5);
        pistol4.reload(5);

        Weapon weapon = pistol4;
        System.out.println("Пистолет через ссылку Weapon: " + weapon);

        weapon.shoot();
        System.out.println("После выстрела: " + weapon + ", заряжен: " + weapon.isLoaded());

        System.out.println();
        System.out.println("=== Задание 5, задача 8: Лучший стрелок ===");

        String name1 = InputUtil.readString("Имя стрелка без оружия: ");
        String name2 = InputUtil.readString("Имя стрелка с пистолетом: ");
        String name3 = InputUtil.readString("Имя стрелка с автоматом: ");

        Shooter shooter1 = new Shooter(name1);

        Pistol pistol5 = new Pistol(5);
        pistol5.reload(5);
        Shooter shooter2 = new Shooter(name2);
        shooter2.setWeapon(pistol5);

        AutomaticRifle rifle5 = new AutomaticRifle(6, 2);
        rifle5.reload(6);
        Shooter shooter3 = new Shooter(name3);
        shooter3.setWeapon(rifle5);

        System.out.println(shooter1);
        shooter1.shoot();

        System.out.println(shooter2);
        shooter2.shoot();

        System.out.println(shooter3);
        shooter3.shoot();

        System.out.println();
        System.out.println("=== Задание 6, задача 2: Сравнение точек ===");

        int x1 = InputUtil.readInt("Координата x первой точки: ");
        int y1 = InputUtil.readInt("Координата y первой точки: ");
        int x2 = InputUtil.readInt("Координата x второй точки: ");
        int y2 = InputUtil.readInt("Координата y второй точки: ");

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x1, y1);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3 (копия первой): " + point3);

        System.out.println("point1.equals(point2): " + point1.equals(point2));
        System.out.println("point1.equals(point3): " + point1.equals(point3));
        System.out.println("point1 == point3 (ссылки, а не состояние): " + (point1 == point3));

        System.out.println();
        System.out.println("=== Задание 7, задача 2: методы пакета main (полиморфизм) ===");

        WeaponDemo.fireAll(pistol4, rifle5);
        WeaponDemo.shootersFire(shooter1, shooter2, shooter3);

        System.out.println();
        System.out.println("=== Задание 7, задача 3: Возведение в степень ===");

        String xStr;
        String yStr;

        if (args.length >= 2) {
            xStr = args[0];
            yStr = args[1];
            System.out.println("Получено из командной строки: X = " + xStr + ", Y = " + yStr);
        } else {
            System.out.println("Аргументов командной строки нет — ввожу с клавиатуры.");
            xStr = String.valueOf(InputUtil.readInt("Введи основание X: "));
            yStr = String.valueOf(InputUtil.readInt("Введи степень Y: "));
        }

        try {
            System.out.println("Результат X^Y = " + Power.power(xStr, yStr));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: X и Y должны быть целыми числами");
        }
    }
}