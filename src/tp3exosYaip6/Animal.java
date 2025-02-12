package tp3exosYaip6;

import tp3exosYaip4.Dog;

public class Animal {
	protected static String name;
	
	public Animal (String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal[name=" + name + "]";
	}
	
	public static void main(String[] args) {
    	Animal A1 = new Animal("Imed");
        
    	System.out.println(A1.toString());
    }
}