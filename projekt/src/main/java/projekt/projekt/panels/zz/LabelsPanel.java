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
		add(Utils.label("Nastawa zeronapięciowa człony rozruchowego (U 0nast)"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Współczynnik bezpieczeństwa (kb):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Współczynnik powrotu (kp):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Współczynnik czułości (kc):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Pojemnościowy prąd zwarcia doziemnego zabezpieczanej linii (I cl):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Pojemnościowy prąd zwarcia doziemnego sieci (Ics):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Nastawiony prąd dławika kompensującego (Idl):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Znamionowy prąd czynny rezystora w punkcie neutralnym (Ir):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Admitancja uchybowa (Y mi):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Prąd uchybowy (I mi):"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		gc.ipady = Utils.ipady();
		gc.anchor = Utils.la();
		add(Utils.label("Maksymalna wartrość napięcia po str. wtórnej filtra (U 0max):"), gc);
	
	}
}
