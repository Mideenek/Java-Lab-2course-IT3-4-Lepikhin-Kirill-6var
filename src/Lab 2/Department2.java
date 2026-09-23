//Задание 3 задача 4
import java.util.ArrayList;
import java.util.List;

public class Department2 {
    private String name;
    private Employee2 head;
    private List<Employee2> employees = new ArrayList<>();

    public Department2(String name) {
        this.name = name;
        this.head = null;
    }

    public Department2(String name, Employee2 head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee2 getHead() {
        return head;
    }

    public void setHead(Employee2 head) {
        this.head = head;
    }

    public void addEmployee(Employee2 employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void removeEmployee(Employee2 employee) {
        employees.remove(employee);
    }

    public List<Employee2> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "отдел " + name + ", начальник не назначен";
        }

        return "отдел " + name + ", начальник " + head.getName();
    }
}