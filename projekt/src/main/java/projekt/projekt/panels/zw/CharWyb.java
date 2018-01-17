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
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.obliczenia.Bm;
public class CharWyb extends JPanel {


	 private static  String zwl = "src/icons/zwl.png";
	 private static  String bez = "src/icons/bez.png"; 
	public CharWyb(){
	
		Dimension size = getPreferredSize();
		size.height = 140;
		size.width = 350;
		setPreferredSize(size);		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		
		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);

//		JLabel label = new JLabel("<html>W celu obliczenia nastaw<br/>należy wypełnić wszytskie<br/>wymagane pola</html>");
//		label.setFont (label.getFont ().deriveFont (10.0f));
		
				
//		gc.gridx = 0;
//		gc.gridy =0;
//		add(label, gc);
		
		gc.gridx = 2;
		gc.gridy = 2;
		final JComboBox charN = new JComboBox();
		charN.addItem("bezzwłoczną");
		charN.addItem("zwłoczną");
		add(charN, gc);
		gc.gridx = 1;
		gc.gridy = 2;
		add(Utils.label(" "), gc);
		gc.gridx = 0;
		gc.gridy = 2;
		add(Utils.label("Wyświetl charakterystykę        "), gc);
		
		
		
		charN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(charN.getSelectedItem().equals("bezzwłoczną")) {
					CharPanelZw.l.setIcon(new ImageIcon(bez));
				}else if(charN.getSelectedItem().equals("zwłoczną")){
					CharPanelZw.l.setIcon(new ImageIcon(zwl));			
				}
			}
		});
		
		
	}
}
