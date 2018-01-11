package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.obliczenia.Bm;

public class WspResultPanel extends JPanel {

	public static JLabel d = Utils.label("d   =   ?                   ");
	public static JLabel a = Utils.label("a   =   ?                   ");
	public static JLabel s = Utils.label("s   =   ?                   ");
	
	public WspResultPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 100
				;
		size.width = 280;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Obliczone współczynniki"));
		GridBagConstraints gc = new GridBagConstraints();	

		//labels

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(d, gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(a, gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(s, gc);
	
	}
}
