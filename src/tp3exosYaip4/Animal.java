package tp3exosYaip4;

public class Animal {
	private String name;
	
	
	
	public Animal(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Animal[name = " + this.name + "]";
	}
	
	public static void main(String[] args) {
    	Animal a1 = new Animal("Imed");
        
    	System.out.println(a1.toString());
    }
	
}
