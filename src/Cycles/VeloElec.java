package Cycles;

public class VeloElec extends Velo{
	private double DEFAUT_COUPLE_MOTEUR;
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	private double facteurPuissanceMoteur;
	
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet,diamRoue);
	}
	
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
		
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_COUPLE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		this.DEFAUT_COUPLE_MOTEUR = DEFAUT_COUPLE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur() {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	
	 @Override
	public String toString() {
		return "VeloElec[facteurPuissanceMoteur = " + this.facteurPuissanceMoteur + "]";
	}
	
	 
	 @Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	
	    public static void main(String[] args) {
	    	VeloElec f1 = new VeloElec ();
	    	VeloElec f2 = new VeloElec (13.0, 12.0);
	    	VeloElec f3 = new VeloElec (13.0, 12.0, 10.0);
	        
	    	System.out.println(f1);
	    	System.out.println(f2);
	    	System.out.println(f3);
	    	System.out.println(f3.getPuissance(15));
	    	System.out.println(f3.toString());
	    }
	}
	
	
