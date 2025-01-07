import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        JLabel label = new JLabel("This is a JLabel!", JLabel.CENTER);
        frame.add(label);                        // Add the label to the frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
