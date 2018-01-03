package projekt.projekt;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DecimalFormat;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private ObliczeniaZwarciowe oblZw;
	private Bezzwl bezzwl;
	private Admit admit;

	private Zwl zwl;
	
	public MainFrame(String title){
		super(title);
		

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		oblZw = new ObliczeniaZwarciowe();
		bezzwl = new Bezzwl();
		zwl = new Zwl();
		admit = new Admit();
		
		//Obliczenia zwarciowe
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridheight = 3;
		gc.weighty = 3;
		gc.fill = GridBagConstraints.VERTICAL;
		add(oblZw, gc);
	
		//Bezzwl
		gc.gridx = 1;
		gc.gridy = 0;
		gc.gridheight = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.VERTICAL;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.anchor = GridBagConstraints.NORTH;
		add(bezzwl, gc);
		
		//Zwl
		gc.gridx = 1;
		gc.gridy = 1;
		gc.gridheight = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.VERTICAL;
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(zwl, gc);
		
		//Admit
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridheight = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.VERTICAL;
		add(admit, gc);
	}
}
