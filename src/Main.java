import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Test your java skills");
		int score = 0;
		
		if (JOptionPane.showOptionDialog(null, "Is true an examble of a string", "Types", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, null, null) == 1) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		if (JOptionPane.showOptionDialog(null, "Is \"1.0\" an examble of a double", "Types", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, null, null) == 1) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		if (JOptionPane.showOptionDialog(null, "Will  (int) 3.0 / 2.0 return 1.5?", "Casting", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, null, null) == 0) { // yes
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		if (JOptionPane.showOptionDialog(null, "Can a method be run more than once?", "Methods", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, null, null) == 0) { // yes
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		if (JOptionPane.showOptionDialog(null, "Is nesting if statements equivalent to using ||?", "Tyes", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, null, null) == 1) { // yes
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		JOptionPane.showMessageDialog(null, "Your score was " + score + " / 5");
	}
}
