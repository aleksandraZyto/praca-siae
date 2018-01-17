package projekt.projekt.panels.zz.fields;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class IcPanel extends JPanel{
	
	public static JTextField f1;
	public static JTextField f2;
	public static JTextField f3;
	public static JTextField f4;
	
	public IcPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();		
		setBackground(Utils.color2());
		
		final List<JTextField> prPojLiniiFields = new ArrayList<JTextField>();
		
		gc.gridx = 1;
		gc.gridy = 0;		
		add(Utils.label("                       "), gc);
		gc.gridx = 4;
		gc.gridy = 0;		
		add(Utils.label("                       "), gc);
		gc.gridx = 5;
		gc.gridy = 0;		
		add(Utils.label("                       "), gc);
		
			f1 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 0;
			gc.gridy = 0;
			add(f1, gc);			
			Utils.zzInputFields(f1, prPojLiniiFields);
			f2 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 2;
			gc.gridy = 0;
			add(f2, gc);			
			Utils.zzInputFields(f2, prPojLiniiFields);
			f3 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 3;
			gc.gridy = 0;
			add(f3, gc);			
			Utils.zzInputFields(f3, prPojLiniiFields);
			f4 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 6;
			gc.gridy = 0;
			add(f4, gc);			
			Utils.zzInputFields(f4, prPojLiniiFields);
		
	}
}
