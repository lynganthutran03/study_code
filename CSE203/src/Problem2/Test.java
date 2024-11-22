package Problem2;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List instructorList = new List();
        instructorList.addInstructor(new Instructor("David", "Armstrong", "123-4567"));
        instructorList.addInstructor(new Instructor("Anna", "Kennedy", "764-8093"));
        instructorList.addInstructor(new Instructor("Isabella", "Brown", "591-2746"));

        System.out.println("Instructors list:");
        instructorList.display();

        System.out.println("\nEnter instructor first name:");
        String firstName = sc.next();
        System.out.println("Enter instructor last name:");
        String lastName = sc.next();
        System.out.println("Enter instructor office number:");
        String officeNumber = sc.next();

        Instructor find = instructorList.search(firstName, lastName, officeNumber);
        if(find != null) {
            System.out.println("\nInstructor found" + "\n" + find);
        }
        else {
            System.out.println("\nInstructor not found");
        }
    }
}
