import java.util.List;
import java.util.ArrayList;

public class Wildcard {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        printList(stringList); // Works with any type
    }
}
