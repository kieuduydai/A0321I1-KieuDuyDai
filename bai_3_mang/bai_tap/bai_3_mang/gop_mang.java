package bai_3_mang;
import java.util.Scanner;
public class gop_mang {
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
	
	public static int [] gopMang(int a[], int b[]) {
		
		int []c = new int [a.length+b.length];
		
		for(int i = 0; i < a.length; i++){
			c[i] = a[i];
		}
		
		int count = 0;
		for(int i = a.length;i < a.length+b.length;i++) {
			c[i] = b[count++];
		}
		
		return c;
		
	}
	
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu cua mang A: ");
		int n = sc.nextInt();
		int []a = new int [n];
		
		System.out.print("Nhap so phan tu cua mang B: ");
		int m = sc.nextInt();
		int []b = new int [m];
		
		System.out.print("Mang A: ");
		ramdom(a, n);
		out(a,n);
		
		System.out.print("\nMang B: ");
		ramdom(b,m);
		out(b,m);
		
		System.out.print("\nMang sau khi gop: ");
		out(gopMang(a, b),n+m);
	}
}
