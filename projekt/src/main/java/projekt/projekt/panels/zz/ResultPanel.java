package projekt.projekt.panels.zz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projekt.projekt.Utils;
import projekt.projekt.panels.images.CharPanel;
import projekt.projekt.panels.zz.results.Bok;
import projekt.projekt.panels.zz.results.Go;
import projekt.projekt.panels.zz.results.Gok;
import projekt.projekt.panels.zz.results.Ib;
import projekt.projekt.panels.zz.results.Icz;
import projekt.projekt.panels.zz.results.Io;
import projekt.projekt.panels.zz.results.Yo;

public class ResultPanel extends JPanel {

	private Io io;
	private Icz iocz;
	private Ib iob;
	private Yo yo;
	private Go go;
	private Bok bok;
	private Gok gok;
	

	 private static  String iof = "src/icons/io.png";
	 private static  String gokf = "src/icons/gok.png";
	 private static  String iczf = "src/icons/czmoc.png";
	 private static  String ibf = "src/icons/bmoc.png"; 
	 private static  String yof = "src/icons/yo.png";
	 private static  String gof = "src/icons/go.png";
	 public static  String bof = "src/icons/bok.png";

	public static List<JTextField> pktRes = new ArrayList<JTextField>();
	public static JComboBox pktResCBox;
	
	public ResultPanel(){
	
		io = new Io();
		iocz = new Icz();
		iob = new Ib();
		yo = new Yo();
		go = new Go();
		bok = new Bok();
		gok = new Gok();
		
		pktResCBox = new JComboBox();
		
		
		Dimension size = getPreferredSize();
		size.height = 900;
		size.width = 350;
		setPreferredSize(size);	
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Obliczone nastawy"));
		GridBagConstraints gc = new GridBagConstraints();	

		if(HFPanel.pkt.getSelectedIndex() == 1){


			pktResCBox.removeAllItems();
			
			pktResCBox.addItem("Io >");
			pktResCBox.addItem("I -> b");
			pktResCBox.addItem("Yo >");
			pktResCBox.addItem("Bok");
			
			gc.gridy = 0;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(io, gc);
	
			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(iob, gc);
		
			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(yo, gc);
		
			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(bok, gc);

			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(Utils.label(" "), gc);
			
			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = GridBagConstraints.CENTER;
			add(pktResCBox, gc);
			
		}else if(HFPanel.pkt.getSelectedIndex() == 3 || HFPanel.pkt.getSelectedIndex() == 2){
			


			pktResCBox.removeAllItems();

			pktResCBox.addItem("Io >");
			pktResCBox.addItem("I -> cz");
			pktResCBox.addItem("Yo >");
			pktResCBox.addItem("Go >");
			pktResCBox.addItem("Gok");

			gc.gridy = 0;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(io, gc);

			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(iocz, gc);
			
			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(yo, gc);
		
			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(go, gc);
			

			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(gok, gc);

			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = Utils.sa();
			add(Utils.label(" "), gc);
			gc.gridy ++;
			gc.gridx = 0;
			gc.anchor = GridBagConstraints.CENTER;
			add(pktResCBox, gc);
			
		
		}else{


		pktResCBox.removeAllItems();
		pktResCBox.addItem("Io >");
		pktResCBox.addItem("I -> cz");
		pktResCBox.addItem("I -> b");
		pktResCBox.addItem("Yo >");
		pktResCBox.addItem("Go >");
		pktResCBox.addItem("Gok");
		pktResCBox.addItem("Bok");

		gc.gridy = 0;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(io, gc);

		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(iocz, gc);
		
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(iob, gc);
	
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(yo, gc);
	
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(go, gc);
		

		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(gok, gc);
		
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(bok, gc);

		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label(" "), gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(pktResCBox, gc);
		gc.gridy ++;
		gc.gridx = 0;
		gc.anchor = Utils.sa();
		add(Utils.label(" "), gc);
		
		}
		
		pktResCBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pktResCBox.getSelectedItem().equals("Yo >")) {
					CharPanel.l.setIcon(new ImageIcon(yof));
				}else if(pktResCBox.getSelectedItem().equals("Go >")){
					CharPanel.l.setIcon(new ImageIcon(gof));			
				}else if(pktResCBox.getSelectedItem().equals("Gok")){
					CharPanel.l.setIcon(new ImageIcon(gokf));			
				}else if(pktResCBox.getSelectedItem().equals("Bok")){
					CharPanel.l.setIcon(new ImageIcon(bof));			
				}else if(pktResCBox.getSelectedItem().equals("I -> cz")){
					CharPanel.l.setIcon(new ImageIcon(iczf));			
				}else if(pktResCBox.getSelectedItem().equals("I -> b")){
					CharPanel.l.setIcon(new ImageIcon(ibf));			
				}else if(pktResCBox.getSelectedItem().equals("Io >")){
					CharPanel.l.setIcon(new ImageIcon(iof));			
				}
			}
		});
		
			}
}
