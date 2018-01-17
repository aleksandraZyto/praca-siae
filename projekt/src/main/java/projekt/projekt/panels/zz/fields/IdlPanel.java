package projekt.projekt.panels.zz.fields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.ZzFieldPanel;

public class IdlPanel extends JPanel{
	
	public static JTextField f1;
	public static JTextField f2;
	
	public IdlPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());
		
		final List<JTextField> prDlFields = new ArrayList<JTextField>();
		
		f1 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f1, gc);			
		Utils.zzInputFields(f1, prDlFields);
		
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(Utils.label("                "), gc);
			
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(Utils.label("                "), gc);

			f2 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(f2, gc);			
			Utils.zzInputFields(f2, prDlFields);
				
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(Utils.label("                "), gc);
			
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(Utils.label("                "), gc);
			
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(Utils.label("                "), gc);
			

			ZzFieldPanel.pola.add(f2);
			ZzFieldPanel.pola.add(f2);
		
		
	}
}
