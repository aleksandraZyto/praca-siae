package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class B {

	public static double kb = Bm.d(KbPanel.f3);
	public static double yMi = Bm.d(YPanel.field)/1000; 
	
	public static double bMin(){
		return kb*yMi;
	}
}
