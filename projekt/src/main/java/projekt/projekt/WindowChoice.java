package projekt.projekt;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowChoice extends JPanel{
	
	public WindowChoice(){
		Dimension size = getPreferredSize();
		size.height = 300;
		size.width = 300;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Wybór rodzaju zabezpieczenia"));
	
		JButton bezzwlButton = new JButton("Zabezpieczenie nadprądowe");
		JButton admitButton = new JButton("Zabezpieczenie ziemnozwarciowe admitancyjne");
				
		bezzwlButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new NadprFrame("Nastawy zabezpieczeń linii SN");
				Utils.frameSetting(frame, 600, 600);
			}
		});
				
		admitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new AdmitFrame("Nastawy zabezpieczeń linii SN");
				Utils.frameSetting(frame, 600, 500);
			}
		});

		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	

		//Button Row/
		gc.gridx = 0;
		gc.gridy = 0;
		add(bezzwlButton, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(admitButton, gc);
	}
}
