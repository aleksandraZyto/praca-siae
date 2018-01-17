package projekt.projekt.panels.zz;

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
import projekt.projekt.panels.zz.fields.IPanel;
import projekt.projekt.panels.zz.fields.IcPanel;
import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.IdlPanel;
import projekt.projekt.panels.zz.fields.IrPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.UnastPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class HFPanel extends JPanel {
	
	public static List<JTextField> tfList = new ArrayList<JTextField>();
	public static JTextField field;
	public static List<JTextField> pktN = new ArrayList<JTextField>();
	public static JComboBox pkt;
	
	public HFPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 105;
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
		gc.gridy = 4;
		gc.anchor = Utils.la();
		add(Utils.label("Sposób pracy punktu neutralnego:     "),gc);
		gc.gridx = 0;
		gc.gridy = 3;
		add(Utils.label("  "),gc);
		gc.gridx = 1;
		gc.gridy = 3;
		add(Utils.label(""),gc);
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = Utils.la();
		add(Utils.label("Rodzaj filtra składowej zerowej:     "), gc);
		gc.gridx = 0;
		gc.gridy = 2;
		gc.anchor = Utils.la();
		add(Utils.label("Przekładnia prądowa:     "), gc);
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = Utils.sa();
		field = Utils.numberField("");
		add(field, gc);
		
		
		pkt = new JComboBox();
		pkt.addItem("-");
		pkt.addItem("izolowany");
		pkt.addItem("uziemiony \nprzez rezystor");
		pkt.addItem("sieć kompensowana z AWSCz");

		gc.anchor = Utils.sa();
		gc.gridx = 1;
		gc.gridy = 4;
		add(pkt, gc);
		
		pkt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
							
				if(pkt.getSelectedIndex() == 1){		
					IdlPanel.f1.setEnabled(!Utils.disabled());
					IdlPanel.f2.setEnabled(!Utils.disabled());
					UnastPanel.f2.setEnabled(!Utils.disabled());
					UnastPanel.f6.setEnabled(!Utils.disabled());
					KbPanel.f3.setEnabled(!Utils.disabled());
					KbPanel.f7.setEnabled(!Utils.disabled());
					KcPanel.f3.setEnabled(!Utils.disabled());
					KcPanel.f7.setEnabled(!Utils.disabled());
					IcPanel.f2.setEnabled(!Utils.disabled());
					IcPanel.f4.setEnabled(!Utils.disabled());
					IcsPanel.f2.setEnabled(!Utils.disabled());
					IcsPanel.f6.setEnabled(!Utils.disabled());
					YPanel.f2.setEnabled(!Utils.disabled());
					YPanel.f6.setEnabled(!Utils.disabled());
					UPanel.f2.setEnabled(!Utils.disabled());
					UPanel.f6.setEnabled(!Utils.disabled());
					IPanel.field2.setEnabled(!Utils.disabled());
					
					KbPanel.f2.setEnabled(Utils.disabled());
					KbPanel.f6.setEnabled(Utils.disabled());
					KbPanel.f5.setEnabled(Utils.disabled());
					KcPanel.f2.setEnabled(Utils.disabled());
					KcPanel.f6.setEnabled(Utils.disabled());
					KcPanel.f5.setEnabled(Utils.disabled());
					IcsPanel.f4.setEnabled(Utils.disabled());
					IcsPanel.f5.setEnabled(Utils.disabled());
					IcsPanel.f1.setEnabled(Utils.disabled());
					IrPanel.f1.setEnabled(Utils.disabled());
					IrPanel.f4.setEnabled(Utils.disabled());
					IrPanel.f3.setEnabled(Utils.disabled());
					YPanel.f1.setEnabled(Utils.disabled());
					YPanel.f4.setEnabled(Utils.disabled());
					YPanel.f5.setEnabled(Utils.disabled());
					UPanel.f1.setEnabled(Utils.disabled());
					UPanel.f4.setEnabled(Utils.disabled());
					UPanel.f5.setEnabled(Utils.disabled());
					UnastPanel.f1.setEnabled(Utils.disabled());
					UnastPanel.f4.setEnabled(Utils.disabled());
					UnastPanel.f5.setEnabled(Utils.disabled());
					IrPanel.f2.setText("0");
					IrPanel.f2.setEnabled(Utils.disabled());
					IrPanel.f0.setText("0");
					IrPanel.f0.setEnabled(Utils.disabled());
					IdlPanel.f1.setText("0");
					IdlPanel.f1.setEnabled(Utils.disabled());
					IdlPanel.f2.setText("0");
					IdlPanel.f2.setEnabled(Utils.disabled());
					
					
				}else if(pkt.getSelectedIndex() == 2 || pkt.getSelectedIndex() == 3){
					KbPanel.f2.setEnabled(!Utils.disabled());
					KbPanel.f6.setEnabled(!Utils.disabled());
					KbPanel.f5.setEnabled(!Utils.disabled());
					KcPanel.f2.setEnabled(!Utils.disabled());
					KcPanel.f6.setEnabled(!Utils.disabled());
					KcPanel.f5.setEnabled(!Utils.disabled());
					IcsPanel.f4.setEnabled(!Utils.disabled());
					IcsPanel.f5.setEnabled(!Utils.disabled());
					IcsPanel.f1.setEnabled(!Utils.disabled());
					IrPanel.f1.setEnabled(!Utils.disabled());
					IrPanel.f4.setEnabled(!Utils.disabled());
					IrPanel.f3.setEnabled(!Utils.disabled());
					YPanel.f1.setEnabled(!Utils.disabled());
					YPanel.f4.setEnabled(!Utils.disabled());
					YPanel.f5.setEnabled(!Utils.disabled());
					UPanel.f1.setEnabled(!Utils.disabled());
					UPanel.f4.setEnabled(!Utils.disabled());
					UPanel.f5.setEnabled(!Utils.disabled());
					UnastPanel.f1.setEnabled(!Utils.disabled());
					UnastPanel.f4.setEnabled(!Utils.disabled());
					UnastPanel.f5.setEnabled(!Utils.disabled());
					IrPanel.f2.setText("");
					IrPanel.f2.setEnabled(!Utils.disabled());
					IrPanel.f0.setText("");
					IrPanel.f0.setEnabled(!Utils.disabled());
					IdlPanel.f1.setText("");
					IdlPanel.f1.setEnabled(!Utils.disabled());
					IdlPanel.f2.setText("");
					IdlPanel.f2.setEnabled(!Utils.disabled());
					
					UnastPanel.f2.setEnabled(Utils.disabled());
					UnastPanel.f6.setEnabled(Utils.disabled());
					KbPanel.f3.setEnabled(Utils.disabled());
					KbPanel.f7.setEnabled(Utils.disabled());
					KcPanel.f3.setEnabled(Utils.disabled());
					KcPanel.f7.setEnabled(Utils.disabled());
					IcPanel.f2.setEnabled(Utils.disabled());
					IcPanel.f4.setEnabled(Utils.disabled());
					IcsPanel.f2.setEnabled(Utils.disabled());
					IcsPanel.f6.setEnabled(Utils.disabled());
					YPanel.f2.setEnabled(Utils.disabled());
					YPanel.f6.setEnabled(Utils.disabled());
					UPanel.f2.setEnabled(Utils.disabled());
					UPanel.f6.setEnabled(Utils.disabled());
					IPanel.field2.setEnabled(Utils.disabled());
				}else{
					IdlPanel.f1.setEnabled(!Utils.disabled());
					IdlPanel.f2.setEnabled(!Utils.disabled());
					KbPanel.f2.setEnabled(!Utils.disabled());
					KbPanel.f6.setEnabled(!Utils.disabled());
					KbPanel.f5.setEnabled(!Utils.disabled());
					KcPanel.f2.setEnabled(!Utils.disabled());
					KcPanel.f6.setEnabled(!Utils.disabled());
					KcPanel.f5.setEnabled(!Utils.disabled());
					IcsPanel.f4.setEnabled(!Utils.disabled());
					IcsPanel.f5.setEnabled(!Utils.disabled());
					IcsPanel.f1.setEnabled(!Utils.disabled());
					IrPanel.f1.setEnabled(!Utils.disabled());
					IrPanel.f4.setEnabled(!Utils.disabled());
					IrPanel.f3.setEnabled(!Utils.disabled());
					YPanel.f1.setEnabled(!Utils.disabled());
					YPanel.f4.setEnabled(!Utils.disabled());
					YPanel.f5.setEnabled(!Utils.disabled());
					UPanel.f1.setEnabled(!Utils.disabled());
					UPanel.f4.setEnabled(!Utils.disabled());
					UPanel.f5.setEnabled(!Utils.disabled());
					UnastPanel.f1.setEnabled(!Utils.disabled());
					UnastPanel.f4.setEnabled(!Utils.disabled());
					UnastPanel.f5.setEnabled(!Utils.disabled());
					IrPanel.f2.setText("20");
					IrPanel.f2.setEnabled(!Utils.disabled());
					IrPanel.f0.setText("20");
					IrPanel.f0.setEnabled(!Utils.disabled());
					IdlPanel.f1.setText("");
					IdlPanel.f1.setEnabled(!Utils.disabled());
					IdlPanel.f2.setText("");
					IdlPanel.f2.setEnabled(!Utils.disabled());
					
					UnastPanel.f2.setEnabled(!Utils.disabled());
					UnastPanel.f6.setEnabled(!Utils.disabled());
					KbPanel.f3.setEnabled(!Utils.disabled());
					KbPanel.f7.setEnabled(!Utils.disabled());
					KcPanel.f3.setEnabled(!Utils.disabled());
					KcPanel.f7.setEnabled(!Utils.disabled());
					IcPanel.f2.setEnabled(!Utils.disabled());
					IcPanel.f4.setEnabled(!Utils.disabled());
					IcsPanel.f2.setEnabled(!Utils.disabled());
					IcsPanel.f6.setEnabled(!Utils.disabled());
					YPanel.f2.setEnabled(!Utils.disabled());
					YPanel.f6.setEnabled(!Utils.disabled());
					UPanel.f2.setEnabled(!Utils.disabled());
					UPanel.f6.setEnabled(!Utils.disabled());
					IPanel.field2.setEnabled(!Utils.disabled());
				}
				
								
				if(pkt.getSelectedIndex() ==2){

					IdlPanel.f2.setText("0");
					IdlPanel.f2.setEnabled(Utils.disabled());

					IdlPanel.f1.setText("0");
					IdlPanel.f1.setEnabled(Utils.disabled());

					}
					
					if(pkt.getSelectedIndex() ==3){

						IdlPanel.f2.setText("");
						IdlPanel.f2.setEnabled(!Utils.disabled());

						IdlPanel.f1.setText("");
						IdlPanel.f1.setEnabled(!Utils.disabled());

						}
			}
		});
		
		
				final JComboBox hfCBox = new JComboBox();
				hfCBox.addItem("-");
				hfCBox.addItem("Holmgreen");
				hfCBox.addItem("Ferranti");
				gc.anchor = Utils.sa();
				gc.gridx = 1;
				gc.gridy = 0;
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
								tfList.get(i).setText("0.75");
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
