package projekt.projekt;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Utils {
	private static NumberFormat amountFormat;
	
	public static int wpppzz(){
		return 500;
	}
	
	public static int secRowWidth(){
		return 600;
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
		double c = 1;
		return c;
	}
	
	public static int sa(){
		int c = GridBagConstraints.EAST;
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
	
	public static Component label(String name){
		return new JLabel(name);
	}
	
	public static JFormattedTextField numberField(String value){
		amountFormat = NumberFormat.getNumberInstance();
		JFormattedTextField field = new JFormattedTextField(amountFormat);
		if(value.equals("")){
			field.setText(value);
		}else{
			field.setValue(Double.parseDouble(value));
		}
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
		return Color.LIGHT_GRAY;
	}
	
}
