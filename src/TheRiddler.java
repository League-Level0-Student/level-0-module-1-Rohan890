import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int v = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("What can you catch but not throw?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals("A Cold")){
	JOptionPane.showMessageDialog(null,"Correct" );
	v++;
}
else{
JOptionPane.showMessageDialog(null,"Wrong" );	
}
JOptionPane.showMessageDialog(null,v);
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

