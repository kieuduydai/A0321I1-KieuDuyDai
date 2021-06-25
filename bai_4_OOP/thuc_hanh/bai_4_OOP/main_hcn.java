package bai_4_OOP;
import java.util.Scanner;
public class main_hcn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the width:");
		double width = scanner.nextDouble();
		System.out.print("Enter the height:");
		double height = scanner.nextDouble();
		
		lop_hcn rectangle = new lop_hcn(width, height);
		System.out.println("Your Rectangle \n"+ rectangle.display());
		System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
		System.out.println("Area of the Rectangle: "+ rectangle.getArea());
	}
}
