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

public class ObliczeniaZwarciowe extends JPanel {

	public static double XZw;
	public static double Ikbis;
	
	public ObliczeniaZwarciowe(){

		Dimension size = getPreferredSize();
		size.height = 150;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Obliczenia zwarciowe"));
		
		JLabel mocZwSysLabel = new JLabel("Moc zwarciowa systemu [MVA]: ");
		JLabel napiecieZnSysLabel = new JLabel("Napięcie znamionowe systemu [kV]: ");
		
		final JTextField mocZwSysField = new JTextField(4);
		final JTextField napiecieZnSysField = new JTextField(4);
		
		JButton obliczButton = new JButton("Oblicz początkowy prąd zwarciowy");
		final JLabel wynikXZwLabel = new JLabel();
		final JLabel wynikIkbisLabel = new JLabel();
		
		
		obliczButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
							

				Double mocZwSys = Double.parseDouble(mocZwSysField.getText()) * Math.pow(10, 6);
				Double napiecieZnSys = Double.parseDouble(napiecieZnSysField.getText()) * Math.pow(10, 3);
				XZw =  ((1.1)*napiecieZnSys*napiecieZnSys)/mocZwSys;
				Ikbis = ((1.1)*napiecieZnSys)/(Math.PI * XZw);
				wynikXZwLabel.setText("Reaktancja zwarciowa systemu: "+String.valueOf(XZw)+"[om]");
				wynikIkbisLabel.setText("Początkowy prąd zwarciowy: "+String.valueOf(Ikbis/1000)+"[kA]");
			}
		});
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		//Label Column//
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 0;
		add(mocZwSysLabel, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		add(napiecieZnSysLabel, gc);
		
		//Field Column//
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(mocZwSysField, gc);
		gc.gridx = 1;
		gc.gridy = 1;
		add(napiecieZnSysField, gc);
	
		//Button row//
		gc.weightx = 2;
		gc.weighty = 1;
		gc.gridx = 0;
		gc.gridy = 2;
		add(obliczButton, gc);
		
		//TextArea//
		gc.gridx = 2;
		gc.gridy = 0;
		add(wynikXZwLabel, gc);

		//TextAreaa//
		gc.gridx = 2;
		gc.gridy = 1;
		add(wynikIkbisLabel, gc);
	}

}
