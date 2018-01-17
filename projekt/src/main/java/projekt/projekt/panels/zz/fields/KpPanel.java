package projekt.projekt.panels.zz.fields;

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
import projekt.projekt.panels.zz.ZzFieldPanel;

public class KpPanel extends JPanel{
	
	public static JTextField field;
	
	public KpPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());

		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		field = Utils.numberField("0.9");
		field.setToolTipText("<html>zalecana wartość:<br/>0,85 dla przekaźników elektromechanicznych<br/>0,95-0,99 dla przekaźników statycznych analogowych i cyfrowych");
		add(field, gc);	
		
		for (int i = 0; i <= 5; i++) {
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(Utils.label("                "), gc);
		}

		ZzFieldPanel.pola.add(field);
	}
}
