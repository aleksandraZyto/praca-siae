package projekt.projekt;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class NadprFrame extends JFrame{
	
	private Bezzwl bezzwl;
	private Zwl zwl;
	
	public NadprFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		bezzwl = new Bezzwl();
		zwl = new Zwl();
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(bezzwl, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(zwl, gc);
	}
}

