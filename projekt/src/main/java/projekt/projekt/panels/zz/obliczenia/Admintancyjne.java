package projekt.projekt.panels.zz.obliczenia;

public class Admintancyjne {

	public static double yMin(double kb, double iCs, double u, double p, double yMi, double iCl){
		double a = Bm.a(iCs, iCl);
		return (kb*iCs*a)/(u*p)+Bm.mi("y");
	}
	
	public static double yMax(double iCs, double iR, double iDl, double iCl, double u, double p, double kc){
		double pierw = Math.sqrt(Math.pow(Bm.d(iCs, iR), 2)+(Math.pow(Bm.s(iCs, iDl), 2)+Math.pow(Bm.a(iCs, iCl), 2)));
		return (pierw*iCs)/(u*p*kc);
	}
	
}
