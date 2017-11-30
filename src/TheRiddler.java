import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	String Ans= JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
	if (Ans.equals("meat")) {
		JOptionPane.showMessageDialog(null, "Correct!!");
 		Score++;
 	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect!! The awnser is meat!");
		// 5. Otherwise, say "wrong" and tell them the answer
		Score--;
	 }
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null, "The score was "+Score);
	}
}

