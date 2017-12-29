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

	public static double xZw;
	public static double iKbis;
	public static double iKmin;
	
	public ObliczeniaZwarciowe(){

		Dimension size = getPreferredSize();
		size.width = 300;
		size.height = 300;
		setPreferredSize(size);		
		setBorder(BorderFactory.createTitledBorder("Obliczenia zwarciowe"));
		
		JLabel mocZwSysLabel = new JLabel("Moc zwarciowa systemu [MVA]: ");
		JLabel napiecieZnSysLabel = new JLabel("Napięcie znamionowe systemu [kV]: ");
		JLabel dlLiniiLabel = new JLabel("Długość zabezpieczanej linii: ");
		JLabel rJednLabel = new JLabel("Rezystancja jednostkowa linii: ");
		JLabel xJednLabel = new JLabel("Reaktancja jednostkowa linii: ");
		
		final JTextField mocZwSysField = new JTextField(4);
		final JTextField napiecieZnSysField = new JTextField(4);
		final JTextField dlLiniiField = new JTextField(4);
		final JTextField rJednField = new JTextField(4);
		final JTextField xJednField = new JTextField(4);
		JButton iKbisButton = new JButton("Oblicz początkowy prąd zwarciowy");
		JButton iKminButton = new JButton("Oblicz minimalny prąd zwarciowy");
		
		final JTextArea iKbisTextArea = new JTextArea("Początkowy prąd zwarciowy: ");
		final JTextArea iKminTextArea = new JTextArea("Minimamlny prąd zwarciowy na końcu linii: ");
		final JTextArea xZwTextArea = new JTextArea("Reaktancja zwarciowa systemu: ");
		final JTextArea zZwTextArea = new JTextArea("Impedancja zwarciowa na końcu linii: ");

		iKbisButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				Double mocZwSys = Double.parseDouble(mocZwSysField.getText()) * Math.pow(10, 6);
				Double napiecieZnSys = Double.parseDouble(napiecieZnSysField.getText()) * Math.pow(10, 3);
					
				xZw =  ((1.1)*napiecieZnSys*napiecieZnSys)/mocZwSys;
				iKbis = ((1.1)*napiecieZnSys)/(Math.sqrt(3) * xZw);
				
				xZwTextArea.append(String.valueOf(xZw));
				iKbisTextArea.append(String.valueOf(iKbis));
			}
		});
		
		iKminButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				Double dlLinii = Double.parseDouble(dlLiniiField.getText());
				Double rJedn = Double.parseDouble(rJednField.getText());
				Double xJedn = Double.parseDouble(xJednField.getText());
				Double napiecieZnSys = Double.parseDouble(napiecieZnSysField.getText()) * Math.pow(10, 3);
				
				double rLinii = dlLinii*rJedn;
				double xLinii = dlLinii*xJedn;
				double zZw = Math.sqrt(Math.pow(rLinii, 2)+Math.pow((xLinii+xZw), 2));
				iKmin = ((1.1) * napiecieZnSys )/(2 * zZw);
				
				zZwTextArea.append(String.valueOf(zZw));
				iKminTextArea.append(String.valueOf(iKmin));
				
			}
		});
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		//Labels//
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 4;
		gc.weighty = 2;
		gc.anchor = GridBagConstraints.SOUTH;
		add(mocZwSysLabel, gc);
		gc.gridx = 0;
		gc.gridy = 2;
		gc.weightx = 4;
		gc.weighty = 2;
		gc.anchor = GridBagConstraints.SOUTH;
		add(napiecieZnSysLabel, gc);
		gc.gridx = 0;
		gc.gridy = 4;
		gc.weightx = 4;
		gc.weighty = 2;
		gc.anchor = GridBagConstraints.SOUTH;
		add(dlLiniiLabel, gc);
		gc.gridx = 0;
		gc.gridy = 6;
		gc.weightx = 4;
		gc.weighty = 2;
		gc.anchor = GridBagConstraints.SOUTH;
		add(rJednLabel, gc);
		gc.gridx = 0;
		gc.gridy = 8;
		gc.weightx = 4;
		gc.weighty = 2;
		gc.anchor = GridBagConstraints.SOUTH;
		add(xJednLabel, gc);
		
		//Fields//
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.NORTH;		
		add(mocZwSysField, gc);
		gc.gridx = 0;
		gc.gridy = 3;
		gc.anchor = GridBagConstraints.NORTH;
		gc.weightx = 1;
		gc.weighty = 1;
		add(napiecieZnSysField, gc);
		gc.gridx = 0;
		gc.gridy = 5;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.NORTH;		
		add(dlLiniiField, gc);
		gc.gridx = 0;
		gc.gridy = 7;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.NORTH;		
		add(rJednField, gc);
		gc.gridx = 0;
		gc.gridy = 9;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.anchor = GridBagConstraints.NORTH;		
		add(xJednField, gc);
	}

}
