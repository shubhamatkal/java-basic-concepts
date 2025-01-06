class Student {
    String name;
    int age;

    // Constructor to initialize fields
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20); // Original object
        Student student2 = new Student(student1); // Copy constructor

        student1.displayInfo();
        student2.displayInfo();

        // Modify the original object
        student1.name = "Bob";

        System.out.println("After modification:");
        student1.displayInfo(); // Changes reflect here
        student2.displayInfo(); // Copy remains unchanged
    }
}
