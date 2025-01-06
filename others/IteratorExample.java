import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create a list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Use the iterator to print each number
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
    }
}
