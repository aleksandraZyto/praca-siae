package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.obliczenia.Bm;

public class ResultPanel extends JPanel {

	public static JLabel i = Utils.label("   =   ?                   ");
	public static JLabel y = Utils.label("   =   ?                   ");
	public static JLabel g = Utils.label("   =   ?                   ");
	public static JLabel b = Utils.label("   =   ?                   ");
	public static JLabel d = Utils.label("   =   ?                   ");
	public static JLabel a = Utils.label("   =   ?                   ");
	public static JLabel s = Utils.label("   =   ?                   ");
	
	public ResultPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 140;
		size.width = 280;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Obliczone nastawy i współczynniki"));
		GridBagConstraints gc = new GridBagConstraints();	

		//labels

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(Utils.label("d"), gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(Utils.label("a"), gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(Utils.label("s"), gc);
		gc.gridx = 0;
		gc.gridy++; 
		gc.anchor = Utils.la();
		add(Utils.label("Io>"), gc);
		gc.gridx = 0;
		gc.gridy++;
		gc.anchor = Utils.la();
		add(Utils.label("Yo>"), gc);
		gc.gridx = 0;
		gc.gridy++;
		gc.anchor = Utils.la();
		add(Utils.label("Go> (Gok)"), gc);
		gc.gridx = 0;
		gc.gridy++;
		gc.anchor = Utils.la();
		add(Utils.label("Bok"), gc);
		
		//results
		gc.gridy = 0;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(d, gc);
		gc.gridy ++;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(a, gc);
		gc.gridy ++;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(s, gc);
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
