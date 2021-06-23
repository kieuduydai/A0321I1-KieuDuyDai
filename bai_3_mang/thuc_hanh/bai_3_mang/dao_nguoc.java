package bai_3_mang;
import java.util.Scanner;
public class dao_nguoc {
	public static void ramdom(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			a[i] = (int) (Math.random() * 100);
	}
	
	public static void out(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			System.out.print(a[i]+" ");
	}
	
	public static void daoDay(int a[],int n) {
		int i;
		for(i = n-1 ; i >= 0; i--)
			System.out.print(a[i]+" ");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu:");
		int n = sc.nextInt();
		int []a = new int [n];
		
		System.out.print("Mang ramdom la\n");
		ramdom(a, n);
		out(a, n);
		System.out.print("\nMang dao nguoc\n");
		daoDay(a, n);
		
}
}
