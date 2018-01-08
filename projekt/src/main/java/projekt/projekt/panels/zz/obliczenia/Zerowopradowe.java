package projekt.projekt.panels.zz.obliczenia;

public class Zerowopradowe {
	
	public static double iMin(double kb, double iCl, double kp, double p, double iMi){
		return (kb*iCl)/(kp*p)+Bm.mi("i");
	}
	
	public static double iMax(double iCs, double iCl, double kc, double p, double iMi){
		double ulamek = (0.5*iCs*(1-Bm.a(iCs, iCl)))/p;
		return (ulamek-Bm.mi("i"))/kc;
	}
}
