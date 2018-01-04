package projekt.projekt;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Admit extends JPanel {
		
	public Admit(){
		Dimension size = getPreferredSize();
		size.height = 600;
		size.width = 600;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Zabezpieczenie ziemnozwarciowe admitancyjne"));
		
		JLabel prUchybLabel = new JLabel("<html><div style='text-align: center;'>Maksymalny prąd uchybowy<br/> filtra składowej zerowej prądu [mS]</div></html>: ", SwingConstants.CENTER);
		JLabel uZerLabel = new JLabel("<html><div style='text-align: center;'>Minimalne napięcie składowej <br/>zerowej sieci [V]</div></html>: ", SwingConstants.CENTER);
		JLabel cLiniiLabel = new JLabel("Pojemność doziemionej linii [uF]: ");
		JLabel rodzLiniiLabel = new JLabel("Rodzaj linii: ");
		JLabel przekladniaLabel = new JLabel("Przekładnia przekładnika prądowego [A/A]: ");
		
				
		String[] rodzLiniiList = { "napowietrzna","kablowa"};
		final JComboBox rodzLiniiCBox = new JComboBox(rodzLiniiList);
		final JTextField przekladniaField = new JTextField(4);
		final JTextField prUchybField = new JTextField(4);
		final JTextField cLiniiField = new JTextField(4);
		final JTextField uZerField = new JTextField(4);
		JButton obliczButton = new JButton("Oblicz nastawę");

		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);

		final JLabel yRLabel = new JLabel("Yr = ");

		obliczButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Double wspBezp = (String.valueOf(rodzLiniiCBox.getSelectedItem()).equals("napowietrzna"))?(1.2):(1.05);
	
				Double przekl = Utils.textFieldConvert(przekladniaField);
				Double prUchyb = Utils.textFieldConvert(prUchybField);
				Double cLinii = Utils.textFieldConvert(cLiniiField);
				Double uZer = Utils.textFieldConvert(uZerField);
				
				double yMi = (przekl*prUchyb)/(uZer);
				double yR = wspBezp*(2*Math.PI*50*(cLinii/Math.pow(10, 6))+yMi);
			
				yRLabel.setText("Yr = "+df.format(yR)+" [mS]");
			}
		});
				
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		//Label Column//
		gc.gridx = 0;
		gc.gridy = 0;
		add(rodzLiniiLabel, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		add(przekladniaLabel, gc);
		gc.gridx = 0;
		gc.gridy = 2;
		add(prUchybLabel, gc);
		gc.gridx = 0;
		gc.gridy = 3;
		add(cLiniiLabel, gc);
		gc.gridx = 0;
		gc.gridy = 4;
		add(uZerLabel, gc);
		
		//Field Column	
		gc.gridx = 1;
		gc.gridy = 0;
		add(rodzLiniiCBox, gc);
		gc.gridx = 1;
		gc.gridy = 1;
		add(przekladniaField, gc);
		gc.gridx = 1;
		gc.gridy = 2;
		add(prUchybField, gc);
		gc.gridx = 1;
		gc.gridy = 3;
		add(cLiniiField, gc);
		gc.gridx = 1;
		gc.gridy = 4;
		add(uZerField, gc);
		
		//Button Row/
		gc.gridx = 0;
		gc.gridy = 7;
		add(obliczButton, gc);
		
		//Wyniki Row//
		gc.gridx = 0;
		gc.gridy = 8;
		add(yRLabel, gc);
	}
}
