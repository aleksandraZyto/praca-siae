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

public class UnastPanel extends JPanel{
	
	public static JTextField field;
	
	public UnastPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());
		
		final List<JTextField> uNastFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=3; i++ ){
			field = Utils.numberField("12");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;			
				add(field, gc);
				field.setToolTipText("<html>zalecana wartość: ");
				Utils.zzInputFields(field, uNastFields);
			}
		}
	}
