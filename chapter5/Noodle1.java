package chapter5;

class Noodle1 {

	double lengthInCentimeters;
	double widthInCentimeters;
	String shape;
	String ingredients;
	String texture = "brittle";

	Noodle1(double lenInCent, double wthInCent, String shp, String ingr) {

		this.lengthInCentimeters = lenInCent;
		this.widthInCentimeters = wthInCent;
		this.shape = shp;
		this.ingredients = ingr;

	}

	public void cook() {

		this.texture = "cooked";

	}

	public static void main(String[] args) {

		Pho phoChay = new Pho();
		System.out.println(phoChay.shape);

	}

}