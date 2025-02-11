package tp3exosYaip5;

public class Circle {
	
	   private double radius;
	   private String color;
	   

	   public Circle() {  
	      radius = 1.0;
	      color = "red";
	   }
	   
	
	   public Circle(double r) {  
	      radius = r;
	      color = "red";
	   }
	   public Circle (double r, String c) { 
			color = c ;
			radius = r; 
			
		}

	   public double getRadius() {
	     return radius; 
	   }
	   

	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   public String getColor() {
		   return color;
	   }
	public String getArea1() {
		return null;
	}
		public void setRadius(double newRadius) { 
	         radius = newRadius; 
	         
	      } 
	      public void setColor(String newColor) { 
	    	  color = newColor ; 
	      }
	}
	
