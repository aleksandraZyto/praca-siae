package projekt.projekt;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

;

public class App 
{
    public static void main( String[] args )
    {
    	SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				JFrame frame = new MainFrame("Nastawy zabezpieczeń linii SN");
				Utils.frameSetting(frame, 600, 350);
			}
		});
    	
    }
}
