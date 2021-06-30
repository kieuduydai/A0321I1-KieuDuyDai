package controllers;

import java.util.Scanner;

public class FuramaController {
	public static void displayMainMenu() {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("1. Employee Management");
		System.out.println("2. Customer Management");
		System.out.println("3. Facility Management");
		System.out.println("4. Booking Managerment");
		System.out.println("5. Promotion Management ");
		System.out.println("6. Exit ");
		System.out.print("Enter your choice main menu: ");
		int choice = sc.nextInt();
		
		switch (choice) {
			     case 1:
			    	 int choice1 = -1;
			    	 
			    	 do {
			    			System.out.println("\n1. Display list employees");
			    			System.out.println("2. Add new employee");
			    			System.out.println("3. Edit employee");
			    			System.out.println("4. Return main menu");
			    			System.out.print("Enter your choice: ");
			    			choice1 = sc.nextInt();
			    			switch (choice1) {
			    				     case 1:
			    				         
			    				         break;
			    				     
			    				     case 2:
			    				        
			    				         break;
			    				     
			    				     case 3:
			    				         
			    				         break;
			    				     
			    				     case 4:
			    				    	 
			    				    	 break;

			    				     default:
			    				         System.out.println("No choice!");
			    			 }
			    		}while(choice1 >= 1 && choice1 < 4 );
			         
			    	 break;
			     
			     case 2:
			    	 int choice2 = -1;
			    	 
			    	 do {
			    			System.out.println("\n1. Display list customers");
			    			System.out.println("2. Add new customer");
			    			System.out.println("3. Edit customer");
			    			System.out.println("4. Return main menu");
			    			System.out.print("Enter your choice: ");
			    			choice2 = sc.nextInt();
			    			
			    			switch (choice2) {
			    				     case 1:
			    				         
			    				         break;
			    				     
			    				     case 2:
			    				        
			    				         break;
			    				     
			    				     case 3:
			    				         
			    				         break;
			    				     
			    				     case 4:
			    				    	 
			    				    	 break;

			    				     default:
			    				         System.out.println("No choice!");
			    			 }
			    		}while(choice2 >= 1 && choice2 < 4 );
			    	 
			         break;
			     
			     case 3:
			    	 int choice3 = -1;
			    	 
			    	 do {
			    			System.out.println("1. Display list facility");
			    			System.out.println("2. Add new facility");
			    			System.out.println("3. Display list facility maintenance");
			    			System.out.println("4. Return main menu");
			    			System.out.print("Enter your choice: ");
			    			choice3 = sc.nextInt();
			    			
			    			switch (choice3) {
			    				     case 1:
			    				         
			    				         break;
			    				     
			    				     case 2:
			    				        
			    				         break;
			    				     
			    				     case 3:
			    				         
			    				         break;
			    				     
			    				     case 4:
			    				    	 
			    				    	 break;

			    				     default:
			    				         System.out.println("No choice!");
			    			 }
			    		}while(choice3 >= 1 && choice3 < 4 );
			         
			    	 break;
			     
			     case 4:
			    	 int choice4 = -1;
			    	 
			    	 do {
			    			System.out.println("1. Add new booking");
			    			System.out.println("2. Display list booking");
			    			System.out.println("3. Create new constracts");
			    			System.out.println("4. Display list contracts");
			    			System.out.println("5. Edit contracts");
			    			System.out.println("6. Return main menu");
			    			System.out.print("Enter your choice: ");
			    			choice4 = sc.nextInt();
			    			
			    			switch (choice4) {
			    				     case 1:
			    				         
			    				         break;
			    				     
			    				     case 2:
			    				        
			    				         break;
			    				     
			    				     case 3:
			    				         
			    				         break;
			    				     
			    				     case 4:
			    				    	 
			    				    	 break;
			    				     
			    				     case 5:
			    				    	 break;
			    				    	
			    				     case 6:
			    				    	 break;
			    				    	 
			    				     default:
			    				         System.out.println("No choice!");
			    			 }
			    		}while(choice4 >= 1 && choice4 < 6 );
			    	 
			    	 break;
			     
			     case 5:
			    	 int choice5 = -1;
			    	 
			    	 do {
			    			System.out.println("1. Display list customers use service");
			    			System.out.println("2. Display list customers get voucher");
			    			System.out.println("3. Return main menu");
			    			System.out.print("Enter your choice: ");
			    			choice5 = sc.nextInt();
			    			
			    			switch (choice5) {
			    				     case 1:
			    				         
			    				         break;
			    				     
			    				     case 2:
			    				        
			    				         break;
			    				     
			    				     
			    				     case 3:
			    				    	 break;
			    				    	 
			    				     default:
			    				         System.out.println("No choice!");
			    			 }
			    		}while(choice5 >= 1 && choice5 < 3 );
			    	 break;
			     
			     case 6:
			         System.exit(0);
			     
			     default:
			         System.out.println("No choice!");
		 }
		}
		
	}
	
	public static void main(String[] args) {
		displayMainMenu();
	}
}
