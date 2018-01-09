package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.Utils;
import projekt.projekt.panels.zw.ButtonPanel;
import projekt.projekt.panels.zw.DaneZwPanel;
import projekt.projekt.panels.zw.ResultPanel;
import projekt.projekt.panels.zw.Dane;

public class ZwarFrame extends JFrame{
	
	private DaneZwPanel oblZw;
	private Dane zwlPanel;
	private ResultPanel results;
	private ButtonPanel button;
	
	public ZwarFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		oblZw = new DaneZwPanel();
		zwlPanel = new Dane();
		results = new ResultPanel();
		button = new ButtonPanel();
		
		gc.fill = GridBagConstraints.VERTICAL;
		gc.gridx = 0;
		gc.gridy = 0;
		add(oblZw, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(button, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(zwlPanel, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = Utils.la();
		add(results, gc);
	}
}
