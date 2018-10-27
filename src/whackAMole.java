import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static int lol = 0;
	JButton mButton;
    Date timeAtStart = new Date();
	int AIA = new Random().nextInt(25);
	public static void main(String[] args) {
		new whackAMole().start();
	}
	public void start() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		drawButtons();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if (lol == 10) {
			endGame(timeAtStart,lol);
		}
	}

	public void drawButtons() {
		
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			if (AIA == i) {
				System.out.println(" " + i + " " + AIA);
				button.setText("Mole!");
				mButton = button;
			}
			button.addActionListener(this);		
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton hello;
		hello = (JButton) e.getSource();
		if (mButton==hello) {
		lol++;
		frame.getContentPane().removeAll();
		panel.removeAll();
		new whackAMole().start();
		speak("You still have equal scrubority");
		}
		else {
			speak("your a scrub");
		}

	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
