package projekt.projekt.panels.zz.obliczenia;

import javax.swing.JTextField;

import projekt.projekt.panels.zz.HFPanel;
import projekt.projekt.panels.zz.fields.IPanel;
import projekt.projekt.panels.zz.fields.IcPanel;
import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.IdlPanel;
import projekt.projekt.panels.zz.fields.IrPanel;
import projekt.projekt.panels.zz.fields.KbPanel;
import projekt.projekt.panels.zz.fields.KcPanel;
import projekt.projekt.panels.zz.fields.KpPanel;
import projekt.projekt.panels.zz.fields.UPanel;
import projekt.projekt.panels.zz.fields.YPanel;

public class Bm {
	
	public static double mi(String a){
		if(a.equals("i")){
			return d(IPanel.field)/1000;
		}else if(a.equals("y")){
			return d(YPanel.field)/1000;
		}else{
			System.out.println("Wrong value");
			return -1;
		}
	}
	
	public static double p(){
		return d(HFPanel.field);
	}
	
	public static double wspd(){
		return i("ir")/i("ics");
	}
	
	public static double a(){
		return i("icl")/i("ics");
	}
	
	public static double s(){
		return (y("idl")-i("ics"))/i("ics");
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
