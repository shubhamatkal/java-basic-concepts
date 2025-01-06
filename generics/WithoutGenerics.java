import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();  // Raw type
        list.add("Hello");
        list.add(123); // Mixing types allowed

        // Need manual type casting
        String str = (String) list.get(0);
        System.out.println(str);
    }
}
