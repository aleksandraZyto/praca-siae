package projekt.projekt.panels.zw;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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

import projekt.projekt.Utils;

public class ZwlPanel extends JPanel {
		
	public ZwlPanel(){
		Dimension size = getPreferredSize();
		size.height = 200;
		size.width = 350;
		setPreferredSize(size);
		
//		setBorder(BorderFactory.createTitledBorder("Zabezpieczenie nadprądowe zwłoczne"));
//		
		JLabel wspBezpLabel = new JLabel("Współczynnik bezpieczeństwa:   ");
		JLabel wspSamorozLabel = new JLabel("Współczynnik samorozruchu silników:    ");
		JLabel wspPowrLabel = new JLabel("Współczynnik powrotu:    ");
		JLabel wspSchemLabel = new JLabel("Współczynnik schematowy:    ");
		JLabel wspCzulLabel = new JLabel("Współczynnik czułości:    ");
		JLabel przekladniaLabel = new JLabel("Przekładnia przekładnika prądowego:    ");
		JLabel maksPrObcLabel = new JLabel("Maksymalny prąd obciążenia:    ");
		
		String[] wspBezpList = { "1.3","1.4","1.5","1.6" };
		final JComboBox wspBezpCBox = new JComboBox(wspBezpList);
		final JTextField wspSamorozField = new JTextField(4);
		String[] wspPowrList = { "0.85","0.9","0.95"};
		final JComboBox wspPowrCBox = new JComboBox(wspPowrList);
		String[] wspSchemList = { "1","1.732" };
		final JComboBox wspSchemCBox = new JComboBox(wspSchemList);
		String[] wspCzulList = { "1.5","1.3" };
		final JComboBox wspCzulCBox = new JComboBox(wspCzulList);
		final JTextField przekladniaField = new JTextField(4);
		final JTextField maksPrObcField = new JTextField(4);
		JButton obliczButton = new JButton("Oblicz nastawę prądową");

		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);

		final JLabel iRLabel = new JLabel("Ir = ");

		obliczButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Double wspBezp = Utils.cBoxConvert(wspBezpCBox);
				Double wspPowr = Utils.cBoxConvert(wspPowrCBox);
				Double wspSchem = Utils.cBoxConvert(wspSchemCBox);
				Double wspCzul = Utils.cBoxConvert(wspCzulCBox);
				Double wspSamoroz = Utils.textFieldConvert(wspSamorozField);
				Double przekladnia = Utils.textFieldConvert(przekladniaField);
				Double maksPrObc = Utils.textFieldConvert(maksPrObcField);
				
				double iRmin = (wspBezp*wspSamoroz*wspSchem*maksPrObc)/(wspPowr*przekladnia);
				double iRmax = (wspSchem*OblZwPanel.iKmin)/(przekladnia*wspCzul);
				
				iRLabel.setText(df.format(iRmin)+" [A] <= Ir <= "+df.format(iRmax)+" [A]");
			}
		});
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		//Label Column//
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = Utils.la();
		add(wspBezpLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(wspCzulLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(wspPowrLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(wspSchemLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(wspSamorozLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(maksPrObcLabel, gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.anchor = Utils.la();
		add(przekladniaLabel, gc);
				
		//Field Column	
		gc.gridx = 1;
		gc.gridy = 0;
		add(Utils.numberField("1.3"), gc);	
		gc.gridx = 1;
		gc.gridy ++;
		add(Utils.numberField("1.3"), gc);
		gc.gridx = 1;
		gc.gridy ++;
		add(Utils.numberField("0.85"), gc);
		gc.gridx = 1;
		gc.gridy ++;
		add(Utils.numberField("1"), gc);
		gc.gridx = 1;
		gc.gridy ++;
		add(Utils.numberField(""), gc);
		gc.gridx = 1;
		gc.gridy ++;
		add(Utils.numberField(""), gc);
		gc.gridx = 1;
		gc.gridy ++;
		add(Utils.numberField(""), gc);
		
		//Jednostki
		gc.gridx = 2;
		gc.gridy = 0;
		gc.anchor = Utils.sa();
		add(Utils.label("   [-]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [-]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [-]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [-]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [-]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [A]"), gc);
		gc.gridx = 2;
		gc.gridy ++;
		gc.anchor = Utils.sa();
		add(Utils.label("   [A/A]"), gc);
		
		
//		//Button Row/
//		gc.gridx = 0;
//		gc.gridy = 7;
//		add(obliczButton, gc);
//		
//		//Wyniki Row//
//		gc.gridx = 0;
//		gc.gridy = 8;
//		add(iRLabel, gc);
//				
	}
	
}
