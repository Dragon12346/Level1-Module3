import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();

	public static void main(String[] args) {
		new whackAMole().start();
	}
	public void start() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		drawButtons();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void drawButtons() {
		for (int i = 0; i < 24; i++) {
			int AIA = new Random().nextInt(24);
			JButton button = new JButton();
			panel.add(button);
			if (AIA == i) {
				button.setText("Mole!");
			}
		}
	}
}
