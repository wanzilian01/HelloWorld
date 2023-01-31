package chapter5;

class Spaetzle extends Noodle3 {

	Spaetzle() {

		super(3.0, 1.5, "irregular", "eggs, flour, salt");
		this.texture = "lumpy and liquid";

	}

	public void cook() {

		System.out.println("Grinding or scraping dough.");
		System.out.println("Boiling.");

		this.texture = "cooked";

	}

}