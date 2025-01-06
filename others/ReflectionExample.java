public class ReflectionExample {

    public static boolean classequal(Object o1, Object o2) {
        // Check if either object is null to avoid NullPointerException
        if (o1 == null || o2 == null) {
            return false;
        }
        
        // Use the getClass() method to get the runtime class of both objects
        return o1.getClass() == o2.getClass();
    }

    public static void main(String[] args) {
        // Create two objects of the same class
        Employee e1 = new Manager();
        Employee e2 = new Manager();

        // Create objects of different classes
        Employee e3 = new Manager();
        Employee e4 = new Worker();

        // Check if the objects are of the same class
        System.out.println(classequal(e1, e2)); // true
        System.out.println(classequal(e3, e4)); // false
    }
}

class Employee { }

class Manager extends Employee { }

class Worker extends Employee { }
