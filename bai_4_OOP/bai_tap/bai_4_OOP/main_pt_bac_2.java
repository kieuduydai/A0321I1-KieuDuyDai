package bai_4_OOP;
import java.util.Scanner;

public class main_pt_bac_2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap a:");
		double a = sc.nextDouble();
		System.out.print("Nhap b:");
		double b = sc.nextDouble();
		System.out.print("Nhap c:");
		double c = sc.nextDouble();
		
		pt_bac_2 obj = new pt_bac_2(a,b,c);
		
		if( obj.getDiscriminant() < 0 ) 
			System.out.print("Pt co vo nghiem");
		
		else if ( obj.getDiscriminant() == 0 ) 
			System.out.print("Pt co 1 nghiem kep x = "+ obj.getRoot1());
		else {
			System.out.print("Pt co 2 nghiem phan biet\n");
			System.out.print("x1 = "+obj.getRoot1());
			System.out.print("\nx2 = "+obj.getRoot2());
		}
			
	}
}
