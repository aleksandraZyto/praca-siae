package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.KpPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class Y {

		static double kb = Bm.d(KbPanel.f2);
		static double u = Bm.d(UPanel.field);
		static double p = Bm.p();
		static double yMi = Bm.d(YPanel.field)/1000;
		static double iCs = Bm.d(IcsPanel.field);
		static double a = Bm.a();
		static double d = Bm.wspd();
		static double s = Bm.s();
		static double kc = Bm.d(KcPanel.f2);	
	
	public static double yMin(){
		return (kb*iCs*a)/(u*p)+yMi;
	}
	
	public static double yMax(){
		double pierw = Math.sqrt(d*d+Math.pow((s+a), 2));
		return (pierw*iCs)/(u*p*kc);
	}
	
}
