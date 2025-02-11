package tp3exosYaip5;

public class Cylinder {
    private Circle base;
    private double height;

    
    public Cylinder() {
        base = new Circle();  
        height = 1.0;         
    }


    public Cylinder(double radius, double height) {
        base = new Circle(radius);  
        this.height = height;       
    }


    public Circle getBase() {
        return base;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return base.getArea() * height;
    }

   
    public double getSurfaceArea() {
        return 2 * base.getArea() + 2 * Math.PI * base.getRadius() * height;
    }
}