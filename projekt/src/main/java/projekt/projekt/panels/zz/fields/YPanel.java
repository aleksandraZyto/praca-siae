package projekt.projekt.panels.zz.fields;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.HFPanel;
import projekt.projekt.panels.zz.ZzFieldPanel;

public class YPanel extends JPanel{
	
	public static JTextField f1;
	public static JTextField f2;
	public static JTextField f3;
	public static JTextField f4;
	public static JTextField f5;
	public static JTextField f6;
	
	public YPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());
		
		final List<JTextField> admitUchybFields = new ArrayList<JTextField>();
		
		gc.gridx = 0;
		gc.gridy = 0;		
		add(Utils.label("                        "), gc);
		
			f1 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 1;
			gc.gridy = 0;
			HFPanel.tfList.add(f1);
			add(f1, gc);
			f1.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 2-2,5 mS<br/>dla przekładnika Ferrantiego: 0,6-0,8 mS</html>");
			Utils.zzInputFields(f1, admitUchybFields);

			f2 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 2;
			gc.gridy = 0;
			HFPanel.tfList.add(f2);
			add(f2, gc);
			f2.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 2-2,5 mS<br/>dla przekładnika Ferrantiego: 0,6-0,8 mS</html>");
			Utils.zzInputFields(f2, admitUchybFields);

			f3 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 3;
			gc.gridy = 0;
			HFPanel.tfList.add(f3);
			add(f3, gc);
			f3.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 2-2,5 mS<br/>dla przekładnika Ferrantiego: 0,6-0,8 mS</html>");
			Utils.zzInputFields(f3, admitUchybFields);

			f4 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 4;
			gc.gridy = 0;
			HFPanel.tfList.add(f4);
			add(f4, gc);
			f4.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 2-2,5 mS<br/>dla przekładnika Ferrantiego: 0,6-0,8 mS</html>");
			Utils.zzInputFields(f4, admitUchybFields);

			f5 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 5;
			gc.gridy = 0;
			HFPanel.tfList.add(f5);
			add(f5, gc);
			f5.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 2-2,5 mS<br/>dla przekładnika Ferrantiego: 0,6-0,8 mS</html>");
			Utils.zzInputFields(f5, admitUchybFields);

			f6 = Utils.numberField("");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 6;
			gc.gridy = 0;
			HFPanel.tfList.add(f6);
			add(f6, gc);
			f6.setToolTipText("<html>zalecana wartość:<br/>dla układu Holmgreena: 2-2,5 mS<br/>dla przekładnika Ferrantiego: 0,6-0,8 mS</html>");
			Utils.zzInputFields(f6, admitUchybFields);


			ZzFieldPanel.pola.add(f1);
			ZzFieldPanel.pola.add(f2);
			ZzFieldPanel.pola.add(f3);
			ZzFieldPanel.pola.add(f4);
			ZzFieldPanel.pola.add(f5);
			ZzFieldPanel.pola.add(f6);
	}
}
