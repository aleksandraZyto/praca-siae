 package projekt.projekt.stare;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import projekt.projekt.Utils;

public class Bezzwl extends JPanel {
		
	public Bezzwl(){
		Dimension size = getPreferredSize();
		size.width = 600;
		size.height = 300;
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder("Zabezpieczenie nadprądowe bezzwłoczne"));
	
		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		
		JLabel przekladniaLabel = new JLabel("Przekładnia przekładnika prądowego [A/A]: ");
		JLabel wspBezpLabel = new JLabel("Wsólczynnik bezpieczeństwa [-]: ");
		
		String[] wspBezpList = { "1.3","1.4","1.5","1.6" };
		final JComboBox wspBezpCBox = new JComboBox(wspBezpList);
		final JTextField przekladniaField = new JTextField(3);
	
		JButton obliczButton = new JButton("Oblicz nastawę prądową");
		final JLabel iRLabel = new JLabel("Ir = ");
		
		obliczButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Double przekladnia = Utils.textFieldConvert(przekladniaField);
				Double wspBezp = Utils.cBoxConvert(wspBezpCBox);
				double iR = ((1.3) * ObliczeniaZwarciowe.iKbis)/przekladnia; 
				iRLabel.setText("Ir = "+df.format(iR)+" [A]");
			}
		});
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
				
		//Label Column//
		gc.gridx = 0;
		gc.gridy = 0;
		add(przekladniaLabel, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		add(wspBezpLabel, gc);
		
		//Field Column
		gc.gridx = 1;
		gc.gridy = 0 ;
		add(przekladniaField, gc);
		gc.gridx = 1;
		gc.gridy = 1;
		add(wspBezpCBox, gc);
		
		//Button Row//
		gc.gridx = 0;
		gc.gridy = 2;
		add(obliczButton, gc);
		
		//Wyniki//
		gc.gridx = 0;
		gc.gridy = 3;
		add(iRLabel, gc);
	}
	
}
