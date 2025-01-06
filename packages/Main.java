import com.Person;
import com.Student;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object (directly accessible since it's public)
        Person person = new Person("John Doe", 30, "123 Main St");
        person.displayInfo();  // Accessible because displayInfo is public

        // Creating a Student object (subclass of Person)
        Student student = new Student("Jane Doe", 20, "456 Oak St");
        student.displayInfo();  // Accessible because displayInfo is public in Student class

        // Accessing public field (name)
        System.out.println("Person's Name: " + person.name);

        // Can't directly access private or default fields
        // person.age; // Error: age has default visibility, accessible only within the same package.
    }
}
