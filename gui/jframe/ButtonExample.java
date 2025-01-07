import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 100, 100, 50);     // Set position and size
        frame.add(button);                       // Add the button to the frame
        frame.setSize(300, 300);
        frame.setLayout(null);                   // Disable layout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
