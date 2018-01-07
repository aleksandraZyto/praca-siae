package projekt.projekt.stare;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DecimalFormat;

import javax.swing.JFrame;

import projekt.projekt.panels.WindowChoice;

public class Mframe extends JFrame {
	
	private ObliczeniaZwarciowe oblZw;
	private WindowChoice windowChoice;
	
	public Mframe(String title){
		super(title);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		oblZw = new ObliczeniaZwarciowe();
		windowChoice = new WindowChoice();
		
		//Obliczenia zwarciowe
		gc.gridx = 0;
		gc.gridy = 0;
//		gc.anchor = GridBagConstraints.NORTH;
		gc.fill = GridBagConstraints.VERTICAL;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.gridheight = 1;
		gc.gridwidth = 1;
		add(oblZw, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
//		gc.anchor = GridBagConstraints.SOUTH;
		gc.fill = GridBagConstraints.VERTICAL;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weighty = 0.5;
		gc.weightx = 1;
		gc.gridheight = 1;
		gc.gridwidth = 1;
		add(windowChoice, gc);
	}
}
