package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.panels.zz.ZzFieldPanel;
import projekt.projekt.stare.ObliczeniaZwarciowe;

public class ZwarFrame extends JFrame{
	
	private ObliczeniaZwarciowe oblZw;
	
	public ZwarFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		oblZw = new ObliczeniaZwarciowe();
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(oblZw, gc);

	}
}
