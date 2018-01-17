package projekt.projekt;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import projekt.projekt.panels.zz.ZzFieldPanel;

public class Utils {
	
	public static boolean isFieldEmpty(){
		boolean flag = true;
		
		for (int i = 0; i < ZzFieldPanel.pola.size(); i++) {
			if (ZzFieldPanel.pola.get(i).getText().isEmpty()){
				flag = true;
			}else{
				flag =  false;
			}
		}
		return flag;
	}
	
	public static int secRowWidth(){
		return 500;
	}
	
	public static int columnHeight(){
		return 330;
	}
	
	public static int fa(){
		int c = GridBagConstraints.CENTER;
		return c;
	}
	
	public static double fw(){
		double c = 0.2;
		return c;
	}
	
	public static int la(){
		int c = GridBagConstraints.EAST;
		return c;
	}
	
	public static double lw(){
		return 1;
	}
	
	public static int sa(){
		int c = GridBagConstraints.WEST;
		return c;
	}
	
	public static void compSettings(JComponent comp, int fontSize, int width, int height){
		comp.setPreferredSize(new Dimension(width, height));
		comp.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	}
	
	public static double textFieldConvert(JTextField textField){	
		return Double.parseDouble(textField.getText().replaceAll(",", "."));
	}

	public static double cBoxConvert(JComboBox cBox){	
		return Double.parseDouble((String) cBox.getSelectedItem());
	}
	

	public static void frameSetting(JFrame frame, int width, int height) {
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public static JLabel label(String name){
		return new JLabel(name);
	}
	
	public static JTextField numberField(String number){
		JTextField field = new JTextField();
		field.setText(number);
		field.setColumns(4);
		return field;
		
	}
	
	public static JTextField hfField(List<JTextField> tfList){
		JTextField tf = new JTextField(4);
		tfList.add(tf);
		return tf;
	}
		
	public static void zzInputFields(final JTextField field, final List<JTextField> fieldList){
		
		fieldList.add(field);
		field.addKeyListener(new KeyListener() {
			
			public void keyPressed(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {	
				fieldList.add(field);
				for (int i = 0; i < fieldList.size(); i++) {
					fieldList.get(i).setText(field.getText());
				}
			}
			public void keyTyped(KeyEvent e) {			
			}
		});
	}

	public static int ipady() {
		return 14;
	}

	public static Color color() {
		return Color.GRAY;
	}

	public static Color color2() {
		return Color.LIGHT_GRAY;
	}

	public static boolean disabled() {
		
		return false;
	}
	
}
