package projekt.projekt.stare;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class ObliczeniaZwarciowe extends JPanel {

	public static double xZw;
	public static double iKbis;
	public static double iKmin;
	
	public ObliczeniaZwarciowe(){

		Dimension size = getPreferredSize();
		size.width = 700;
		size.height = 300;
		setPreferredSize(size);		
		setBorder(BorderFactory.createTitledBorder("Obliczenia zwarciowe"));
		
		JLabel mocZwSysLabel = new JLabel("Moc zwarciowa systemu:    ");
		JLabel napiecieZnSysLabel = new JLabel("Napięcie znamionowe systemu:    ");
		JLabel dlLiniiLabel = new JLabel("Długość zabezpieczanej linii:    ");
		JLabel rJednLabel = new JLabel("Rezystancja jednostkowa linii:    ");
		JLabel xJednLabel = new JLabel("Reaktancja jednostkowa linii:    ");
		
		final JTextField mocZwSysField = new JTextField(4);
		final JTextField napiecieZnSysField = new JTextField(4);
		final JTextField dlLiniiField = new JTextField(4);
		final JTextField rJednField = new JTextField(4);
		final JTextField xJednField = new JTextField(4);
		JButton iKbisButton = new JButton("Oblicz początkowy prąd zwarciowy");
		JButton iKminButton = new JButton("Oblicz minimalny prąd zwarciowy");
		
		final JLabel iKbisLabel = new JLabel("Ik'' = ");
		final JLabel iKminLabel = new JLabel("Ikmin = ");
		
		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);

		
		
		iKbisButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				Double mocZwSys = Utils.textFieldConvert(mocZwSysField) * Math.pow(10, 6);
				Double napiecieZnSys = Utils.textFieldConvert(napiecieZnSysField) * Math.pow(10, 3);
					
				xZw =  ((1.1)*napiecieZnSys*napiecieZnSys)/mocZwSys;
				iKbis = ((1.1)*napiecieZnSys)/(Math.sqrt(3) * xZw);
				
				iKbisLabel.setText("Ik'' = "+(df.format(iKbis/1000))+"[kA]");
				
			}
		});
		
		iKminButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				Double dlLinii = Utils.textFieldConvert(dlLiniiField);
				Double rJedn = Utils.textFieldConvert(rJednField);
				Double xJedn = Utils.textFieldConvert(xJednField);
				Double napiecieZnSys = Utils.textFieldConvert(napiecieZnSysField) * Math.pow(10, 3);
				 
				double rLinii = dlLinii*rJedn;
				double xLinii = dlLinii*xJedn;
				double zZw = Math.sqrt(Math.pow(rLinii, 2)+Math.pow((xLinii+xZw), 2));
				iKmin = (napiecieZnSys )/(2 * zZw);
				
				iKminLabel.setText("Ikmin = "+(df.format(iKmin/1000))+"[kA]");
				
			}
		});
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		//Labels//
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = Utils.la();
		add(mocZwSysLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(napiecieZnSysLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(dlLiniiLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(rJednLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(xJednLabel, gc);
		
		//Fields//
		gc.gridx = 1;
		gc.gridy = 0;		
		add(mocZwSysField, gc);
		gc.gridx = 1;
		gc.gridy ++;
		add(napiecieZnSysField, gc);
		gc.gridx = 1;
		gc.gridy ++;		
		add(dlLiniiField, gc);
		gc.gridx = 1;
		gc.gridy ++;
		add(rJednField, gc);
		gc.gridx = 1;
		gc.gridy ++;		
		add(xJednField, gc);
		
		// Jednostki
		gc.gridx = 2;
		gc.gridy = 0;		
		gc.anchor = Utils.sa();
		add(Utils.label("   [MVA]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [kV]"), gc);
		gc.gridx = 2;
		gc.gridy ++;		
		gc.anchor = Utils.sa();
		add(Utils.label("   [km]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [om/km]"), gc);
		gc.gridx = 2;
		gc.gridy ++;		
		gc.anchor = Utils.sa();
		add(Utils.label("   [om/km]"), gc);
		
		
//		//Button 
//		gc.gridx = 1;
//		gc.gridy = 0;
//		gc.weightx = 1;
//		gc.weighty = 4;
//		add(iKbisButton, gc);
//		gc.gridx = 1;
//		gc.gridy = 1;
//		gc.weightx = 1;
//		gc.weighty = 4;
//		add(iKminButton, gc);
	
		//Wyniki
//		gc.gridx = 1;
//		gc.gridy ++;
//		gc.weightx = 1;
//		gc.weighty = 4;
//		add(iKbisLabel, gc);
//		gc.gridx = 1;
//		gc.gridy ++;
//		gc.weightx = 1;
//		gc.weighty = 4;
//		add(iKminLabel, gc);
		
	}

}
