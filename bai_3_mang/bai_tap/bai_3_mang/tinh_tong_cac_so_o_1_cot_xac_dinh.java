package bai_3_mang;

import java.util.Scanner;

public class tinh_tong_cac_so_o_1_cot_xac_dinh {
	public static Scanner sc = new Scanner(System.in);
	public static void ramdom2Chieu(int a[][],int row, int col ) {
		
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            a[i][j] = (int) (Math.random() * 100);
	        }
	    }
	}
	
	public static void out(int a[][],int row, int col ) {
		
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) 
	            System.out.print(a[i][j] + " ");
	        
	        System.out.println("\n");   
	    }
		
	}
	
	public static int tong(int a[][],int row,int col) {
		int sum = 0;
		
		for(int i = 0 ; i < col ; i++)
			sum += a[i][row];
		
		return sum;	
	}
	
	
	public static void main(String[] args) {
		
	    int row, col;

	    System.out.print("Nhap so dong:");
	    row = sc.nextInt();
	    System.out.print("Nhap so cot:");
	    col = sc.nextInt();
	         
	    int[][] a = new int[row][col];
	   
	    ramdom2Chieu(a, row, col);
	    System.out.println("Ma tran ngau nhien ");
	    out(a, row, col);
	    
	    
	    int k;
	    do {
	    	System.out.print("Nhap cot muon tinh tong: ");
		    k = sc.nextInt();
		    if (k >= row) 
		    	System.out.print("Khong hop le!\n");
	    }while (k >= row);
	    
	    
	    System.out.println("Tong phan tu cua cot "+k+" la: " + tong(a, k, col));
	    
		
	}
}
