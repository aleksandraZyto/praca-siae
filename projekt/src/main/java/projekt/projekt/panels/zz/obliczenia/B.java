package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class B {

	public static double kb = Bm.x("b", "kb");
	public static double yMi = Bm.mi("y"); 
	
	public static double bMin(){
		return kb*yMi;
	}
}
