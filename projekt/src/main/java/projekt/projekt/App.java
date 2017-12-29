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
				JFrame frame = new MainFrame("Obliczenia zwarciowe");
				frame.setSize(1400,1100);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
    	
    }
}
