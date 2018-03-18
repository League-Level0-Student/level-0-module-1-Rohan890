//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String superpower = "heat vision";
		String superpower1 = "super strength";
		String superpower2 = "super speed";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String user = JOptionPane.showInputDialog("Enter a name?");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (user.equals("Bob")) {
			JOptionPane.showMessageDialog(null, superpower);

		}
		else if (user.equals("Bob2")) {
			JOptionPane.showMessageDialog(null, superpower1);	
		}
		else if (user.equals("Shrek")) {
			JOptionPane.showMessageDialog(null, superpower2);
		}
		
		
	}
}
