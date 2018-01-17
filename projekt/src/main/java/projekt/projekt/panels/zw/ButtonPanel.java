package projekt.projekt.panels.zw;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.images.CharPanel;
import projekt.projekt.panels.zz.obliczenia.Bm;public class ButtonPanel extends JPanel {

	public JButton b;
	 private static  String zwl = "src/icons/zwl.png";
	 private static  String bez = "src/icons/bez.png"; 
	public ButtonPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 140;
		size.width = 350;
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		
		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);

//		JLabel label = new JLabel("<html>W celu obliczenia nastaw<br/>należy wypełnić wszytskie<br/>wymagane pola</html>");
//		label.setFont (label.getFont ().deriveFont (10.0f));
		
				
//		gc.gridx = 0;
//		gc.gridy =0;
//		add(label, gc);
		
		gc.gridx = 1;
		gc.gridy =0;
		add(Utils.label("  "), gc);
		
		b = new JButton("Oblicz nastawy prądowe");
		b.setMargin(new Insets(15,15,15,15));
		gc.gridx = 2;
		gc.gridy = 0;
		gc.gridwidth =2;
		add(b, gc);
		///////////
		
		b.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
				ResultPanel.iKbis.setText("    =   "+df.format(Obliczenia.iKbis()/1000)+"  [kA]");
				ResultPanel.iKmin.setText("    =   "+df.format(Obliczenia.iKmin()/1000)+"  [kA]");
				ResultPanel.xZw.setText("    =   "+df.format(Obliczenia.xZw())+"  [om]");
				ResultPanel.zZw.setText("    =   "+df.format(Obliczenia.zZw())+"  [om]");
				ResultPanel.iRBzzwl.setText("    =   "+df.format(Obliczenia.iRBzzwl())+"  [A]");
				ResultPanel.iRZwl.setText("    :   "+df.format(Obliczenia.iRZwlMin())+"  [A]  <  Ir  <  "+df.format(Obliczenia.iRZwlMax())+"  [A]");
				ResultPanel.t.setText("    =   "+df.format(Bm.d(Dane.tdot)+Bm.d(Dane.tot)) +" [s]");
				
			}
		});
	}
}
