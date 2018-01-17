package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.IPanel;
import projekt.projekt.panels.zz.fields.IrPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.UnastPanel;

public class Iocz {
	
	static double kb = Bm.d(KbPanel.f1);
	static double p = Bm.p();
	static double iMi = Bm.d(IPanel.field1)/1000;
	static double kc = Bm.d(KcPanel.f1);
	static double uNast = Bm.d(UnastPanel.f1);
	static double u = Bm.d(UPanel.f1);
	static double iR = Bm.d(IrPanel.f1);

	public static double ioMin(){
		return kb*iMi;
	}
	
	public static double iMax(){
		return (uNast/u)*(iR/(kc*p));
	}
}
