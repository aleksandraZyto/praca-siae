package projekt.projekt.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class HFPanel extends JPanel {
	
	public static List<JTextField> tfList = new ArrayList<JTextField>();
	public HFPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 70;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	

		gc.gridx = 0;
		gc.gridy = 1;
		add(Utils.label("  "),gc);
		gc.gridx = 1;
		gc.gridy = 1;
		add(Utils.label(""),gc);
		gc.gridx = 0;
		gc.gridy = 0;
		add(Utils.label("Rodzaj filtra składowej zerowej:   "), gc);
		gc.gridx = 1;
		gc.gridy = 0;
		add(Utils.label("   Przekładnia prądowa:   "), gc);
		gc.gridx = 1;
		gc.gridy = 2;
		add(Utils.numberField(""), gc);
		
				final JComboBox hfCBox = new JComboBox();
				hfCBox.addItem("-");
				hfCBox.addItem("Holmgreen");
				hfCBox.addItem("Ferranti");
				gc.gridx = 0;
				gc.gridy = 2;
				add(hfCBox, gc);
				
				hfCBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(hfCBox.getSelectedIndex() == 1){
							for (int i = 0; i < tfList.size()-1; i++) {
								tfList.get(i).setText("2");
							}
							tfList.get(tfList.size()-1).setText("50");
						}else if(hfCBox.getSelectedIndex() == 2){
							for (int i = 0; i < tfList.size()-1; i++) {
								tfList.get(i).setText("0,75");
							}
							tfList.get(tfList.size()-1 ).setText("20");
						}else{
							for (int i = 0; i < tfList.size(); i++) {
								tfList.get(i).setText("");
							}
						}		
					}
				});
	}
}
