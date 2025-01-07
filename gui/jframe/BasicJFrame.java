import javax.swing.JFrame;

public class BasicJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic JFrame"); // Create a frame with a title
        frame.setSize(400, 300);                  // Set width and height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        frame.setVisible(true);                  // Make the frame visible
    }
}
