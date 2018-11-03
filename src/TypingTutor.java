import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	Character currentLetter;
	Date timeAtStart = new Date();
	int numberOfCorrectCharactersTyped = 0;
	public static void main(String[] args) {
		TypingTutor df = new TypingTutor();

	}

	public TypingTutor() {
		frame.add(label);
		frame.setVisible(true);
		frame.setSize(400, 100);
		label.setOpaque(true);
		frame.setTitle("Type or the human race goes extinct.");
		currentLetter = generateRandomLetter();
		label.setText(currentLetter.toString());
		label.setFont(label.getFont().deriveFont(38.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
		
	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		label.removeAll();
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			numberOfCorrectCharactersTyped++;
			label.setBackground(Color.GREEN);
			if (numberOfCorrectCharactersTyped == 10) {
				showTypingSpeed(numberOfCorrectCharactersTyped);
				System.exit(0);
			}
		} else {
			System.out.println("WrONg!");
			label.setBackground(Color.RED);
		}
		currentLetter = generateRandomLetter();
		label.setText(currentLetter.toString());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
