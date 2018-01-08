package projekt.projekt.panels.zz.obliczenia;

public class Susceptancyjne {
	
	static double kb = Bm.x("b", "kb");
	static double iCs = Bm.x("b", "ics");
	static double u = Bm.x("b", "u");
	static double yMi = Bm.mi("y");
	static double iCl = Bm.x("b", "icl");
	static double kc = Bm.x("b", "kc");
	static double p = Bm.p();
	
	public static double bMin(){
		return kb*yMi;
	}
}
