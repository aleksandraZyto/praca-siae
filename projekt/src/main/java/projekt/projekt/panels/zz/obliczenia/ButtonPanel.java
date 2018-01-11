package projekt.projekt.panels.zz.obliczenia;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.frames.ZzResultFrame;
import projekt.projekt.panels.zz.WspResultPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.UnastPanel;
import projekt.projekt.panels.zz.results.BGok;
import projekt.projekt.panels.zz.results.Bok;
import projekt.projekt.panels.zz.results.Go;
import projekt.projekt.panels.zz.results.Gok;
import projekt.projekt.panels.zz.results.Ib;
import projekt.projekt.panels.zz.results.Icz;
import projekt.projekt.panels.zz.results.Io;
import projekt.projekt.panels.zz.results.YGo;
import projekt.projekt.panels.zz.results.Yo;

public class ButtonPanel extends JPanel {

	public JButton b;
	public ButtonPanel(){
	
		Dimension size = getPreferredSize();
		size.height = 50;
		size.width = Utils.wpppzz();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	
		
		gc.gridx = 0;
		gc.gridy = 0;
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
				
				Io.i.setText(df.format(I.iMin())+" [A] < Ion < "+df.format(I.iMax())+" [A]");
				Icz.i.setText(df.format(Iocz.ioMin())+" [A] < Ion < "+df.format(Iocz.iMax())+" [A]");
				Icz.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				Ib.i.setText(df.format(Iob.ioMin())+" [A] < Ion < "+df.format(Iob.iMax())+" [A]");
				Ib.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				Yo.y.setText(df.format(Y.yMin())+" [mS] < Yon < "+df.format(Y.yMax())+" [mS]");
				Yo.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				Go.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
				Go.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				Bok.b.setText(df.format(G.gMin())+" [mS] < Bon");
				Bok.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				Gok.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
				Gok.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				BGok.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
				BGok.b.setText(df.format(B.bMin())+" [mS] < Bon");
				BGok.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				YGo.g.setText(df.format(G.gMin())+" [mS] < Gon < "+df.format(G.gMax())+" [mS]");
				YGo.y.setText(df.format(Y.yMin())+" [mS] < Bon < "+df.format(Y.yMax())+" [mS]");
				YGo.u.setText(df.format(Bm.d(UnastPanel.field))+" [V] < Uon");
				Utils.frameSetting(new ZzResultFrame("Zabezpieczenia ziemnozwarciowe"), 400, 600);
		}
		});
	}
}
