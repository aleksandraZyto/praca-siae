package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;
import projekt.projekt.panels.HFPanel;

public class IPanel extends JPanel{
	
	public IPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color());
		
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		JTextField field = Utils.numberField("");
		HFPanel.tfList.add(field);
		add(field, gc);	
		
		for (int i = 0; i <= 2; i++) {
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			
			add(Utils.label("                "), gc);
		}
		
	}
}
