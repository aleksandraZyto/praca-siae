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

public class UPanel extends JPanel{
	
	public UPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		final List<JTextField> napLiniiFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=3; i++ ){
			final JTextField field = Utils.numberField("100");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;			
			if(i==0){
			add(Utils.label("                "), gc);
			}else{
				add(field, gc);
				Utils.zzInputFields(field, napLiniiFields);

			}
		}
	}
}
