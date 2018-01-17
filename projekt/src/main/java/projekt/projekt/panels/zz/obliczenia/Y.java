package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.IcPanel;
import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class Y {

		static double kb = Bm.d(KbPanel.f2);
		static double u = Bm.d(UPanel.f1);
		static double p = Bm.p();
		static double yMi = Bm.d(YPanel.f1)/1000;
		static double iCs = Bm.d(IcsPanel.f1);
		static double iCl = Bm.d(IcPanel.f1);
		static double a = Bm.a();
		static double d = Bm.wspd();
		static double s = Bm.s();
		static double kc = Bm.d(KcPanel.f2);	
	
	public static double yMin(){
		return ((kb*iCl)/(u*p))+yMi;
	}
	
	public static double yMax(){
		double pierw = Math.sqrt((d*d)+Math.pow((s+a), 2));
		return (pierw*iCs)/(u*p*kc);
	}
	
}
