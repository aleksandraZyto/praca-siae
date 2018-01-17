package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.panels.zz.HFPanel;
import projekt.projekt.panels.zz.LabelsPanel;
import projekt.projekt.panels.zz.ResultPanel;
import projekt.projekt.panels.zz.TitlePanel;
import projekt.projekt.panels.zz.UnitPanel;
import projekt.projekt.panels.zz.UwagaPanel;
import projekt.projekt.panels.zz.WspResultPanel;
import projekt.projekt.panels.zz.ZzFieldPanel;
import projekt.projekt.panels.zz.obliczenia.ButtonPanel;

public class ZzFrame extends JFrame{
	
	private ZzFieldPanel panel;
	private LabelsPanel lpanel;
	private HFPanel hfPanel;
	private TitlePanel titlePanel;
	private UnitPanel unitPanel;
	private WspResultPanel wspResultPanel;
	private ButtonPanel buttonPanel;
	private ResultPanel rPanel;
	private UwagaPanel uwaga;
	
	public ZzFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		uwaga = new UwagaPanel();
		panel = new ZzFieldPanel();
		lpanel = new LabelsPanel();
		hfPanel = new HFPanel();
		titlePanel = new TitlePanel();
		unitPanel = new UnitPanel();
		wspResultPanel = new WspResultPanel();
		buttonPanel = new ButtonPanel();
		rPanel = new ResultPanel();
		
		
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(hfPanel, gc);
	
		gc.gridx = 1;
		gc.gridy = 3;
		add(buttonPanel, gc);
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(uwaga, gc);	
		
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
