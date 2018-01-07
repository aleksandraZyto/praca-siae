package projekt.projekt.panels.zz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class KcPanel extends JPanel{
	
	public KcPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	


		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.numberField("1.2"), gc);	
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.numberField("2"), gc);
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.numberField(""), gc);	
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.numberField("2"), gc);	
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
	}
}
