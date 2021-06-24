package bai_3_mang;
import java.util.Scanner;

public class tong_duong_cheo_chinh {
	public static Scanner sc = new Scanner(System.in);
	public static void ramdom2Chieu(int a[][],int n ) {
		
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            a[i][j] = (int) (Math.random() * 100);
	        }
	    }
	}
	
	public static void out(int a[][],int n ) {
		
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) 
	            System.out.print(a[i][j] + " ");
	        
	        System.out.println("\n");   
	    }
		
	}
	
	public static int tongDCheo(int a[][],int n) {
		int sum = a[0][0];
		
		for(int i = 1 ; i < n ; i++)
			for(int j = 1; j < n ; j++)
				if(i == j) 
					sum += a[i][j];
		
		return sum;	
	}
	
	
	public static void main(String[] args) {
		
	    int n;

	    System.out.print("Nhap n:");
	    n = sc.nextInt();
	    
	         
	    int[][] a = new int[n][n];
	   
	    ramdom2Chieu(a,n);
	    System.out.println("Ma tran ngau nhien ");
	    out(a, n);
	    
	    System.out.println("Tong duong cheo chinh la: "+ tongDCheo(a, n));
	    
		
	}
}
