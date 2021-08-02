package bai_tap.bai_1_reverse_stack;

import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
        
		Stack<Integer> array = new Stack<>();
        for(int i = 0; i < 10; i++)
            array.push(i);
        System.out.println("array is: "+array);
        
        
        Stack<Integer> arrayNew = new Stack<>();
        for(int i:array)
            arrayNew.push(i);
        
        for(int i = 0; i < array.size(); i++)
        {
        	int element = arrayNew.pop();
            array.set(i,element);
        }
       
        System.out.println("array reverse is: "+array);
        
        
        String string = "Kieu Duy Dai";
        String[] strings = string.split(" ");
        System.out.println("string is: " + string);
        Stack<String> stringNew = new Stack<>();
        for (String i : strings) {
            stringNew.push(i);
        }
        string="";
        while (!stringNew.isEmpty()) {
            string += stringNew.pop() + " ";
        }
        System.out.println("string reverse is: " + string);
    }
}
