package projekt.projekt.panels.zz.obliczenia;

public class Admintancyjne {

	public static double yMin(double kb, double iCs, double u, double p, double yMi, double iCl){
		double a = BasicMath.a(iCs, iCl);
		return (kb*iCs*a)/(u*p)+yMi;
	}
	
	public static double yMax(double iCs, double iR, double iDl, double iCl, double u, double p, double kc){
		double pierw = Math.sqrt(Math.pow(BasicMath.d(iCs, iR), 2)+(Math.pow(BasicMath.s(iCs, iDl), 2)+Math.pow(BasicMath.a(iCs, iCl), 2)));
		return (pierw*iCs)/(u*p*kc);
	}
	
}
