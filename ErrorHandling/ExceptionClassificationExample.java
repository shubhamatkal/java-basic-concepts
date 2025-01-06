import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionClassificationExample {

    public static void main(String[] args) {
        
        // Example 1: RuntimeException (Unchecked Exception)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!"); // Handle the unchecked exception
        }

        // Example 2: Checked Exception (FileNotFoundException)
        try {
            openFile("non_existent_file.txt"); // This will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found."); // Handle the checked exception
        }

        // Example 3: Error (OutOfMemoryError)
        try {
            // Simulate a memory exhaustion error (only for demonstration)
            String[] largeArray = new String[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Error: Out of memory!"); // Cannot recover from this error
        }
    }

    // Method to simulate opening a file and throwing FileNotFoundException
    public static void openFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist.");
        }
        System.out.println("File opened successfully.");
    }
}

