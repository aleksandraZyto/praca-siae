package projekt.projekt.panels.zz.obliczenia;

public class G {

	static double kb = Bm.x("g", "kb");
	static double u = Bm.x("g", "u");
	static double yMi = Bm.mi("y");
	static double kc = Bm.x("g", "kc");
	static double Ir = Bm.x("g", "ir");
	static double p = Bm.p();
	static double iCs = Bm.x("g", "ics");
	

	public double gMin = gMin();
	public double gMax = gMax();
	
	public static double gMin(){
		return kb*yMi;
	}
	
	public static double gMax(){
		return (1000*iCs*Bm.wspd())/(u*p*kc);
	}
	
}
