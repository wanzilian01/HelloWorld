package chapter5;

class Succulent extends Plant {
	public Succulent(String succulentName, int succulentHeight) {
		super(succulentName, succulentHeight);
		System.out.println("Succulent constructor has been called");
	}

	public static void main(String[] args) {
		Succulent lithops = new Succulent("lithops", 1);
	}
}

class Plant {
	String plantName;
	int plantHeight;

	public void waterPlant() {
		System.out.println("The " + plantName + " has been watered");
	}

	public Plant(String name, int height) {

		super();
		plantName = name;
		plantHeight = height;
		System.out.println("Plant constructor has been called");
	}
}
