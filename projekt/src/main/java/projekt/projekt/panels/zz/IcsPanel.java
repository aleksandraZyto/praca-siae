package projekt.projekt.panels.zz;

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
	
	public IcsPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();		
		
		final List<JTextField> prPojSieciFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=2; i++ ){
			final JTextField field = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			add(field, gc);			
			Utils.zzInputFields(field, prPojSieciFields);
		}
		
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("                "), gc);
	}
}
