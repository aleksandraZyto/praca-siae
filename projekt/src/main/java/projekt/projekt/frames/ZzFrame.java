package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.panels.HFPanel;
import projekt.projekt.panels.LabelsPanel;
import projekt.projekt.panels.ZzFieldPanel;

public class ZzFrame extends JFrame{
	
	private ZzFieldPanel panel;
	private LabelsPanel lpanel;
	private HFPanel hfPanel;
	
	public ZzFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		panel = new ZzFieldPanel();
		lpanel = new LabelsPanel();
		hfPanel = new HFPanel();
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(hfPanel, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(lpanel, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(panel, gc);
	}
}
