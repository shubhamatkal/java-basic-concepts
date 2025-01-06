public class AssertionsExample {
    public static void main(String[] args) {
        int number = -5;

        // Assert that number is positive
        assert number > 0 : "Number must be positive! Found: " + number;

        System.out.println("Number is positive: " + number);
    }
}

