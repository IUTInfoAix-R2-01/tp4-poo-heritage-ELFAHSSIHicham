package tp3exosYaip6;

import tp3exosYaip4.Cat;

public class Rectangle {
	private double width; 
	private double lenght;
	
	
	public Rectangle (double width, double lenght) {
		this.width = width;
		this.lenght = lenght;
	}


	@Override
	public String toString() {
		return "Rectangle[width=" + this.width + ", lenght=" + this.lenght + "]";
	}
	
	public double getArea() {
		return lenght * width;
	}
	
	public double getPerimeter() {
		return lenght * 2 + width * 2;
	}
	
	public static void main(String[] args) {
    	Rectangle r1 = new Rectangle(13.0, 10.0);
        
    	System.out.println(r1.toString());
    	System.out.println("Area = " + r1.getArea());
    	System.out.println("Perimeter = " + r1.getPerimeter());
    	
  
    }
	
}


