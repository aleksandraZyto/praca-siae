package projekt.projekt.panels.zz.obliczenia;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.ResultPanel;

public class ButtonPanel extends JPanel {

	public JButton b;
	public ButtonPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 50;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		gc.gridx = 0;
		gc.gridy = 0;
		b = new JButton("Oblicz nastawy");
		b.setMargin(new Insets(13,15,13,15));
		add(b, gc);
		
		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		
		b.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {

				ResultPanel.d.setText("    =   "+df.format(Bm.wspd()));
				ResultPanel.a.setText("    =   "+df.format(Bm.a()));
				ResultPanel.s.setText("    =   "+df.format(Bm.s()));

				ResultPanel.i.setText("    :   "+df.format(I.iMin())+" [A] < Ion < "+df.format(I.iMax())+" [A]"); 
				ResultPanel.y.setText("    :   "+df.format(1000*Y.yMin())+" [mS] < Yon < "+df.format(1000*Y.yMax())+" [mS]"); 
				ResultPanel.g.setText("    :   "+df.format(1000*G.gMin())+" [mS] < Gon < "+df.format(1000*G.gMax())+" [mS]"); 
				ResultPanel.b.setText("    :   "+df.format(1000*B.bMin())+" [mS] < Bon"); 
		}
		});
	}
}
