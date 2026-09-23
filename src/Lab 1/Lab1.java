public class Lab1 {
    public static void main(String[] args) {
        Lab1 lab = new Lab1();

        lab.task1_3();
        lab.task1_4();
        lab.task1_8();
        lab.task1_9();
        lab.task1_10();

        lab.task2_2();
        lab.task2_5();
        lab.task2_6();
        lab.task2_7();
        lab.task2_10();

        lab.task3_1();
        lab.task3_4();
        lab.task3_6();
        lab.task3_7();
        lab.task3_9();

        lab.task4_1();
        lab.task4_2();
        lab.task4_5();
        lab.task4_8();
        lab.task4_10();
    }

    // Задание 1 задача 3
    private void task1_3() {
        System.out.println("\nЗадание 1 задача 3");

        char x = '3';
        System.out.println("Результат: " + charToNum(x));
    }

    public int charToNum(char x) {
        return x - '0';
    }

    // Задание 1 задача 4
    private void task1_4() {
        System.out.println("\nЗадание 1 задача 4");

        int x = 3;
        System.out.println("Результат: " + isPositive(x));

        x = -5;
        System.out.println("Результат: " + isPositive(x));
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    // Задание 1 задача 8
    private void task1_8() {
        System.out.println("\nЗадание 1 задача 8");

        int a = 3;
        int b = 6;
        System.out.println("Результат: " + isDivisor(a, b));

        a = 2;
        b = 15;
        System.out.println("Результат: " + isDivisor(a, b));
    }

    public boolean isDivisor(int a, int b) {
        if (a == 0 && b == 0) {
            return false;
        }

        if (a == 0 || b == 0) {
            return true;
        }

        return a % b == 0 || b % a == 0;
    }


    // Задание 1 задача 9
    private void task1_9() {
        System.out.println("\nЗадание 1 задача 9");

        int a = 3;
        int b = 3;
        int c = 3;
        System.out.println("Результат: " + isEqual(a, b, c));

        a = 2;
        b = 15;
        c = 2;
        System.out.println("Результат: " + isEqual(a, b, c));
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задание 1 задача 10
    private void task1_10() {
        System.out.println("\nЗадание 1 задача 10");

        int result = 5;

        result = lastNumSum(result, 11);
        System.out.println("Результат: " + result);

        result = lastNumSum(result, 123);
        System.out.println("Результат: " + result);

        result = lastNumSum(result, 14);
        System.out.println("Результат: " + result);

        result = lastNumSum(result, 1);
        System.out.println("Результат: " + result);
    }

    public int lastNumSum(int a, int b) {
        return a % 10 + b % 10;
    }

    // Задание 2 задача 2
    private void task2_2() {
        System.out.println("\nЗадание 2 задача 2");

        int x = 5;
        int y = 0;
        System.out.println("Результат: " + safeDiv(x, y));

        x = 8;
        y = 2;
        System.out.println("Результат: " + safeDiv(x, y));
    }

    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }

        return (double) x / y;
    }

    // Задание 2 задача 5
    private void task2_5() {
        System.out.println("\nЗадание 2 задача 5");

        int x = 5;
        int y = 7;
        int z = 7;
        System.out.println("Результат: " + max3(x, y, z));

        x = 8;
        y = -1;
        z = 4;
        System.out.println("Результат: " + max3(x, y, z));
    }

    public int max3(int x, int y, int z) {
        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }

        return max;
    }

    // Задание 2 задача 6
    private void task2_6() {
        System.out.println("\nЗадание 2 задача 6");

        int x = 5;
        int y = 7;
        int z = 2;
        System.out.println("Результат: " + sum3(x, y, z));

        x = 8;
        y = -1;
        z = 4;
        System.out.println("Результат: " + sum3(x, y, z));
    }

    public boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    // Задание 2 задача 7
    private void task2_7() {
        System.out.println("\nЗадание 2 задача 7");

        int x = 5;
        int y = 7;
        System.out.println("Результат: " + sum2(x, y));

        x = 8;
        y = -1;
        System.out.println("Результат: " + sum2(x, y));
    }

    public int sum2(int x, int y) {
        int sum = x + y;

        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }

    // Задание 2 задача 10
    private void task2_10() {
        System.out.println("\nЗадание 2 задача 10");

        String x = "четверг";
        System.out.println("Результат:");
        printDays(x);

        x = "чг";
        System.out.println("Результат:");
        printDays(x);
    }

    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // Задание 3 задача 1
    private void task3_1() {
        System.out.println("\nЗадание 3 задача 1");

        int x = 5;
        System.out.println("Результат: \"" + listNums(x) + "\"");
    }

    public String listNums(int x) {
        String result = "";

        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }

        return result.trim();
    }

    // Задание 3 задача 4
    private void task3_4() {
        System.out.println("\nЗадание 3 задача 4");

        int x = 2;
        int y = 5;
        System.out.println("Результат: " + pow(x, y));
    }

    public int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    // Задание 3 задача 6
    private void task3_6() {
        System.out.println("\nЗадание 3 задача 6");

        int x = 1111;
        System.out.println("Результат: " + equalNum(x));

        x = 1211;
        System.out.println("Результат: " + equalNum(x));
    }

    public boolean equalNum(int x) {
        if (x < 0) {
            x = -x;
        }

        int last = x % 10;

        while (x > 0) {
            int digit = x % 10;

            if (digit != last) {
                return false;
            }

            x = x / 10;
        }

        return true;
    }

    // Задание 3 задача 7
    private void task3_7() {
        System.out.println("\nЗадание 3 задача 7");

        int x = 2;
        System.out.println("Результат:");
        square(x);

        x = 4;
        System.out.println("Результат:");
        square(x);
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 3 задача 9
    private void task3_9() {
        System.out.println("\nЗадание 3 задача 9");

        int x = 3;
        System.out.println("Результат:");
        rightTriangle(x);

        x = 4;
        System.out.println("Результат:");
        rightTriangle(x);
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Задание 4 задача 1
    private void task4_1() {
        System.out.println("\nЗадание 4 задача 1");

        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int x = 2;

        System.out.println("Результат: " + findFirst(arr, x));
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    // Задание 4 задача 2
    private void task4_2() {
        System.out.println("\nЗадание 4 задача 2");

        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int x = 2;

        System.out.println("Результат: " + findLast(arr, x));
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    // Задание 4 задача 5
    private void task4_5() {
        System.out.println("\nЗадание 4 задача 5");

        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;

        System.out.println("Результат: " + java.util.Arrays.toString(add(arr, ins, pos)));
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }

        return result;
    }

    // Задание 4 задача 8
    private void task4_8() {
        System.out.println("\nЗадание 4 задача 8");

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 8, 9};


        System.out.println("Результат: " + java.util.Arrays.toString(concat(arr1, arr2)));
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    // Задание 4 задача 10
    private void task4_10() {
        System.out.println("\nЗадание 4 задача 10");

        int[] arr = {1, 2, -3, 4, -2, 2, -5};

        System.out.println("Результат: " + java.util.Arrays.toString(deleteNegative(arr)));
    }

    public int[] deleteNegative(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}