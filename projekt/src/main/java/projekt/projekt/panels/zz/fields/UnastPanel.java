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
import projekt.projekt.panels.zz.ZzFieldPanel;

public class UnastPanel extends JPanel{
	
	public static JTextField f1;
	public static JTextField f2;
	public static JTextField f3;
	public static JTextField f4;
	public static JTextField f5;
	public static JTextField f6;
	
	public UnastPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());
		
		final List<JTextField> uNastFields = new ArrayList<JTextField>();
		
		gc.gridx = 0;
		gc.gridy = 0;		
		add(Utils.label("                        "), gc);
		
		f1 = Utils.numberField("12");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;			
		add(f1, gc);
		f1.setToolTipText("<html>zalecana wartość: 12-15 [V] ");
		Utils.zzInputFields(f1, uNastFields);

		f2 = Utils.numberField("12");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;			
		add(f2, gc);
		f2.setToolTipText("<html>zalecana wartość: 12-15 [V] ");
		Utils.zzInputFields(f2, uNastFields);
	
		f3 = Utils.numberField("12");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;			
		add(f3, gc);
		f3.setToolTipText("<html>zalecana wartość: 12-15 [V] ");
		Utils.zzInputFields(f3, uNastFields);
	
		f4 = Utils.numberField("12");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;			
		add(f4, gc);
		f4.setToolTipText("<html>zalecana wartość: 12-15 [V] ");
		Utils.zzInputFields(f4, uNastFields);
	
		f5 = Utils.numberField("12");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;			
		add(f5, gc);
		f5.setToolTipText("<html>zalecana wartość: 12-15 [V] ");
		Utils.zzInputFields(f5, uNastFields);
	
		f6 = Utils.numberField("12");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;			
		add(f6, gc);
		f6.setToolTipText("<html>zalecana wartość: 12-15 [V] ");
		Utils.zzInputFields(f6, uNastFields);
	

		ZzFieldPanel.pola.add(f1);
		ZzFieldPanel.pola.add(f2);
		ZzFieldPanel.pola.add(f3);
		ZzFieldPanel.pola.add(f4);
		ZzFieldPanel.pola.add(f5);
		ZzFieldPanel.pola.add(f6);
			
			
	}
}