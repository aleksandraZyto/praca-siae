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

public class IrPanel extends JPanel{
	
	public IrPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color());
		
		final List<JTextField> prRezLiniiFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=3; i++ ){
			final JTextField field = Utils.numberField("20");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			
			if(i==2){
			add(Utils.label("                "), gc);
			}else{
				field.setToolTipText("<html>zalecana wartość: <br/>dla sieci kompensowanych: 15-25 om <br/>dla sieci uziemionych przez rezystor: jego znamionowy prąd zwarciowy</html>");
				add(field, gc);
				Utils.zzInputFields(field, prRezLiniiFields);

			}
		}
	
	}
}
