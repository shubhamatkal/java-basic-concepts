import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorHandlingExample {

    public static void main(String[] args) {
        // Example 1: Handling invalid user input (file not found)
        String filename = "invalid_file.txt"; // Simulating user input with an invalid filename
        
        try {
            // Trying to open a file that doesn't exist
            openFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' was not found.");
        }

        // Example 2: Handling arithmetic errors (divide by zero)
        int result = 0;
        try {
            // Trying to divide by zero
            result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Example 3: Handling null pointer (accessing a variable that is null)
        String str = null;
        try {
            // Trying to access a method on a null reference
            int length = getStringLength(str);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot call method on a null object.");
        }

        // Example 4: Handling invalid array index
        int[] numbers = {1, 2, 3};
        try {
            // Trying to access an invalid index
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }
    }

    // Method to simulate opening a file (throw FileNotFoundException if file doesn't exist)
    public static void openFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file); // Will throw FileNotFoundException if file doesn't exist
        System.out.println("File opened successfully.");
    }

    // Method to simulate division (throw ArithmeticException if divisor is zero)
    public static int divide(int a, int b) {
        return a / b; // Will throw ArithmeticException if b is zero
    }

    // Method to get the length of a string (throws NullPointerException if string is null)
    public static int getStringLength(String str) {
        return str.length(); // Will throw NullPointerException if str is null
    }
}
