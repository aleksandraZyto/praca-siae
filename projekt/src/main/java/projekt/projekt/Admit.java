package projekt.projekt;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Admit extends JPanel {
		
	public Admit(){
		Dimension size = getPreferredSize();
		size.height = 150;
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder("Zabezpieczenie ziemnozwarciowe admitancyjne"));
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
	}
	
}
