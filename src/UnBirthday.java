import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String bd = JOptionPane.showInputDialog("when is your Birthday?");
		if (bd.equals("11/29")) {
			JOptionPane.showMessageDialog(null, "Happy bert-day");
		} else {
			JOptionPane.showMessageDialog(null, "Too bad... well, have a happy unbirthday!");
		}
	}
}
