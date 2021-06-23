package bai_3_mang;

import java.util.Scanner;

public class xoa_pt {
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
	
	public static void xoatPt(int a[],int n,int k)
	{	
		int i,c,index;
		boolean check = false;
		for (c = i = 0; i < n; i++) {
	        if (a[i] != k) {
	            a[c] = a[i];
	            c++;
	            check = true;
	        }
	      
	    }
		
		n = c;
		if(check) {
			System.out.print("Mang sau khi xoa\n");
			out(a, n);
		}		
		else 
			System.out.print("\nKhong tim thay "+k+" trong mang");
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu:");
		int n = sc.nextInt();
		int []a = new int [n];
		
		System.out.print("Mang ramdom la\n");
		ramdom(a, n);
		out(a, n);

		System.out.print("\nNhap gia tri muon xoa:");
		int k = sc.nextInt();
		
		xoatPt(a, n, k);
		
}
}
