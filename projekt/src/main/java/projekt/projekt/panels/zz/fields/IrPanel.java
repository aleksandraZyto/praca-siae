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

public class IrPanel extends JPanel{

	public static JTextField f0;
	public static JTextField f1;
	public static JTextField f2;
	public static JTextField f3;
	public static JTextField f4;
	
	public IrPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color());
		
		final List<JTextField> prRezLiniiFields = new ArrayList<JTextField>();
		
		
		gc.gridx = 2;
		gc.gridy = 0;		
		add(Utils.label("                        "), gc);
		gc.gridx = 6;
		gc.gridy = 0;		
		add(Utils.label("                        "), gc);
		
		f0 = Utils.numberField("20");
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx = 0;
		gc.gridy = 0;
		f0.setToolTipText("<html>zalecana wartość: <br/>dla sieci kompensowanych: 15-25 A <br/>dla sieci uziemionych przez rezystor: jego znamionowy prąd zwarciowy</html>");
		add(f0, gc);
		Utils.zzInputFields(f0, prRezLiniiFields);
		
			f1 = Utils.numberField("20");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 1;
			gc.gridy = 0;
			f1.setToolTipText("<html>zalecana wartość: <br/>dla sieci kompensowanych: 15-25 om <br/>dla sieci uziemionych przez rezystor: jego znamionowy prąd zwarciowy</html>");
			add(f1, gc);
			Utils.zzInputFields(f1, prRezLiniiFields);
			
			f2 = Utils.numberField("20");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx =3;
			gc.gridy = 0;
			f2.setToolTipText("<html>zalecana wartość: <br/>dla sieci kompensowanych: 15-25 om <br/>dla sieci uziemionych przez rezystor: jego znamionowy prąd zwarciowy</html>");
			add(f2, gc);
			Utils.zzInputFields(f2, prRezLiniiFields);
			
			f3 = Utils.numberField("20");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 4;
			gc.gridy = 0;
			f3.setToolTipText("<html>zalecana wartość: <br/>dla sieci kompensowanych: 15-25 om <br/>dla sieci uziemionych przez rezystor: jego znamionowy prąd zwarciowy</html>");
			add(f3, gc);
			Utils.zzInputFields(f3, prRezLiniiFields);
			
			f4 = Utils.numberField("20");
			gc.anchor = Utils.fa();
			gc.weightx = Utils.fw();
			gc.gridx = 5;
			gc.gridy = 0;
			f4.setToolTipText("<html>zalecana wartość: <br/>dla sieci kompensowanych: 15-25 om <br/>dla sieci uziemionych przez rezystor: jego znamionowy prąd zwarciowy</html>");
			add(f4, gc);
			Utils.zzInputFields(f4, prRezLiniiFields);
			

			ZzFieldPanel.pola.add(f1);
			ZzFieldPanel.pola.add(f0);
			ZzFieldPanel.pola.add(f2);
			ZzFieldPanel.pola.add(f3);
			ZzFieldPanel.pola.add(f4);
	
	}
}
