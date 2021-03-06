package projekt.projekt.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import projekt.projekt.Utils;
import projekt.projekt.frames.PrzecFrame;
import projekt.projekt.frames.ZwarFrame;
import projekt.projekt.frames.ZzFrame;

public class WindowChoice extends JPanel{
	
	public WindowChoice(){
		Dimension size = getPreferredSize();
		size.height = 350;
		size.width = 450;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Wybór rodzaju zabezpieczeń"));
	
		JButton przecButton = new JButton("Zabezpieczenie przeciążeniowe");
		JButton zwarButton = new JButton("Zabezpieczenie zwarciowe");
		JButton zzButton = new JButton("Zabezpieczenie ziemnozwarciowe");
		
		Utils.compSettings(przecButton, 15, 300	, 150);
		Utils.compSettings(zwarButton, 15, 300, 150);
		Utils.compSettings(zzButton, 15, 300, 150);
		
		przecButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Utils.frameSetting(new PrzecFrame(), 500, 500);
			}
		});
				
		zwarButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new ZwarFrame("Zabezpieczenia zwarciowe");
				Utils.frameSetting(frame, 1300, 500);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});

		zzButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new ZzFrame("Zabezpieczenia ziemnozwarciowe");
				Utils.frameSetting(frame, 1000, 600);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});

		FlowLayout l = new FlowLayout();
		setLayout(l);
		
		l.setHgap(30);
	
//		add(przecButton, l);
		add(zwarButton, l);
		add(zzButton, l);

	}
}
