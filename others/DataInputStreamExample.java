import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("data.dat"))) {
            int number = inputStream.readInt();  // Read an integer from file
            System.out.println("Number from file: " + number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
