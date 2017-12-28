package projekt.projekt;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Zwl extends JPanel {
		
	public Zwl(){
		Dimension size = getPreferredSize();
		size.width = 400;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Zabezpieczenie nadprądowe zwłoczne"));
		
		JLabel mocZwSysLabel = new JLabel("Moc zwarciowa systemu [MVA]: ");
		JLabel napiecieZnSysLabel = new JLabel("Napięcie znamionowe systemu [kV]: ");
		
		final JTextField mocZwSysField = new JTextField(4);
		final JTextField napiecieZnSysField = new JTextField(4);
		
		JButton addButton = new JButton("Oblicz początkowy prąd zwarciowy");
		final JTextArea textArea = new JTextArea(10, 10);
		
		
		addButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
							
				double mocZwSys =(int)(Math.pow(10,6)) * Integer.parseInt(mocZwSysField.getText());
				double napiecieZnSys = (int)(Math.pow(10,3)) * Integer.parseInt(napiecieZnSysField.getText());
				double XZw = ((1.1)*napiecieZnSys*napiecieZnSys)/mocZwSys;
				double Ikbis = (((1.1)*napiecieZnSys)/(Math.PI * XZw))/1000;
				textArea.append("Reaktancja zwarciowa systemu: "+String.valueOf(XZw)+"[om]\nPoczątkowy prąd zwarciowy: "+Ikbis+"[kA]");
			}
		});
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		//First Column//
		gc.weightx = 1;
		gc.weighty = 1;
//		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 0;
		add(mocZwSysLabel, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		add(napiecieZnSysLabel, gc);
		
		//Second//
		gc.weightx = 1;
		gc.weighty = 1;
//		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(mocZwSysField, gc);
		gc.gridx = 1;
		gc.gridy = 1;
		add(napiecieZnSysField, gc);
	
		//Third row//
		gc.weightx = 2;
		gc.weighty = 1;
		gc.gridx = 0;
		gc.gridy = 2;
		add(addButton, gc);
		
		//TextArea//
		gc.weightx = 3;
		gc.gridx = 2;
		gc.gridy = 0;
		add(textArea, gc);
		
	}
	
}
