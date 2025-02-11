package tp3exosYaip6;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		
		
		
	}

	@Override
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return radius * 2;
	}
	
	
	public static void main(String[] args) {
    	Circle c1 = new Circle(11.0);
        
    	System.out.println(c1.toString());
    	System.out.println("Area = " + c1.getArea());
    	System.out.println("Perimeter = " + c1.getPerimeter());
    	
  
    }

}
