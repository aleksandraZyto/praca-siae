package projekt.projekt.panels.zz.obliczenia;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.fields.KbPanel;

public class ButtonPanel extends JPanel {

	public JButton b;
	public ButtonPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 50;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		gc.gridx = 0;
		gc.gridy = 0;
		b = new JButton("Oblicz nastawy");
		b.setMargin(new Insets(13,15,13,15));
		add(b, gc);
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}
