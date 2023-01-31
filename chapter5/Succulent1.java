package chapter5;

class Succulent1 {
	  String plantType;
	  int plantHeight;
	 
	  public Succulent1(String type, int height) {
	    plantType = type;
	    plantHeight = height;
	  }
	 
	  public boolean equals(Succulent1 otherPlant) {
	    if (!plantType.equals(otherPlant.plantType)) {
	      System.out.println("Succulent names are not equal.");
	      return false;
	    }
	    else if (plantHeight != otherPlant.plantHeight) {
	      System.out.println("Succulent heights are not equal");
	      return false;
	    }
	    else {
	      System.out.println("Succulents are equal.");
	      return true;
	    }
	  }
	}
	 
	class Garden {
	  public static void main(String[] args) {
	     Succulent plant1 = new Succulent("echeveria", 7);
	     Succulent plant2 = new Succulent("haworthia", 4);
	     Succulent plant3 = new Succulent("echeveria", 7);
	 
	     System.out.println(plant1.equals(plant2));
	 
	     System.out.println(plant1.equals(plant3));
	  }
	}