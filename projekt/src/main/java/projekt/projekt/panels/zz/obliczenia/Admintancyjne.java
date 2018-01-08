package projekt.projekt.panels.zz.obliczenia;

public class Admintancyjne {

	static double kb = Bm.x("y", "kb");
	static double iCs = Bm.x("y", "ics");
	static double u = Bm.x("y", "u");
	static double yMi = Bm.mi("y");
	static double iCl = Bm.x("y", "icl");
	static double iDl = Bm.x("y", "idl");
	static double kc = Bm.x("y", "kc");
	static double Ir = Bm.x("y", "ir");
	static double p = Bm.p();
	
	public static double yMin(){
		return (kb*iCs*Bm.a())/(u*p)+yMi;
	}
	
	public static double yMax(){
		double pierw = Math.sqrt(Math.pow(Bm.d(), 2)+Math.pow((Bm.s()+Bm.a()), 2));
		return (pierw*iCs)/(u*p*kc);
	}
	
}
