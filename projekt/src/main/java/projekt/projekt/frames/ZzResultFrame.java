package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JFrame;

import projekt.projekt.panels.images.CharPanel;
import projekt.projekt.panels.zz.ResultPanel;

public class ZzResultFrame extends JFrame{
	
	private ResultPanel panel;
	private CharPanel imgIo;

	public ZzResultFrame(String title) throws IOException{
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		panel = new ResultPanel();
		imgIo = new CharPanel();
		
		gc.anchor = GridBagConstraints.WEST;
		gc.fill = GridBagConstraints.VERTICAL;
		gc.gridx = 0;
		gc.gridy = 0;
		add(panel, gc);


		gc.anchor = GridBagConstraints.EAST;
		gc.gridx = 1;
		gc.gridy = 0;
		add(imgIo, gc);
}
}
