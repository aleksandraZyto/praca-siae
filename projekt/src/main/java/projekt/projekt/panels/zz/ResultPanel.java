package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.obliczenia.I;

public class ResultPanel extends JPanel {

	public static JLabel i  = Utils.label("");
	public static JLabel y= Utils.label("");
	public static JLabel g= Utils.label("");
	public static JLabel b= Utils.label("");
	
	public ResultPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 200;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Obliczone nastawy i współczynniki"));
		GridBagConstraints gc = new GridBagConstraints();	

		//labels

		gc.gridy = 0;
		gc.gridx =  0;
		add(Utils.label(""), gc);
		gc.gridx = 0;
		gc.gridy++; 
		gc.anchor = Utils.sa();
		add(Utils.label("Io>"), gc);
		gc.gridx = 0;
		gc.gridy++;
		gc.anchor = Utils.sa();
		add(Utils.label("Yo>"), gc);
		gc.gridx = 0;
		gc.gridy++;
		gc.anchor = Utils.sa();
		add(Utils.label("Go> (Gok)"), gc);
		gc.gridx = 0;
		gc.gridy++;
		gc.anchor = Utils.sa();
		add(Utils.label("Bok"), gc);
		
		//results
		gc.gridy = 0;
		gc.gridx =  1;
		add(Utils.label(""), gc);
		gc.gridx = 1;
		gc.gridy++; 
		gc.anchor = Utils.sa();
		add(i, gc);
		gc.gridx = 1;
		gc.gridy++;
		gc.anchor = Utils.sa();
		add(y, gc);
		gc.gridx = 1;
		gc.gridy++;
		gc.anchor = Utils.sa();
		add(g, gc);
		gc.gridx = 1;
		gc.gridy++;
		gc.anchor = Utils.sa();
		add(b, gc);
	}
}
