package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.results.BGok;
import projekt.projekt.panels.zz.results.Bok;
import projekt.projekt.panels.zz.results.Go;
import projekt.projekt.panels.zz.results.Gok;
import projekt.projekt.panels.zz.results.Ib;
import projekt.projekt.panels.zz.results.Icz;
import projekt.projekt.panels.zz.results.Io;
import projekt.projekt.panels.zz.results.YGo;
import projekt.projekt.panels.zz.results.Yo;

public class CharPanel extends JPanel {


	
	public CharPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 900;
		size.width = 200;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Charakterystyka nastawy"));
		GridBagConstraints gc = new GridBagConstraints();	

		
	
	}
}
