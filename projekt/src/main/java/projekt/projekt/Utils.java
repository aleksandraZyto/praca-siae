package projekt.projekt;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Utils {
	
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
	
	public static JTextField field(){
		return new JTextField(4);
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
	
}
