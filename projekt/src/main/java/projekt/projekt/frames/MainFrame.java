package projekt.projekt.frames;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import projekt.projekt.panels.WindowChoice;

public class MainFrame extends JFrame{
	
	private WindowChoice windowChoice;
	
	public MainFrame(String title){
		super(title);
		
		FlowLayout l = new FlowLayout();
		setLayout(l);
		
		
		windowChoice = new WindowChoice();
		add(windowChoice, l);
	}
}
