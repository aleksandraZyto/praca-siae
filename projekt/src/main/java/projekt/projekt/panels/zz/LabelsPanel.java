package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import projekt.projekt.Utils;

public class LabelsPanel extends JPanel {
	
	public LabelsPanel(){
	
		Dimension size = getPreferredSize();
		size.height = Utils.columnHeight();
		size.width = 415;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	

		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Współczynnik bezpieczeństwa:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Współczynnik czułości:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Prąd czynny w punkcie neutralnym sieci podczas zwarcia metalicznego:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Pojemnościowy prąd zwarcia doziemnego sieci:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Admitancja uchybowa:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Maksymalna wartość składowej zerowej napięcia:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Pojemnościowy prąd zwarcia doziemnego linii:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Współczynnik powrotu:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Prąd uchybowy w obwodach filtru składowej zerowej prądu:"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Składowa bierna prądu dławika kompensującego:"), gc);
	}
}
