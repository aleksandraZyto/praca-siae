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

public class Dane extends JPanel {
		
	public static JTextField kb;
	public static JTextField ks;
	public static JTextField kp;
	public static JTextField kr;
	public static JTextField kc;
	public static JTextField p;
	public static JTextField iMax;
	
	public Dane(){
		Dimension size = getPreferredSize();
		size.height = 200;
		size.width = 350;
		setPreferredSize(size);
		
		JLabel wspBezpLabel = new JLabel("Współczynnik bezpieczeństwa:   ");
		JLabel wspSamorozLabel = new JLabel("Współczynnik samorozruchu silników:    ");
		JLabel wspPowrLabel = new JLabel("Współczynnik powrotu:    ");
		JLabel wspSchemLabel = new JLabel("Współczynnik schematowy:    ");
		JLabel wspCzulLabel = new JLabel("Współczynnik czułości:    ");
		JLabel przekladniaLabel = new JLabel("Przekładnia przekładnika prądowego:    ");
		JLabel maksPrObcLabel = new JLabel("Maksymalny prąd obciążenia:    ");
		
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
		kb = Utils.numberField("1.3");
		add(kb, gc);	
		gc.gridx = 1;
		gc.gridy ++;
		kc = Utils.numberField("1.3");
		add(kc, gc);
		gc.gridx = 1;
		gc.gridy ++;
		kp = Utils.numberField("0.85");
		add(kp, gc);
		gc.gridx = 1;
		gc.gridy ++;
		ks = Utils.numberField("1");
		add(ks, gc);
		gc.gridx = 1;
		gc.gridy ++;
		kr = Utils.numberField("");
		add(kr, gc);
		gc.gridx = 1;
		gc.gridy ++;
		iMax = Utils.numberField("");
		add(iMax, gc);
		gc.gridx = 1;
		gc.gridy ++;
		p = Utils.numberField("");
		add(p, gc);
		
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
		
	}
}
