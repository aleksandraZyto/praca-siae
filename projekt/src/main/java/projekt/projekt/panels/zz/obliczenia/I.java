package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.IPanel;
import projekt.projekt.panels.zz.fields.IcPanel;
import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.KpPanel;

public class I {
	
	static double kb = Bm.d(KbPanel.f1);
	static double iCl = Bm.d(IcPanel.field);
	static double kp = Bm.d(KpPanel.field);
	static double p = Bm.p();
	static double iMi = Bm.d(IPanel.field)/1000;
	static double iCs = Bm.d(IcsPanel.field);
	static double a = Bm.a();
	static double kc = Bm.d(KcPanel.f1);

	public static double iMin(){
		return ((kb*iCl)/(kp*p))+iMi;
	}
	
	public static double iMax(){
		double ulamek = (0.5*iCs*(1-a))/p;
		return (ulamek-iMi)/kc;
	}
}
