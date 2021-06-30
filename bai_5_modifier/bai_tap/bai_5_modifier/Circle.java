package bai_5_modifier;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
	}
	
	public Circle(double r){
		this.radius = r;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public double setRadius(double r){
		return this.radius = r;
	}
	
	
	public double getArea(){
		return this.radius*this.radius*Math.PI;
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.setRadius(5.55);
		System.out.print("r = "+obj.getRadius());
		System.out.print("\narea = "+obj.getArea());
	}
	
}
