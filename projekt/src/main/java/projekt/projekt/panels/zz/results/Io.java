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

public class Io extends JPanel {

	
	public static JLabel i = Utils.label("? < Iop < ?");

	
	public Io(){
	
		Dimension size = getPreferredSize();
		size.height = 100;
		size.width = 100;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Io>"));
		GridBagConstraints gc = new GridBagConstraints();	

		//labels

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label("Iop > Ion      "), gc);
		
		gc.gridy = 0;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(i, gc);
		
	
	}
}
