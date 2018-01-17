package projekt.projekt.panels.zz.obliczenia;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JTextField;

import projekt.projekt.panels.zz.HFPanel;
import projekt.projekt.panels.zz.fields.IcPanel;
import projekt.projekt.panels.zz.fields.IcsPanel;
import projekt.projekt.panels.zz.fields.IdlPanel;
import projekt.projekt.panels.zz.fields.IrPanel;

public class Bm {
	
	public static double p(){
		return d(HFPanel.field);
	}
	
	public static double wspd(){
		return d(IrPanel.f1)/d(IcsPanel.f1);
	}
	
	public static double a(){
		return d(IcPanel.f1)/d(IcsPanel.f1);
	}
	
	public static double s(){
		return (d(IdlPanel.f2)-d(IcsPanel.f1))/d(IcsPanel.f1);
	}
	public static double d(JTextField x){
		return Double.parseDouble(x.getText());
	}
	
	
}
