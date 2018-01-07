package projekt.projekt.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.IPanel;
import projekt.projekt.panels.zz.IcPanel;
import projekt.projekt.panels.zz.IcsPanel;
import projekt.projekt.panels.zz.IdlPanel;
import projekt.projekt.panels.zz.IrPanel;
import projekt.projekt.panels.zz.KbPanel;
import projekt.projekt.panels.zz.KcPanel;
import projekt.projekt.panels.zz.KpPanel;
import projekt.projekt.panels.zz.UPanel;
import projekt.projekt.panels.zz.YPanel;

public class TitlePanel extends JPanel {
	
	public TitlePanel(){
		
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		setBackground(Utils.color2());
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(Utils.label("    Io >                  "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("Yo >                  "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("Bok >            "), gc);
		gc.gridx ++;
		gc.gridy = 0;
		add(Utils.label("Go> (Gok >)"), gc);
	}
}
