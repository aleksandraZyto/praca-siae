package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;
import projekt.projekt.panels.HFPanel;

public class YPanel extends JPanel{
	
	public YPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color());
		
		final List<JTextField> admitUchybFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=3; i++ ){
			final JTextField field = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx ++;
			gc.gridy = 0;
			HFPanel.tfList.add(field);
			if(i==0){
			add(Utils.label("                "), gc);
			}else{
				add(field, gc);
				field.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 2-2,5 mS<br/>dla przekładnika Ferrantiego: 0,6-0,8 mS</html>");
				Utils.zzInputFields(field, admitUchybFields);

			}
		}
	}
}
