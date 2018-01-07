package projekt.projekt.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import projekt.projekt.Utils;
import projekt.projekt.panels.zz.IPanel;
import projekt.projekt.panels.zz.IcPanel;
import projekt.projekt.panels.zz.IcsPanel;
import projekt.projekt.panels.zz.IdlPanel;
import projekt.projekt.panels.zz.IrPanel;
import projekt.projekt.panels.zz.KbPanel;
import projekt.projekt.panels.zz.KcPanel;
import projekt.projekt.panels.zz.KpPanel;
import projekt.projekt.panels.zz.UPanel;
import projekt.projekt.panels.zz.YPanel;

public class ZzFieldPanel extends JPanel {
	
	private KbPanel kbPanel;
	private KcPanel	kcPanel;
	private IrPanel	irPanel;
	private IcsPanel icsPanel;
	private YPanel	yPanel;
	private UPanel	uPanel;
	private IcPanel	icPanel;
	private KpPanel	kpPanel;
	private IPanel	iPanel;
	private IdlPanel idlPanel;
	
	public ZzFieldPanel(){
	
		kbPanel = new KbPanel();
		kcPanel = new KcPanel();
		kpPanel = new KpPanel();
		yPanel = new YPanel();
		idlPanel = new IdlPanel();
		icsPanel = new IcsPanel();
		icPanel = new IcPanel();
		irPanel = new IrPanel();
		uPanel = new UPanel();
		iPanel = new IPanel();
		
		Dimension size = getPreferredSize();
		size.height = 310;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();	

		//kb
		gc.gridx = 0;
		gc.gridy ++;
		add(kbPanel, gc);
		//kc
		gc.gridx = 0;
		gc.gridy ++;
		add(kcPanel, gc);
		//ir
		gc.gridx = 0;
		gc.gridy ++;
		add(irPanel, gc);
		//ics
		gc.gridx = 0;
		gc.gridy ++;
		add(icsPanel, gc);
		//y
		gc.gridx = 0;
		gc.gridy ++;
		add(yPanel, gc);
		//u
		gc.gridx = 0;
		gc.gridy ++;
		add(uPanel, gc);
		//ic
		gc.gridx = 0;
		gc.gridy ++;
		add(icPanel, gc);
		//kp
		gc.gridx = 0;
		gc.gridy ++;
		add(kpPanel, gc);
		//i
		gc.gridx = 0;
		gc.gridy ++;
		add(iPanel, gc);
		//idl
		gc.gridx = 0;
		gc.gridy ++;
		add(idlPanel, gc);		
	}
}
