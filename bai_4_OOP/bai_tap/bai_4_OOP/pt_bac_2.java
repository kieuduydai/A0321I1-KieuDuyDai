package bai_4_OOP;

public class pt_bac_2 {
	private double a,b,c;
	
	public pt_bac_2() {
	}
	
	public pt_bac_2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminant() {
		return (this.b*this.b) - (4*this.a*this.c); 
	}
	
	public double getRoot1() {
		return (-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
	}
	
	public double getRoot2() {
		return (-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
	}
	
}
