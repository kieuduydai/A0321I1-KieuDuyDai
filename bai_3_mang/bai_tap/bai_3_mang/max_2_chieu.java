package bai_3_mang;
import java.util.Scanner;

public class max_2_chieu {
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
	
	public static int max(int a[][],int row,int col) {
		int max = a[0][0];
		
		for(int i = 1 ; i < row ; i++)
			for(int j = 1; j < col ; j++)
				if(max<a[i][j]) 
					max = a[i][j];
		
		return max;	
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
	    
	    System.out.println("Phan tu lon nhat: "+ max(a, row, col));
	    
	}
}
