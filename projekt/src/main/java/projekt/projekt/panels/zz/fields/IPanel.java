package projekt.projekt.panels.zz.fields;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.HFPanel;
import projekt.projekt.panels.zz.ZzFieldPanel;

public class IPanel extends JPanel{
	 
	public static JTextField field1;
	public static JTextField field2;
	
	public IPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color());
		
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx =0;
		gc.gridy = 0;
		field1 = Utils.numberField("");
		HFPanel.tfList.add(field1);
		field1.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 30-50 mA<br/>dla przekładnika Ferrantiego: 10-20 mA</html>");
		add(field1, gc);	
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx =6;
		gc.gridy = 0;
		field2 = Utils.numberField("");
		HFPanel.tfList.add(field2);
		field2.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 30-50 mA<br/>dla przekładnika Ferrantiego: 10-20 mA</html>");
		add(field2, gc);	
		
		for (int i = 0; i <= 4; i++) {
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 1+i;
			gc.gridy = 0;
			
			add(Utils.label("                "), gc);
		}
		

		ZzFieldPanel.pola.add(field1);
		ZzFieldPanel.pola.add(field2);
		
	}
}
