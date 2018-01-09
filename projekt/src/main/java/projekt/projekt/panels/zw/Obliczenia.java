package projekt.projekt.panels.zw;

import projekt.projekt.panels.zz.obliczenia.Bm;

public class Obliczenia {
	
	public static double s = Bm.d(DaneZwPanel.mocZwSysField)*Math.pow(10, 6);
	public static double u = Bm.d(DaneZwPanel.napiecieZnSysField)*Math.pow(10, 3);
	public static double l = Bm.d(DaneZwPanel.dlLiniiField);
	public static double r = Bm.d(DaneZwPanel.rJednField);
	public static double x = Bm.d(DaneZwPanel.xJednField);
	public static double kb = Bm.d(Dane.kb);
	public static double ks = Bm.d(Dane.ks);
	public static double kr = Bm.d(Dane.kr);
	public static double kp = Bm.d(Dane.kp);
	public static double kc = Bm.d(Dane.kc);
	public static double p = Bm.d(Dane.p);
	public static double iMax = Bm.d(Dane.iMax);

	public static double xZw(){
		return (1.1*u*u)/s;
	}
	
	public static double iKbis(){
		return (1.1*u)/(Math.sqrt(3)*xZw());
	}
	
	public static double iKmin(){
		return u/(2*zZw());
	}

	public static double zZw() {
		return Math.sqrt(Math.pow(l*r, 2)+Math.pow(((x*l)+xZw()), 2));
	}	
	
	public static double iRBzzwl(){
		return (kb*iKbis())/p;
	}
	
	public static double iRZwlMin(){
		return (kb*kr*ks*iMax)/(kp*p);
	}
	
	public static double iRZwlMax(){
		return (ks*iKmin())/(p*kc);
	}
}

