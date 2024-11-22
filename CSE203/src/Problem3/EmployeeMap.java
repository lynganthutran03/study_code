package Problem3;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    private Map<String, Employee> employeeMap;

    public EmployeeMap() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getID(), employee);
    }

    public Employee getEmployeeID(String ID) {
        return employeeMap.get(ID);
    }

    public void display() {
        if(employeeMap.isEmpty()) {
            System.out.println("No employee found");
        }
        else {
            for(Employee employee: employeeMap.values()) {
                System.out.println(employee);
            }
        }
    }
}
