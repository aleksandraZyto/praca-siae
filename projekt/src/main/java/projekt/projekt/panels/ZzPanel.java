package projekt.projekt.panels;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class ZzPanel extends JPanel {
	
	public ZzPanel(){
		
		Dimension size = getPreferredSize();
		size.height = 600;
		size.width =900;
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder("Zabezpieczenie ziemnozwarciowe"));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		
		
		//Labels
		gc.gridx = 0;
		gc.gridy = 1;
		add(Utils.label("Przekładnia filtra składowej zerowej prądu [A/A]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Współczynnik bezpieczeństwa [-]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Współczynnik czułości [-]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Znamionowy prąd czynny rezystora [A]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Prąd pojemnościowy sieci [A]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Admitancja uchybowa [mS]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Maksymalne napięcie po stronie wtórnej filtra składowej zerowej [V]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Prąd pojemnościowy zabezpieczanej linii"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Współczynnik powrotu [-]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Prąd uchybowy w obwodach filtru składowej zerowej prądu [A]"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Prąd dławika [A]"), gc);
		
		//przekladniaFields
		final List<JTextField> fields = new ArrayList<JTextField>();
		
		for(int i=0; i<=4; i++ ){
			final JTextField field = Utils.field();
			fields .add(field);
			gc.gridx ++;
			gc.gridy = 1;
			add(field, gc);
			field.addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) {
				}
				public void keyReleased(KeyEvent e) {	
					for (int i = 0; i < fields.size(); i++) {
						fields.get(i).setText(field.getText());
					}
				}
				public void keyTyped(KeyEvent e) {			
				}
			});
		}
	}
}
