package projekt.projekt;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;

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
	
}
