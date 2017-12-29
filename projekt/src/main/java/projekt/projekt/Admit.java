package projekt.projekt;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Admit extends JPanel {
		
	public Admit(){
		Dimension size = getPreferredSize();
		size.width = 300;
		size.height = 300;
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder("Zabezpieczenie nadprądowe bezzwłoczne"));
		
		JLabel przekladniaLabel = new JLabel("Przekładnia przekładnika prądowego: ");
		JLabel wspBezpLabel = new JLabel("Wsólczynnik bezpieczeństwa: ");
		
		String[] wspBezpList = { "1.3","1.4","1.5","1.6" };
		final JComboBox wspBezpCBox = new JComboBox(wspBezpList);
		final JTextField przekladniaField = new JTextField(4);
		JButton obliczButton = new JButton("Oblicz nastawę prądową");
		final JTextArea iRTextArea = new JTextArea("Prąd rozruchowy wynosi: ");
		
		obliczButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Double przekladnia = Double.parseDouble(przekladniaField.getText());
				Double wspBezp = Double.parseDouble((String) wspBezpCBox.getSelectedItem());
				
				double Ir = ((1.3) * ObliczeniaZwarciowe.iKbis)/przekladnia; 
				iRTextArea.append(String.valueOf(Ir));
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
		
		//TextArea Row//
		gc.gridx = 0;
		gc.gridy = 3;
		add(iRTextArea, gc);
	}
}
