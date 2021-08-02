package bai_tap.bai_2_implement_queue;

public class CircularQueue {
	private static class Node  
	{  
	    int  data;  
	    Node link;  
	} 
	    
	static class Queue  
	{  
	     Node  front;
	     Node  rear ;
	}
	
	// Create
	static void enQueue(Queue  q, int value)  
	{  
	    Node  temp = new Node();  
	    temp.data  = value;  
	    
	    if (q.front ==  null)  
	        q.front = temp;  
	    else
	        q.rear.link = temp;  
	    
	    q.rear      = temp;  
	    q.rear.link = q.front;  
	} 
	
	// delete
	static  int deQueue(Queue  q)  {  
	    if (q.front ==  null)  
	    {  
	        System.out.printf ("Queue is empty");  
	        return Integer.MIN_VALUE;  
	    }  
	    
	    int value;  
	  // Nếu đây là nút cuối cùng bị xóa 
	    if (q.front == q .rear)  
	    {  
	        value   = q.front.data;  
	        q.front =  null;  
	        q.rear  =  null;  
	    }  
	    else  // Nếu đây có nhiều hơn 1 nút 
	    {  
	        Node temp   = q.front;  
	        value       = temp.data;  
	        q.front     = q.front.link;  
	        q.rear.link = q.front;  
	    }  
	    
	    return value ;  
	}  
	
	// Display  
	static void displayQueue( Queue  q)  
	{  
	    Node  temp = q.front;  
	    System.out.printf("Elements in Circular Queue are: ");  
	    while (temp.link != q.front)  
	    {  
	        System.out.printf("%d ", temp.data);  
	        temp = temp.link;  
	    }  
	    System.out.printf("%d", temp.data);  
	}
	
}
