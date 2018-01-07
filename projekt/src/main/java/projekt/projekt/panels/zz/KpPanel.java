package projekt.projekt.panels.zz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.lang.reflect.Field;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class KpPanel extends JPanel{
	
	public KpPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());

		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		JTextField tf = Utils.numberField("0.9");
		tf.setToolTipText("<html>zalecana wartość:<br/>0,85 dla przekaźników elektromechanicznych<br/>0,95-0,99 dla przekaźników statycznych analogowych i cyfrowych");
		add(tf, gc);	
		
		for (int i = 0; i <= 2; i++) {
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(Utils.label("                "), gc);
		}
		
	}
}
