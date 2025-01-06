import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Create a stream from a collection (List)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Transform the stream (e.g., double each number)
        // 2. Filter the stream (e.g., only keep even numbers)
        // 3. Reduce the stream (e.g., sum the numbers)
        
        // int result = numbers.stream()              // Create a stream from the list
        //                      .filter(n -> n % 2 == 0)  // Keep only even numbers
        //                      .map(n -> n * 2)           // Double each number
        //                      .reduce(0, (sum, n) -> sum + n);  // Sum all numbers

        int result = numbers.stream()
                            .parallel()          // Use parallel processing
                            .filter(n -> n % 2 == 0)
                            .map(n -> n * 2)
                            .reduce(0, (sum, n) -> sum + n);
        
        System.out.println("Result: " + result);  // Output: 60 (2 + 4 + 6 + 8 + 10) * 2
    }
}
