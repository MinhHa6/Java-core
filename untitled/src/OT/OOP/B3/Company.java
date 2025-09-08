package OT.OOP.B3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
