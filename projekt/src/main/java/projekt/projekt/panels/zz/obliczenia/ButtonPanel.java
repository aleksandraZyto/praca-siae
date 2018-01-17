package projekt.projekt.panels.zz.obliczenia;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.frames.ZzResultFrame;
import projekt.projekt.panels.zz.HFPanel;
import projekt.projekt.panels.zz.WspResultPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.UnastPanel;
import projekt.projekt.panels.zz.results.Bok;
import projekt.projekt.panels.zz.results.Go;
import projekt.projekt.panels.zz.results.Gok;
import projekt.projekt.panels.zz.results.Ib;
import projekt.projekt.panels.zz.results.Icz;
import projekt.projekt.panels.zz.results.Io;
import projekt.projekt.panels.zz.results.Yo;

public class ButtonPanel extends JPanel {

	public JButton b;
	public ButtonPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 70;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(Utils.label(" "), gc);
		
		gc.gridx = 0;
		gc.gridy ++;
		b = new JButton("Oblicz nastawy");
		b.setMargin(new Insets(13,15,13,15));
		add(b, gc);
		
		final DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		
		b.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {

				WspResultPanel.d.setText("d    =   "+df.format(Bm.wspd()));
				WspResultPanel.a.setText("a    =   "+df.format(Bm.a()));
				WspResultPanel.s.setText("s    =   "+df.format(Bm.s()));
				
				if(HFPanel.pkt.getSelectedIndex() ==1){
					if (I.iMin() > I.iMax()) {
						Io.i.setText("Dobranie nastway nie powiodło się");
					}else{
						Io.i.setText(df.format(1000*I.iMin())+" [mA] < Ion < "+df.format(1000*I.iMax())+" [mA]");
					}	
					
					if (Iob.ioMin() > Iob.iMax()) {
						Ib.i.setText("Dobranie nastway nie powiodło się");
					}else{
						Ib.i.setText(df.format(Iob.ioMin())+" [A] < Ion < "+df.format(Iob.iMax())+" [A]");
					}
					
					if (Y.yMin() > Y.yMax()) {
						Yo.y.setText("Dobranie nastway nie powiodło się");
					}else{
						Yo.y.setText(df.format((1000*Y.yMin()))+" [mS] < Yon < "+df.format(1000*Y.yMax())+" [mS]");
					}
					
					
					Ib.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					Yo.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");				
					Bok.b.setText(df.format(G.gMin())+" [mS] < Bon");
					Bok.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					
				
				}else if(HFPanel.pkt.getSelectedIndex() ==2 || HFPanel.pkt.getSelectedIndex() ==3){
					
					if (I.iMin() > I.iMax()) {
						Io.i.setText("Dobranie nastway nie powiodło się");
					}else{
						Io.i.setText(df.format(1000*I.iMin())+" [mA] < Ion < "+df.format(1000*I.iMax())+" [mA]");
					}
					if (Iocz.ioMin() > Iocz.iMax()) {
						Icz.i.setText("Dobranie nastway nie powiodło się");
					}else{
						Icz.i.setText(df.format(Iocz.ioMin())+" [A] < Ion < "+df.format(Iocz.iMax())+" [A]");
					}
					if (G.gMin() > G.gMax()) {
						Go.g.setText("Dobranie nastway nie powiodło się");
					}else{
						Go.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
					}
					if (Y.yMin() > Y.yMax()) {
						Yo.y.setText("Dobranie nastway nie powiodło się");
					}else{
						Yo.y.setText(df.format((1000*Y.yMin()))+" [mS] < Yon < "+df.format(1000*Y.yMax())+" [mS]");
					}
					if (G.gMin() > G.gMax()) {
						Gok.g.setText("Dobranie nastway nie powiodło się");
					}else{
						Gok.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
					}
					
					Icz.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");			
					Yo.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					Go.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					Gok.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					
				}else{
					if (I.iMin() > I.iMax()) {
						Io.i.setText("Dobranie nastway nie powiodło się");
					}else{
						Io.i.setText(df.format(1000*I.iMin())+" [mA] < Ion < "+df.format(1000*I.iMax())+" [mA]");
					}
					if (Iocz.ioMin() > Iocz.iMax()) {
						Icz.i.setText("Dobranie nastway nie powiodło się");
					}else{
						Icz.i.setText(df.format(Iocz.ioMin())+" [A] < Ion < "+df.format(Iocz.iMax())+" [A]");
					}
					if (Iob.ioMin() > Iob.iMax()) {
						Ib.i.setText("Dobranie nastway nie powiodło się");
					}else{
						Ib.i.setText(df.format(Iob.ioMin())+" [A] < Ion < "+df.format(Iob.iMax())+" [A]");
					}
					if (Y.yMin() > Y.yMax()) {
						Yo.y.setText("Dobranie nastway nie powiodło się");
					}else{
						Yo.y.setText(df.format((1000*Y.yMin()))+" [mS] < Yon < "+df.format(1000*Y.yMax())+" [mS]");
					}
					if (G.gMin() > G.gMax()) {
						Gok.g.setText("Dobranie nastway nie powiodło się");
					}else{
						Go.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
					}
					if (G.gMin() > G.gMax()) {
						Gok.g.setText("Dobranie nastway nie powiodło się");
					}else{
						Gok.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
					}
							
							
					
					Icz.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					
					
					Ib.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					

					Yo.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");

					
					Go.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					
					Bok.b.setText(df.format(G.gMin())+" [mS] < Bon");
					Bok.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					
					
					Gok.u.setText("Uon = "+df.format(Bm.d(UnastPanel.f1))+" [V]");
					
				}
				
				
					try {
						Utils.frameSetting(new ZzResultFrame("Zabezpieczenia ziemnozwarciowe"), 800, 500);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
		}
		});
	}
}
