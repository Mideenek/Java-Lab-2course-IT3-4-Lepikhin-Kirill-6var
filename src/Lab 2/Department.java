// Задание 2 Задача 4
public class Department {
    private String name;
    private Employee head;

    public Department(String name) {
        this.name = name;
        this.head = null;
    }

    public Department(String name, Employee head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    @Override
    public String toString() {
        if (head != null) {
            return "Отдел " + name + ", начальник: " + head.getName();
        }
        return "Отдел " + name;
    }
}