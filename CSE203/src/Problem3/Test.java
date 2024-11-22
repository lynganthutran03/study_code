package Problem3;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeMap em = new EmployeeMap();
        em.addEmployee(new Employee("Arrum", "001823"));
        em.addEmployee(new Employee("Belle", "003012"));
        em.addEmployee(new Employee("Chris", "002703"));

        System.out.println("Employee list:");
        em.display();

        System.out.println("\nEnter employee ID:");
        String ID = sc.next();

        Employee find = em.getEmployeeID(ID);
        if(find != null) {
            System.out.println("\nEmployee found" + "\n" + find);
        }
        else {
            System.out.println("\nEmployee not found");
        }
    }
}
