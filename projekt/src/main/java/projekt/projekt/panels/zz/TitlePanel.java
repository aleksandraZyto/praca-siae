package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import projekt.projekt.Utils;

public class TitlePanel extends JPanel {
	
	public TitlePanel(){
		
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
//		setBackground(Utils.color());
		
		gc.gridx = 0;
		gc.gridy = 0;             
		add(Utils.label("   Io >              "), gc);
		gc.gridx ++;
		gc.gridy = 0;               
		add(Utils.label("   I -> cz          "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("   I -> b           "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("   Yo >             "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("   Go >             "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("   Gok              "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("   Bok       "), gc);
	}
}
