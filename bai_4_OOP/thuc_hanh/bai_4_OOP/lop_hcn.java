package bai_4_OOP;
import java.awt.Checkbox;
import java.util.Scanner;

public class lop_hcn {
	double width, height;

    public lop_hcn() {
    }

    //contrustor
    public lop_hcn( double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}