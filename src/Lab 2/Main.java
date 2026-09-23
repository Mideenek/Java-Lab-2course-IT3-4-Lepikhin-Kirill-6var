public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1, задача 4\n ");

        Time t1 = new Time(10);
        Time t2 = new Time(10000);
        Time t3 = new Time(100000);

        System.out.println("10 секунд -> " + t1);
        System.out.println("10000 секунд -> " + t2);
        System.out.println("100000 секунд -> " + t3);

        System.out.println("\nЗадание 1, задача 5\n");

        House h1 = new House(1);
        House h2 = new House(5);
        House h3 = new House(23);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println("\nЗадание 2, задача 4\n");

        Department it = new Department("IT");

        Employee petrov = new Employee("Петров", it);
        Employee kozlov = new Employee("Козлов", it);
        Employee sidorov = new Employee("Сидоров", it);

        it.setHead(kozlov);

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);

        System.out.println("\nЗадание 3, задача 4 \n");

        Department2 it2 = new Department2("IT");

        Employee2 petrov2 = new Employee2("Петров", it2);
        Employee2 kozlov2 = new Employee2("Козлов", it2);
        Employee2 sidorov2 = new Employee2("Сидоров", it2);

        it2.setHead(kozlov2);

        System.out.println(petrov2);
        System.out.println(kozlov2);
        System.out.println(sidorov2);

        System.out.println("Все сотрудники отдела, где работает Петров:");

        for (Employee2 e : petrov2.getDepartmentEmployees()) {
            System.out.println("- " + e.getName());
        }

        System.out.println("\nЗадание 4, задача 3 \n");

        House2 houseA = new House2(2);
        House2 houseB = new House2(35);
        House2 houseC = new House2(91);

        System.out.println(houseA);
        System.out.println(houseB);
        System.out.println(houseC);

        System.out.println("Не получилось, дом не изменился: " + houseA);


        System.out.println("\nЗадание 5, задача 1 \n");

        Pistol defaultPistol = new Pistol();
        System.out.println("Создан " + defaultPistol);

        Pistol pistol = new Pistol(3);
        System.out.println("Создан " + pistol);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Выстрел " + i + ": ");
            pistol.shoot();
        }

        System.out.println("После стрельбы: " + pistol);
    }


}