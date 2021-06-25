package bai_4_OOP;
import java.util.Scanner;

public class fan_main {
	public static void main(String[] args) {
		fan fan1 = new fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Do");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        
        fan fan2 = new fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        System.out.println(fan2.toString());
}
}
