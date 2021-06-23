package bai_3_mang;
import java.util.Scanner;
public class them_pt {
	public static Scanner sc = new Scanner(System.in);
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
	
	
	
	
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu:");
		int n = sc.nextInt();
		int []a = new int [n];
		ramdom(a, n);
		out(a,n);
		System.out.print("\nNhap phan tu k:");
		int k = sc.nextInt();
		
		System.out.printf("Nhap vi tri :");
		int x = sc.nextInt();
		
		
        System.out.print("\nMang sau khi chen: ");
        out(a,n);
        
	}
}
