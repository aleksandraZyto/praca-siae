package projekt.projekt.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import projekt.projekt.Utils;

public class UnitPanel extends JPanel {
	
	public UnitPanel(){
	
		Dimension size = getPreferredSize();
		size.height = Utils.columnHeight();
		size.width = 50;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	

		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[-]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[-]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[A]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[A]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[mS]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[V]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[A]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[-]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[mA]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.sa();
		add(Utils.label("[A]"), gc);
	}
}
