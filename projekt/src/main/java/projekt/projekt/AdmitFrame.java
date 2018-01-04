package projekt.projekt;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class AdmitFrame extends JFrame{
	
	private Admit admit;
	
	public AdmitFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		admit = new Admit();
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(admit, gc);
	} 
}
