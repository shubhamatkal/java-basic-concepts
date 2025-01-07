import javax.swing.JOptionPane;

public class JOptionPane1 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello"+ name);

		double age = Double.parseDouble( JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+ age + "age old.");
	}
}
