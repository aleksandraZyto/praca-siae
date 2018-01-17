package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UwagaPanel extends JPanel{

	
	public static JLabel uwaga;
	
	public UwagaPanel(){
		Dimension size = getPreferredSize();
		size.height = 105;
		size.width = 415;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		JLabel label = new JLabel("W celu obliczenia nastaw ");
		label.setFont (label.getFont ().deriveFont (16.0f));
		JLabel label1 = new JLabel("należy uzupełnić wszytskie ");
		label1.setFont (label1.getFont ().deriveFont (16.0f));
		JLabel label3 = new JLabel("wymagane pola!");
		label3.setFont (label3.getFont ().deriveFont (16.0f));
		uwaga = new JLabel("");
		
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(label, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		add(label1, gc);
		gc.gridx = 0;
		gc.gridy = 2;
		add(label3, gc);
		gc.gridx = 0;
		gc.gridy = 3;
		add(uwaga, gc);
	}
}
