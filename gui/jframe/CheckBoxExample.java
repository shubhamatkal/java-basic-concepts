import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");

        checkBox1.setBounds(50, 50, 100, 30);
        checkBox2.setBounds(50, 100, 100, 30);

        frame.add(checkBox1);
        frame.add(checkBox2);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
