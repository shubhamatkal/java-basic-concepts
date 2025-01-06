import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        String data = "Hello, this is byte stream data!";
        
        // Writing data to a file using FileOutputStream (byte stream)
        try (FileOutputStream outputStream = new FileOutputStream("byteData.txt")) {
            // Convert string to bytes and write it
            outputStream.write(data.getBytes());  
            System.out.println("Data written to file using byte stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from the file using FileInputStream (byte stream)
        try (FileInputStream inputStream = new FileInputStream("byteData.txt")) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print( byteData);  // Print byte as a character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
