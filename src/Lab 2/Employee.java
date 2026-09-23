// Задание 2 Задача 4
public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
        this.department = null;
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (department == null) {
            return name + " не состоит ни в одном отделе";
        }

        if (department.getHead() == this) {
            return name + " начальник отдела " + department.getName();
        }

        String headName = "не назначен";

        if (department.getHead() != null) {
            headName = department.getHead().getName();
        }

        return name + " работает в отделе " + department.getName()
                + ", начальник которого " + headName;
    }
}