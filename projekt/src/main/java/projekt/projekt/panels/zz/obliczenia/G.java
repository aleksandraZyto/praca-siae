package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.IPanel;
import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.IrPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class G {

	static double kb = Bm.d(KbPanel.f4);
	static double yMi = Bm.d(YPanel.field)/1000;
	static double u = Bm.d(UPanel.field);
	static double iCs = Bm.d(IcsPanel.field);
	static double p = Bm.p();
	static double kc = Bm.d(KcPanel.f4);
	static double d = Bm.wspd();
	

	public static double gMin(){
		return kb*yMi;
	}
	
	public static double gMax(){
		return (1000*iCs*d)/(u*p*kc);
	}
	
}
