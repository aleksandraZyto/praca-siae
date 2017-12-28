package projekt.projekt;

import java.awt.BorderLayout;
import java.awt.Container;
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
		
		setLayout(new BorderLayout());
		
		oblZw = new ObliczeniaZwarciowe();
		bezzwl = new Bezzwl();
		zwl = new Zwl();
		kier = new Kier();
		admit = new Admit();
				
		Container c = getContentPane();
		c.add(oblZw, BorderLayout.NORTH);
		c.add(zwl, BorderLayout.CENTER);
		c.add(bezzwl, BorderLayout.WEST);
		c.add(kier, BorderLayout.EAST);
		c.add(admit, BorderLayout.SOUTH);		
	}
}
