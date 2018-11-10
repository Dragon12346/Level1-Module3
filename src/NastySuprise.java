import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NastySuprise {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton button = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	NastySuprise a = new NastySuprise();
	a.play();
}

public void play() {
	frame.setVisible(true);
	frame.add(label);
	label.add(button);
	label.add(button2);
	button.setText("Trick");
	button2.setText("Treat");
	frame.pack();
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}
