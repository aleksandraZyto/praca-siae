package projekt.projekt.panels.zw;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projekt.projekt.panels.zz.ResultPanel;


public class CharPanelZw extends JPanel{
	
	public static GridBagConstraints gc = new GridBagConstraints();
	 
	 
	public static JLabel l = new JLabel();
	 
	public CharPanelZw() throws IOException {
		super();
		setLayout(new GridBagLayout());
		
	    l.setIcon(new ImageIcon("src/icons/bez.png"));
		gc.gridx = 0;
		gc.gridy = 0;
		add(l, gc);		

	}
}
