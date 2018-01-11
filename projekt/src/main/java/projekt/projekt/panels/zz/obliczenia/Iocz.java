package projekt.projekt.panels.zz.obliczenia;

import projekt.projekt.panels.zz.fields.IcPanel;
import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.IrPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.KpPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.UnastPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class Iocz {
	
	static double kb = Bm.d(KbPanel.f1);
	static double p = Bm.p();
	static double yMi = Bm.d(YPanel.field)/1000;
	static double kc = Bm.d(KcPanel.f1);
	static double uNast = Bm.d(UnastPanel.field);
	static double u = Bm.d(UPanel.field);
	static double iR = Bm.d(IrPanel.field);

	public static double ioMin(){
		return kb*yMi;
	}
	
	public static double iMax(){
		return (uNast/u)*(iR/(kc*p));
	}
}
