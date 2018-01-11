package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import projekt.projekt.panels.zz.CharPanel;
import projekt.projekt.panels.zz.ResultPanel;

public class ZzResultFrame extends JFrame{
	
	private CharPanel ch;
	private ResultPanel panel;

	public ZzResultFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		panel = new ResultPanel();
		ch = new CharPanel();
		
		gc.anchor = GridBagConstraints.WEST;
		gc.gridx = 0;
		gc.gridy = 0;
		add(panel, gc);


		gc.anchor = GridBagConstraints.EAST;
		gc.gridx = 1;
		gc.gridy = 0;
//		add(ch, gc);
}
}
