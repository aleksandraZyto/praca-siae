package projekt.projekt.panels.zz.obliczenia;

public class Konduktancyjne {

	public static double gMin(double kb, double yMi){
		return Susceptancyjne.bMin(kb, yMi);
	}
	
	public static double gMax(double iCs, double iR, double u, double p, double kc){
		return (1000*iCs*BasicMath.d(iCs, iR))/(u*p*kc);
	}
	
}
