package projekt.projekt;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import projekt.projekt.frames.MainFrame;

;

public class App 
{
    public static void main( String[] args )
    {
    	SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				JFrame frame = new MainFrame("Nastawy zabezpieczeń linii SN");
				Utils.frameSetting(frame, 400, 550);
			}
		});
    	
    }
}
