package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.panels.HFPanel;
import projekt.projekt.panels.LabelsPanel;
import projekt.projekt.panels.TitlePanel;
import projekt.projekt.panels.UnitPanel;
import projekt.projekt.panels.ZzFieldPanel;

public class ZzFrame extends JFrame{
	
	private ZzFieldPanel panel;
	private LabelsPanel lpanel;
	private HFPanel hfPanel;
	private TitlePanel titlePanel;
	private UnitPanel unitPanel;
	
	public ZzFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		panel = new ZzFieldPanel();
		lpanel = new LabelsPanel();
		hfPanel = new HFPanel();
		titlePanel = new TitlePanel();
		unitPanel = new UnitPanel();
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(hfPanel, gc);
		
		gc.gridx = 2;
		gc.gridy = 2;
		add(unitPanel, gc);
		gc.gridx =1 ;
		gc.gridy = 1;
		add(titlePanel, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(lpanel, gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		add(panel, gc);
	}
}
