package projekt.projekt.panels.zz.fields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;

public class KcPanel extends JPanel{
	
	public static JTextField f1;
	public static JTextField f2;
	public static JTextField f3;
	public static JTextField f4;
	public static JTextField f5;
	public static JTextField f6;
	public static JTextField f7;
	
	public KcPanel(){
		Dimension size = getPreferredSize();
		size.height = 30;
		size.width = Utils.secRowWidth();
		setPreferredSize(size);
//		setBorder(BorderFactory.createTitledBorder(""));		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		setBackground(Utils.color());


		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		f1 = Utils.numberField("1.2");
		f1.setToolTipText("zalecana wartość: co najmniej 1,2");
		add(f1, gc);	
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		f2 = Utils.numberField("1.5");
		f2.setToolTipText("zalecana wartość: co najmniej 1,5");
		add(f2, gc);
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		f3 = Utils.numberField("1.5");
		f3.setToolTipText("zalecana wartość: co najmniej 1,5");
		add(f3, gc);
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		f4 = Utils.numberField("2");
		f4.setToolTipText("<html>zalecana wartość: <br/>dla sieci o p.n. uziemionym przez rezystor od 2,0 <br/> dla sieci skompensowanej i pozostałych od 1,2</html>");
		add(f4, gc);
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		f5 = Utils.numberField("1.5");
		f5.setToolTipText("<html>zalecana wartość: <br/>dla sieci o p.n. izolowanym od 2,0 <br/> dla sieci skompensowanej od 1,5</html>");
		add(f5, gc);
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		f6 = Utils.numberField("1.5");
		f6.setToolTipText("<html>zalecana wartość: <br/>dla sieci o p.n. izolowanym od 2,0 <br/> dla sieci skompensowanej od 1,5</html>");
		add(f6, gc);
		gc.anchor = Utils.fa();
		gc.weightx = Utils.fw();
		gc.gridx ++;
		gc.gridy = 0;
		f7 = Utils.numberField("1.2");
		f7.setToolTipText("zalecana wartość: co najmniej 1,2");
		add(f7, gc);
		
	}
}
