package projekt.projekt;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class MainFrame extends JFrame {
	
	private ObliczeniaZwarciowe oblZw;
	private Bezzwl bezzwl;
	private Admit admit;
	private Kier kier;
	private Zwl zwl;
		
	public MainFrame(String title){
		super(title);
		
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		oblZw = new ObliczeniaZwarciowe();
		bezzwl = new Bezzwl();
		zwl = new Zwl();
		kier = new Kier();
		admit = new Admit();
			
		//Obliczenia zwarciowe
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridheight = 2;
		gc.weighty = 2;
		gc.weightx = 1;
		gc.fill = GridBagConstraints.VERTICAL;
		add(oblZw, gc);
		
		//Bezzwl
		gc.gridx = 1;
		gc.gridy = 0;
		gc.gridheight = 1;
		gc.weightx = 2;
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(bezzwl, gc);
		
		//Zwl
		gc.gridx = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridy = 1;
		gc.gridheight = 1;
		gc.weightx = 3;
		add(zwl, gc);
		
		//Kier
		gc.gridx = 1;
		gc.gridy = 2;
		add(kier, gc);
		
		//Admit
		gc.gridx = 1;
		gc.gridy = 3;
		
		add(admit, gc);
		
	}
}
