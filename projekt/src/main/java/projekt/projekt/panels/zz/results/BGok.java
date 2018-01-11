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

public class BGok extends JPanel {

	
	public static JLabel g = Utils.label("? < Gop < ?");
	public static JLabel u = Utils.label("? < Uop");
	public static JLabel b = Utils.label("? < Bop");

	
	public BGok(){
	
		Dimension size = getPreferredSize();
		size.height = 100;
		size.width = 150;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("BGok"));
		GridBagConstraints gc = new GridBagConstraints();	

		//labels

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label("Uop > Uon      "), gc);
		
		gc.gridy = 0 ;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(u, gc);
		
		gc.gridy = 1;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label("Gop > Gon      "), gc);
		
		gc.gridy =1;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(g, gc);
		
		gc.gridy =2;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label("Bop > Bon      "), gc);
		
		gc.gridy =2;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(b, gc);
			
			
	}
}
