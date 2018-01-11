package projekt.projekt.panels.zz.results;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.obliczenia.Bm;
import projekt.projekt.panels.zz.obliczenia.I;

public class Yo extends JPanel {

	
	public static JLabel y = Utils.label("? < Yop < ?");
	public static JLabel u = Utils.label("? < Uop");

	
	public Yo(){
	
		Dimension size = getPreferredSize();
		size.height = 100;
		size.width = 150;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Yo >"));
		GridBagConstraints gc = new GridBagConstraints();	

		//labels

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label("Uop > Uon      "), gc);
		
		gc.gridy = 0;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(u, gc);
		
		gc.gridy = 1;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label("|Yop| > Yon      "), gc);
		
		gc.gridy = 1;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(y, gc);
			
	}
}
