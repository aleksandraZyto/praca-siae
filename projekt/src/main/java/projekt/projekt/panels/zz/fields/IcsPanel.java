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

public class IcsPanel extends JPanel{
	
	public static JTextField f1;
	public static JTextField f2;
	public static JTextField f3;
	public static JTextField f4;
	public static JTextField f5;
	public static JTextField f6;
	public static JTextField f0;
	
	
	public IcsPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color());
		
		final List<JTextField> prPojSieciFields = new ArrayList<JTextField>();
	
		f0 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f0, gc);			
		Utils.zzInputFields(f0, prPojSieciFields);
		
		f1 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f1, gc);			
		Utils.zzInputFields(f1, prPojSieciFields);

		f2 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f2, gc);			
		Utils.zzInputFields(f2, prPojSieciFields);

		f3 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f3, gc);			
		Utils.zzInputFields(f3, prPojSieciFields);

		f4 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f4, gc);			
		Utils.zzInputFields(f4, prPojSieciFields);

		f5 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f5, gc);			
		Utils.zzInputFields(f5, prPojSieciFields);

		f6 = Utils.numberField("");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(f6, gc);			
		Utils.zzInputFields(f6, prPojSieciFields);
	
	}
}
