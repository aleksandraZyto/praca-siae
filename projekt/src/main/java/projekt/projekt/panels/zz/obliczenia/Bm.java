package projekt.projekt.panels.zz.obliczenia;

import javax.swing.JTextField;

import projekt.projekt.panels.zz.IPanel;
import projekt.projekt.panels.zz.IcPanel;
import projekt.projekt.panels.zz.IcsPanel;
import projekt.projekt.panels.zz.IdlPanel;
import projekt.projekt.panels.zz.IrPanel;
import projekt.projekt.panels.zz.KbPanel;
import projekt.projekt.panels.zz.KcPanel;
import projekt.projekt.panels.zz.KpPanel;
import projekt.projekt.panels.zz.UPanel;
import projekt.projekt.panels.zz.YPanel;

public class Bm {
	
	public static double mi(String a){
		if(a.equals("i")){
			return Double.parseDouble(IPanel.field.getText())/1000;
		}else if(a.equals("y")){
			return Double.parseDouble(YPanel.field.getText())/1000;
		}else{
			System.out.println("Wrong value");
			return -1;
		}
	}
	
	public static double d(double iCs, double iR){
		return iR/iCs;
	}
	
	public static double a(double iCs, double iCl){
		return iCl/iCs;
	}
	
	public static double s(double iCs, double iDl){
		return (iDl-iCs)/iCs;
	}
	
	public static double x(String a, String b){
		if(a.equals("i")){
			i(b);
		}else if(a.equals("y")){
			y(b);
		}else if(a.equals("g")){
			g(b);
		}else if(a.equals("b")){
			b(b);
		}
		
		return -1; 
	}
	
	public static double d(JTextField x){
		return Double.parseDouble(x.getText());
	}
	
	public static double i(String b){
		if(b.equals("kb")){
			return d(KbPanel.f1);
		}else if(b.equals("kc")){ 
			return d(KcPanel.f1);
		}else if(b.equals("ir")){ 
			return d(IrPanel.field);
		}else if(b.equals("isc")){ 
			return d(IcsPanel.field);
		}else if(b.equals("icl")){ 
			return d(IcPanel.field);
		}else if(b.equals("kp")){ 
			return d(KpPanel.field);
		}else if(b.equals("ymi")){ 
			return d(IPanel.field);
		}	return -1;
	}
	
	public static double y(String b){
		if(b.equals("kb")){
			return d(KbPanel.f2);
		}else if(b.equals("kc")){ 
			return d(KcPanel.f2);
		}else if(b.equals("ir")){ 
			return d(IrPanel.field);
		}else if(b.equals("isc")){ 
			return d(IcsPanel.field);
		}else if(b.equals("ymi")){ 
			return d(YPanel.field);
		}else if(b.equals("u")){ 
			return d(UPanel.field);
		}else if(b.equals("icl")){ 
			return d(IcPanel.field);
		}else if(b.equals("idl")){ 
			return d(IdlPanel.field);
		}return -1;
	}

	public static double b(String b){
		if(b.equals("kb")){
			return d(KbPanel.f3);
		}else if(b.equals("kc")){ 
			return d(KcPanel.f3);
		}else if(b.equals("ics")){ 
			return d(IcsPanel.field);
		}else if(b.equals("ymi")){ 
			return d(YPanel.field);
		}else if(b.equals("u")){ 
			return d(UPanel.field);
		}else if(b.equals("icl")){ 
			return d(IcPanel.field);
		}	return -1;
	}
	
	public static double g(String b){
		if(b.equals("kb")){
			return d(KbPanel.f4);
		}else if(b.equals("kc")){ 
			return d(KcPanel.f4);
		}else if(b.equals("ir")){ 
			return d(IrPanel.field);
		}else if(b.equals("ymi")){ 
			return d(YPanel.field);
		}else if(b.equals("u")){ 
			return d(UPanel.field);
		}	return -1;
	}

}