package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.Admit;
import projekt.projekt.panels.ZzPanel;

public class ZzFrame extends JFrame{
	private ZzPanel panel;
	
	public ZzFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		panel = new ZzPanel();
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(panel, gc);
	}
}
