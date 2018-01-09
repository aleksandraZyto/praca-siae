package projekt.projekt.panels.zw;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class DaneZwPanel extends JPanel {

	public static JTextField mocZwSysField;
	public static JTextField napiecieZnSysField;
	public static JTextField dlLiniiField;
	public static JTextField rJednField;
	public static JTextField xJednField;
	
	
	public DaneZwPanel(){

		Dimension size = getPreferredSize();
		size.width = 350;
		size.height = 200;
		setPreferredSize(size);		
		setBorder(BorderFactory.createTitledBorder("Obliczenia zwarciowe"));
		
		JLabel mocZwSysLabel = new JLabel("Moc zwarciowa systemu:    ");
		JLabel napiecieZnSysLabel = new JLabel("Napięcie znamionowe systemu:    ");
		JLabel dlLiniiLabel = new JLabel("Długość zabezpieczanej linii:    ");
		JLabel rJednLabel = new JLabel("Rezystancja jednostkowa linii:    ");
		JLabel xJednLabel = new JLabel("Reaktancja jednostkowa linii:    ");
		
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
		mocZwSysField = Utils.numberField("");
		add(mocZwSysField, gc);
		gc.gridx = 1;
		gc.gridy ++;
		napiecieZnSysField = Utils.numberField("");
		add(napiecieZnSysField, gc);
		gc.gridx = 1;
		gc.gridy ++;		
		dlLiniiField = Utils.numberField("");
		add(dlLiniiField, gc);
		gc.gridx = 1;
		gc.gridy ++;
		rJednField = Utils.numberField("");
		add(rJednField, gc);
		gc.gridx = 1;
		gc.gridy ++;		
		xJednField = Utils.numberField("");
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
		add(Utils.label("   [om/km]       "), gc);
		
}

}
