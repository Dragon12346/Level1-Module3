import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	NastySuprise a = new NastySuprise();
	a.play();
}

public void play() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.setText("Trick");
	button2.setText("Treat");
	button.addActionListener(this);
	button2.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame framee = new JFrame();
         framee.add(imageLabel);
         framee.setVisible(true);
         framee.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton abc = (JButton) e.getSource();
	if (abc == button) {
		showPictureFromTheInternet("https://i.ytimg.com/vi/nu77ETGoxAY/maxresdefault.jpg");
	}
	if (abc == button2) {
		showPictureFromTheInternet("https://i.pinimg.com/originals/f3/ea/f5/f3eaf58911921390ad8ed506b13ca6b2.jpg");
	}
}
}
