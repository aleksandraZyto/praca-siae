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

public class UPanel extends JPanel{
	
	public static JTextField f1;
	public static JTextField f2;
	public static JTextField f3;
	public static JTextField f4;
	public static JTextField f5;
	public static JTextField f6;
	
	public UPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth()
				;
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());
		
		final List<JTextField> napLiniiFields = new ArrayList<JTextField>();
		
		
		gc.gridx = 0;
		gc.gridy = 0;		
		add(Utils.label("                        "), gc);
		
		f1 = Utils.numberField("100");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx = 1;
		gc.gridy = 0;		
		add(f1, gc);
		f1.setToolTipText("<html>zalecana wartość: <br/>100V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia nominalnego)<br/>105V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia roboczego)<br/></html>");
		Utils.zzInputFields(f1, napLiniiFields);

		f2 = Utils.numberField("100");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx = 2;
		gc.gridy = 0;		
		add(f2, gc);
		f2.setToolTipText("<html>zalecana wartość: <br/>100V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia nominalnego)<br/>105V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia roboczego)<br/></html>");
		Utils.zzInputFields(f2, napLiniiFields);

		f3 = Utils.numberField("100");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx = 3;
		gc.gridy = 0;		
		add(f3, gc);
		f3.setToolTipText("<html>zalecana wartość: <br/>100V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia nominalnego)<br/>105V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia roboczego)<br/></html>");
		Utils.zzInputFields(f3, napLiniiFields);

		f4 = Utils.numberField("100");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx = 4;
		gc.gridy = 0;		
		add(f4, gc);
		f4.setToolTipText("<html>zalecana wartość: <br/>100V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia nominalnego)<br/>105V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia roboczego)<br/></html>");
		Utils.zzInputFields(f4, napLiniiFields);

		f5 = Utils.numberField("100");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx = 5;
		gc.gridy = 0;		
		add(f5, gc);
		f5.setToolTipText("<html>zalecana wartość: <br/>100V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia nominalnego)<br/>105V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia roboczego)<br/></html>");
		Utils.zzInputFields(f5, napLiniiFields);

		f6 = Utils.numberField("100");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx = 6;
		gc.gridy = 0;		
		add(f6, gc);
		f6.setToolTipText("<html>zalecana wartość: <br/>100V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia nominalnego)<br/>105V (jeśli prąd pojemnościowy zwarcia był obliczony dla napięcia roboczego)<br/></html>");
		Utils.zzInputFields(f6, napLiniiFields);
		
	}
}
