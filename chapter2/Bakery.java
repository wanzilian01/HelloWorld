package chapter2;

class Bakery {
	Cupcake bakeryCupcake;
	double price;
	String giveTotal;

	public Bakery(Cupcake cupcakeType, double priceOf) {
		Cupcake copy = new Cupcake(cupcakeType);
		bakeryCupcake = copy;
		price = priceOf;
		bakeryCupcake.flavor = "vanila";
		giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
	}

	public static void main(String[] args) {
		Cupcake chocolateSprinkle = new Cupcake("chocolate", true);
		Bakery myBakery = new Bakery(chocolateSprinkle, 3.25);

		System.out.println("Our object sent as a parameter has a flavor of " + myBakery.bakeryCupcake.flavor);

		System.out.println("Our original object has a flavor of " + chocolateSprinkle.flavor);
	}
}

class Cupcake {
	String flavor;
	boolean sprinkles;

	public Cupcake(String type, boolean hasSprinkles) {
		flavor = type;
		sprinkles = hasSprinkles;

	}

	public Cupcake(Cupcake copy) {
		flavor = copy.flavor;
		sprinkles = copy.sprinkles;
	}
}
