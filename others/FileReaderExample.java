import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("file.txt")) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);  // Print each byte as a character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
