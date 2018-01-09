package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.panels.zw.OblZwPanel;
import projekt.projekt.panels.zw.ZwlPanel;

public class ZwarFrame extends JFrame{
	
	private OblZwPanel oblZw;
	private ZwlPanel zwlPanel;
	
	public ZwarFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		oblZw = new OblZwPanel();
		zwlPanel = new ZwlPanel();
		
		gc.fill = GridBagConstraints.VERTICAL;
		gc.gridx = 0;
		gc.gridy = 0;
		add(oblZw, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		add(zwlPanel, gc);
	}
}
