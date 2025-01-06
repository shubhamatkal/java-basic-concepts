public class GenericMethodExample {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"Java", "Generics", "Example"};
        Integer[] intArray = {1, 2, 3};

        printArray(stringArray); // Works with String
        printArray(intArray);    // Works with Integer
    }
}

