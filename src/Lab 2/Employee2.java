//Задание 3 задача 4
import java.util.ArrayList;
import java.util.List;

public class Employee2 {
    private String name;
    private Department2 department;

    public Employee2(String name) {
        this.name = name;
        this.department = null;
    }

    public Employee2(String name, Department2 department) {
        this.name = name;
        setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department2 getDepartment() {
        return department;
    }

    public void setDepartment(Department2 department) {
        if (this.department != null) {
            this.department.removeEmployee(this);
        }

        this.department = department;

        if (this.department != null) {
            this.department.addEmployee(this);
        }
    }

    public List<Employee2> getDepartmentEmployees() {
        if (department == null) {
            return new ArrayList<>();
        }

        return department.getEmployees();
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