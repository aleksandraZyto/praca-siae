package projekt.projekt.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JFrame;

import projekt.projekt.Utils;
import projekt.projekt.panels.zw.ButtonPanel;
import projekt.projekt.panels.zw.CharPanelZw;
import projekt.projekt.panels.zw.CharWyb;
import projekt.projekt.panels.zw.Dane;
import projekt.projekt.panels.zw.DaneZwPanel;
import projekt.projekt.panels.zw.ResultPanel;

public class ZwarFrame extends JFrame{
	
	private DaneZwPanel oblZw;
	private Dane zwlPanel;
	private ResultPanel results;
	private ButtonPanel button;
	private CharPanelZw charN;
	private CharWyb charwyb;
	public ZwarFrame(String title){
		super(title);
	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		oblZw = new DaneZwPanel();
		zwlPanel = new Dane();
		results = new ResultPanel();
		button = new ButtonPanel();
		charwyb = new CharWyb();
		
		try {
			charN = new CharPanelZw();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		
		gc.gridx = 2;
		gc.gridy = 0;
		add(charN, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.CENTER;
		add(charwyb, gc);
		
		
	}
}
