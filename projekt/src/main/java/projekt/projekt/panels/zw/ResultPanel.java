package projekt.projekt.panels.zw;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.obliczenia.Bm;

public class ResultPanel extends JPanel {

	public static JLabel iKbis = Utils.label("   =   ?                   ");
	public static JLabel iKmin = Utils.label("   =   ?                   ");
	public static JLabel xZw = Utils.label("   =   ?                   ");
	public static JLabel zZw = Utils.label("   =   ?                   ");
	public static JLabel iRBzzwl = Utils.label("   =   ?                   ");
	public static JLabel iRZwl = Utils.label("   =   ?                   ");
	
	public ResultPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 140;
		size.width = 280;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Obliczone nastawy i wielkości zwarciowe"));
		GridBagConstraints gc = new GridBagConstraints();	

		//labels

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(Utils.label("Ik''"), gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(Utils.label("Ikmin"), gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.la();
		add(Utils.label("Xk"), gc);
		gc.gridx = 0;
		gc.gridy++; 
		gc.anchor = Utils.la();
		add(Utils.label("Zk"), gc);
		gc.gridx = 0;
		gc.gridy++; 
		gc.anchor = Utils.la();
		add(Utils.label("Ir (bezzwł.)"), gc);
		gc.gridx = 0;
		gc.gridy++; 
		gc.anchor = Utils.la();
		add(Utils.label("Ir (zwł.)"), gc);

		//results
		gc.gridy = 0;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(iKbis, gc);
		gc.gridy ++;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(iKmin, gc);
		gc.gridy ++;
		gc.gridx = 1;
		gc.anchor = Utils.sa();
		add(xZw, gc);
		gc.gridx =  1;
		gc.gridy ++;
		gc.anchor =Utils.sa();
		add(zZw, gc);
		gc.gridx =  1;
		gc.gridy ++;
		gc.anchor =Utils.sa();
		add(iRBzzwl, gc);
		gc.gridx =  1;
		gc.gridy ++;
		gc.anchor =Utils.sa();
		add(iRZwl, gc);
	}
}
