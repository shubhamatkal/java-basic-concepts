import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, Integer> map = new HashMap<>();
        
        // Add key-value pairs to the map
        map.put("Alice", 30);   // Alice is the key, 30 is the value
        map.put("Bob", 25);     // Bob is the key, 25 is the value
        map.put("Charlie", 35); // Charlie is the key, 35 is the value

        // Retrieve a value using its key
        System.out.println("Alice's age: " + map.get("Alice")); // Output: 30
        
        // Check if a key exists in the map
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }
        
        // Remove a key-value pair
        map.remove("Charlie");

        // Display the entire map
        System.out.println("Updated Map: " + map); // Output: {Alice=30, Bob=25}
        
        // Iterate over the keys and values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}

