package bai_4_OOP;

public class fan {
	final private int slow   = 1;
	final private int medium = 2;
	final private int fast   = 3;
	
	int     speed  = slow;
	boolean on     = false;
    double  radius = 5;
    String  color  = "Xanh";
    
	
    public fan() {
	}
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString() {
        if (this.on != false) 
            return "Quat bat " + ".Toc do: " + speed + 
            		" .Ban kinh cua canh quat: " + radius + " .Co mau: " + color;
        else 
            return "Quat tat " + ".Ban kinh cua canh quat: " + radius + " .Co mau:"
            		+ " " + color;
    }
    
}
