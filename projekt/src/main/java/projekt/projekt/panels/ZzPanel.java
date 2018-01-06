package projekt.projekt.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
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
		gc.gridy = 0;
		add(Utils.label("Filtr składowej zerowej"), gc);
		gc.gridx = 0;
		gc.gridy ++;
		add(Utils.label("Rodzaj zabezpieczenia"), gc);
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
				
		// Holm Ferr 
		final List<JTextField> tfList = new ArrayList<JTextField>();
		
		final JComboBox hfCBox = new JComboBox();
		hfCBox.addItem("-");
		hfCBox.addItem("Holmgreen");
		hfCBox.addItem("Ferranti");
		gc.gridx = 3;
		gc.gridy = 0;
		add(hfCBox, gc);
		
		hfCBox.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
//				if(hfCBox.){
//					for (int i = 0; i < tfList.size(); i++) {
//						tfList.get(i).setText("2");
//					}
//				}else if(hfCBox.getSelectedIndex() == 2){
//					for (int i = 0; i < tfList.size(); i++) {
//						tfList.get(i).setText("0,75");
//					}
//				}
			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		//wspBezp
		final List<JTextField> wspBezpFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=0; i++ ){
			gc.gridx = 4;
			gc.gridy = 2;
			final JTextField field = Utils.field();
			add(field, gc);
			
			Utils.zzInputFields(field, wspBezpFields);
		}
		
		//wspCzul
			final List<JTextField> wspCzulFields = new ArrayList<JTextField>();
				
			for(int i=0; i<=0; i++ ){
				gc.gridx = 4;
				gc.gridy = 3;
				final JTextField field = Utils.field();
				add(field, gc);
					Utils.zzInputFields(field, wspCzulFields);
				}

		//prąd pojemnościowy sieci	
		final List<JTextField> prPojSieciFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=2; i++ ){
			gc.gridx = i+2;
			gc.gridy = 5;
			final JTextField field = Utils.field();
			add(field, gc);
						
			Utils.zzInputFields(field, prPojSieciFields);
		}
		
		
		//admit
		final List<JTextField> admitUchybFields = new ArrayList<JTextField>();
		
		for(int i=0; i<3; i++ ){
			gc.gridx = 3+i;
			gc.gridy = 6;
			final JTextField field = Utils.field();
			add(field, gc);
			
			Utils.zzInputFields(field, admitUchybFields);
		}
				
		//pr poj linii
		final List<JTextField> prPojLiniiFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=2; i++ ){
			gc.gridx = i+2;
			gc.gridy = 8;
			final JTextField field = Utils.field();
			add(field, gc);
			
			Utils.zzInputFields(field, prPojLiniiFields);
		}
		
		
		//prDlawika
		final List<JTextField> prDlFields = new ArrayList<JTextField>();
		
		for(int i=0; i<=0; i++ ){
			gc.gridx = i+3;
			gc.gridy = 11;
			final JTextField field = Utils.field();
			add(field, gc);
			
			Utils.zzInputFields(field, prDlFields);
		}
		
	}
}
