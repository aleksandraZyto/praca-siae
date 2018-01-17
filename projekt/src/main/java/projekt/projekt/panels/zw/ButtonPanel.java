package projekt.projekt.panels.zw;

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
import projekt.projekt.panels.zw.ResultPanel;
import projekt.projekt.panels.zz.obliczenia.B;
import projekt.projekt.panels.zz.obliczenia.Bm;
import projekt.projekt.panels.zz.obliczenia.G;
import projekt.projekt.panels.zz.obliczenia.I;
import projekt.projekt.panels.zz.obliczenia.Y;public class ButtonPanel extends JPanel {

	public JButton b;
	public ButtonPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 50;
		size.width = Utils.secRowWidth();
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
				ResultPanel.iKbis.setText("    =   "+df.format(Obliczenia.iKbis()/1000)+"  [kA]");
				ResultPanel.iKmin.setText("    =   "+df.format(Obliczenia.iKmin()/1000)+"  [kA]");
				ResultPanel.xZw.setText("    =   "+df.format(Obliczenia.xZw())+"  [om]");
				ResultPanel.zZw.setText("    =   "+df.format(Obliczenia.zZw())+"  [om]");
				ResultPanel.iRBzzwl.setText("    =   "+df.format(Obliczenia.iRBzzwl())+"  [A]");
				ResultPanel.iRZwl.setText("    :   "+df.format(Obliczenia.iRZwlMin())+"  [A]  <  Ir  <  "+df.format(Obliczenia.iRZwlMax())+"  [A]");
				ResultPanel.t.setText("    =   "+df.format(Bm.d(Dane.tdot)+Bm.d(Dane.tot)));
				
			}
		});
	}
}
