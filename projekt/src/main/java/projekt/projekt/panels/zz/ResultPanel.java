package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.results.BGok;
import projekt.projekt.panels.zz.results.Bok;
import projekt.projekt.panels.zz.results.Go;
import projekt.projekt.panels.zz.results.Gok;
import projekt.projekt.panels.zz.results.Ib;
import projekt.projekt.panels.zz.results.Icz;
import projekt.projekt.panels.zz.results.Io;
import projekt.projekt.panels.zz.results.YGo;
import projekt.projekt.panels.zz.results.Yo;

public class ResultPanel extends JPanel {

	private Io io;
	private Icz iocz;
	private Ib iob;
	private Yo yo;
	private Go go;
	private Bok bok;
	private Gok gok;
	private BGok bgok;
	private YGo ygo;
	
	public ResultPanel(){
	
		io = new Io();
		iocz = new Icz();
		iob = new Ib();
		yo = new Yo();
		go = new Go();
		bok = new Bok();
		gok = new Gok();
		bgok = new BGok();
		ygo = new YGo();
		JButton button = new JButton("Pokaż charakterystykę");
		
		Dimension size = getPreferredSize();
		size.height = 900;
		size.width = 350;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Obliczone nastawy"));
		GridBagConstraints gc = new GridBagConstraints();	

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(io, gc);

		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.PAGE_START;
		add(iocz, gc);
		
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(iob, gc);
	
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.LINE_START;
		add(yo, gc);
	
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.CENTER;
		add(go, gc);
		
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.LINE_END;
		add(bok, gc);
		
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.LAST_LINE_START;
		add(gok, gc);
		
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.PAGE_END;
		add(gok, gc);
		
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
//		gc.anchor = GridBagConstraints.LAST_LINE_END;
		add(bgok, gc);

		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(ygo, gc);
		
	///////////////////////////////////
			}
}
