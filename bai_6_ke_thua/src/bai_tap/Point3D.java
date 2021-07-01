package bai_tap;

public class Point3D extends Point2D {
	private float z ;
	
	public Point3D() {
	
	}
	
	public Point3D(float x, float y , float z) {
		super(x,y);
		this.z = z;
	}
	
	public float getZ() {
		return this.z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public String toString() {
		return "(x,y,z) = "+"(" + super.getX() + "," + super.getY() + "," + this.z + ")"; 
	}
	
	public static void main(String[] args) {
		Point3D obj = new Point3D(1,2,3);
		System.out.print(obj);
		
		Point2D obj1 = new Point2D(2,1);
		System.out.println("\n"+obj1+")");
	}
}
