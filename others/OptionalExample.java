import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create an Optional object with a value
        Optional<String> name = Optional.of("John Doe");
        
        // Check if a value is present and process it
        name.ifPresent(n -> System.out.println("Name: " + n));
        
        // Create an empty Optional
        Optional<String> emptyName = Optional.empty();
        
        // Use orElse() to provide a default value if the value is absent
        System.out.println("Name (or default): " + emptyName.orElse("No Name"));
        
        // Use orElseGet() to call a function if the value is absent
        System.out.println("Name (or from supplier): " + emptyName.orElseGet(() -> "Anonymous"));
        
        // Use orElseThrow() to throw an exception if the value is absent
        try {
            emptyName.orElseThrow(() -> new IllegalArgumentException("Name is missing"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Using map to transform the value if present
        Optional<Integer> length = name.map(String::length);
        System.out.println("Name length: " + length.orElse(0));
        
        // Using flatMap to transform a value and return an Optional
        Optional<String> uppercaseName = name.flatMap(n -> Optional.of(n.toUpperCase()));
        System.out.println("Uppercase Name: " + uppercaseName.orElse("No Name"));
    }
}
