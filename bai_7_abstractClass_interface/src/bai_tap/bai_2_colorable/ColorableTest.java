package bai_tap.bai_2_colorable;

public class ColorableTest {
	public static void main(String[] args) {
		Square square  = new Square(4,"red",true);
        Square square1 = new Square(9,"white",true);
        Square square2 = new Square(2,"yellow",false);
        
        double[] color = new double[3];
        color[0] = square.getArea();
        color[1] = square1.getArea();
        color[2] = square2.getArea();
        
        for (double colors : color){
            System.out.println(colors);
        }
        
        Colorable[] colorables = {square, square1, square2};
        
        for(Colorable colorable : colorables)
            if(colorable instanceof Colorable)
                System.out.println(colorable.howToColor());
    }
}
