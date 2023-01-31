package chapter5;

class Noodle5 {
	  
	  protected double lengthInCentimeters;
	  protected double widthInCentimeters;
	  protected String shape;
	  protected String ingredients;
	  protected String texture = "brittle";
	  
	  Noodle5(double lenInCent, double wthInCent, String shp, String ingr) {
	    
	    this.lengthInCentimeters = lenInCent;
	    this.widthInCentimeters = wthInCent;
	    this.shape = shp;
	    this.ingredients = ingr;
	    
	  }
	  
	  public String getCookPrep() {
	    
	    return "Boil noodle for 7 minutes and add sauce.";
	    
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    Noodle5 spaghetti, ramen, pho;
	    
	    spaghetti = new Spaghetti1();
	    ramen = new Ramen1();
	    pho = new Pho1();
	    
	    Noodle5[] allTheNoodles = {spaghetti, ramen, pho};
	    
	    for (Noodle5 noodle : allTheNoodles) {
	      
	      System.out.println(noodle.getCookPrep());
	      
	    }
	    
	  }
	  
	}