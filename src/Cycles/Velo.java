package Cycles;

import java.util.Random;

public class Velo {
	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		this.DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	
	public Velo() {
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public double getBraquet() {
		return braquet;
		}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	

	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}


	public String toString() {
		return "Velo[braquet = " + braquet + " , diamRoue = " + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	
	
	 public static void main(String[] args) {
	    	Velo f1 = new Velo (13.0, 12.0);
	        
	    	System.out.println(f1.getDEFAUT_BRAQUET());
	    	System.out.println(f1.getGenAlea());
	    	System.out.println(f1.getBraquet());
	    	System.out.println(f1.getDiamRoue());
	    	System.out.println(f1.toString());
	    }
	}
	
	









