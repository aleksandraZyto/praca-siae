package projekt.projekt.panels.zz.obliczenia;

public class Zerowopradowe {
	
	static double kb = Bm.x("i", "kb");
	static double iCs = Bm.x("i", "ics");
	static double kp = Bm.x("i", "kp");
	static double iMi = Bm.mi("i");
	static double iCl = Bm.x("i", "icl");
	static double kc = Bm.x("i", "kc");
	static double Ir = Bm.x("i", "ir");
	static double p = Bm.p();
	
	public static double iMin(){
		return (kb*iCl)/(kp*p)+iMi;
	}
	
	public static double iMax(){
		double ulamek = (0.5*iCs*(1-Bm.a()))/p;
		return (ulamek-iMi)/kc;
	}
}
