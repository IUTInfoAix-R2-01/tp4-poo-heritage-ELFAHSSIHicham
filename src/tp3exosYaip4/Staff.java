package tp3exosYaip4;

public class Staff extends Person {
	private String school;
	private double pay;
	
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
		
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "Staff[Person" + super.toString() + ", school = " + this.school + ", pay=" + this.pay + "]";
	}
	
	public static void main(String[] args) {
    	Staff s1 = new Staff("LEO NARDO", "Avenue Gaston Berger", "IUT Aix En Provence", 1400.0);
        
    	System.out.println(s1);
    	System.out.println(s1.toString());
    }
	
}
