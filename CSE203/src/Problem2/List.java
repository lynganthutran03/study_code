package Problem2;

import java.util.HashSet;
import java.util.Set;

public class List {
    private Set<Instructor> list;

    public List() {
        list = new HashSet<>();
    }

    public void addInstructor(Instructor instructor) {
        list.add(instructor);
    }

    public void display() {
        if(list.isEmpty()) {
            System.out.println("No instructor found");
        }
        else {
            for(Instructor instructor: list) {
                System.out.println(instructor);
            }
        }
    }

    public Instructor search(String firstName, String lastName, String officeNumber) {
        for(Instructor instructor: list) {
            if(instructor.getFirstName().equals(firstName) &&
            instructor.getLastName().equals(lastName) &&
            instructor.getOfficeNumber().equals(officeNumber)) {
                return instructor;
            }
        }
        return null;
    }
}
