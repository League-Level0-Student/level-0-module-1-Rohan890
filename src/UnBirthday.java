import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String birth = JOptionPane.showInputDialog(null,"When is your Birthday?");
	if(birth.equals("March 4")) {
	JOptionPane.showMessageDialog(null,"Happy Birthday!");
	}
	else {
	JOptionPane.showMessageDialog(null,"Happy UnBirthday");	
	}
	}
}
