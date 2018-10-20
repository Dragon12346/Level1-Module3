import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	static JFrame frame = new JFrame();
	static JButton button = new JButton();
	static JLabel label = new JLabel();
	static JPanel panel = new JPanel();
	static JLabel label2 = new JLabel();
	static JLabel label3 = new JLabel();

	public static void main(String[] args) {
		SlotMachine L = new SlotMachine();
		L.play();
	}
	
public void play(){
	panel.add(button);
	button.setText("SPIN");
	button.addActionListener(this);
	frame.add(panel);

	
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	panel.removeAll();
	panel.add(button);
	int rand = new Random().nextInt(3);
	if (rand == 0) {
		label = loadImageFromComputer("apple.jpg");
	}
	
	if (rand == 1) {
		label = loadImageFromComputer("orange.jpg");
	}
	
	if (rand == 2) {
		label = loadImageFromComputer("Cherry.jpg");
	}
	
	int rand2 = new Random().nextInt(3);
	if (rand2 == 0) {
		label2 = loadImageFromComputer("apple.jpg");
	}
	
	if (rand2 == 1) {
		label2 = loadImageFromComputer("orange.jpg");
	}
	
	if (rand2 == 2) {
		label2 = loadImageFromComputer("Cherry.jpg");
	}
	
	int rand3 = new Random().nextInt(3);
	if (rand3 == 0) {
		label3 = loadImageFromComputer("apple.jpg");
	}
	
	if (rand3 == 1) {
		label3 = loadImageFromComputer("orange.jpg");
	}
	
	if (rand3 == 2) {
		label3 = loadImageFromComputer("Cherry.jpg");
	}
	
	panel.add(label);
	panel.add(label2);
	panel.add(label3);
	frame.pack();
	if (rand3 == 1 && rand2 == 1 && rand == 1 || rand3 == 2 && rand2 == 2 && rand == 2 || rand3 == 0 && rand2 == 0 && rand == 0) {
		JOptionPane.showMessageDialog(null, "You Win!");
	}
}
}