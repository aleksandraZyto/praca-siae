package projekt.projekt;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Utils {
	
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
}
