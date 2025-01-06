import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Specify type
        list.add("Hello");
        // list.add(123); // Compile-time error: type mismatch

        // No type casting required
        String str = list.get(0);
        System.out.println(str);
    }
}
