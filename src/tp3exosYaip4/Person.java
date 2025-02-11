package tp3exosYaip4;


public class Person {
	private String name;
	private String address;

	
	public Person(String name, String address) {
		this.name = name;
		this.address = address; 
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String toString() {
		return "Person[name = " + this.name + ", address = " + this.address + "]";
	}
	
	
	public static void main(String[] args) {
    	Person p1 = new Person("LEO NARDO", "Avenue Gaston Berger");
        
    	System.out.println(p1);
    	System.out.println(p1.toString());
    }
	
	
}
