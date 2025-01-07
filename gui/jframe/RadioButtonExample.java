import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Example");
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");

        rb1.setBounds(50, 50, 100, 30);
        rb2.setBounds(50, 100, 100, 30);

        ButtonGroup group = new ButtonGroup(); // Grouping radio buttons
        group.add(rb1);
        group.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.revalidate();
        frame.repaint();  // Refresh the frame after adding components
        frame.setVisible(true);
    }
}
