package bai_1_WelcomeJava;
import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		System.out.println("Phuong trinh a * x + b = c");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a: ");
		double a = scanner.nextDouble();

		System.out.print("b: ");
		double b = scanner.nextDouble();

		System.out.print("c: ");
		double c = scanner.nextDouble();
		
		if (a != 0) 
		{
		    double answer = (c - b) / a;
		    System.out.printf("Nghiem cua phuong trinh la: %f!\n", answer);
		}
		
		else 
		{
		    if (b == 0) 
		    
		      System.out.print("Vo so nghiem!");
		     
		    else 
		    
		      System.out.print("Vo nghiem!");    
		}
	}
}