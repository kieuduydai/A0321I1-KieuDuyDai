package bai_tap;

public class Cylinder extends Circle {
	
	private double height = 1.0;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double height) {
		this.height = height;
	}
	
	public Cylinder(double radius , String color , double height) {
		super(radius,color);
		this.height = height;
	}
	
	public double getHeight () {
		return this.height;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public double getVolume() {
		return getArea() * this.height;
	}
	
	
	
	public String toString() {
		return "A Cylinder with height = " + getHeight() + 
				", which is a subclass of " + super.toString() + 
				" and volume = " + getVolume() + " m3";
	}
}

class Circle {
	private double radius;
	private String color = "yellow";
	
	public Circle() {
    }

    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
    	return this.color;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    
    public String toString() {
    	return "A Circle with color of "+ getColor() + " ,radius = " + getRadius() + " m" ;
    }
}