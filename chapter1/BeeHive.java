package chapter1;

import java.util.ArrayList;

public class BeeHive {
	private ArrayList<Bee> beeList;

	public BeeHive(int numBees) {
		this.beeList = new ArrayList<Bee>();
		for (int i = 0; i < numBees; i++) {
			this.beeList.add(new Bee("bee" + i));
		}
	}

	public ArrayList<Bee> getBeeList() {
		return this.beeList;
	}

	public void renameBees(ArrayList<String> newNames) {
		int newSize = newNames.size();
		if (newSize > beeList.size()) {
			newSize = beeList.size();
		}
		for (int i = 0; i < newSize; i++) {
			beeList.get(i).setName(newNames.get(i));
		}
	}

	public static void main(String[] args) {
		BeeHive myHive = new BeeHive(3);
		ArrayList<String> newNames = new ArrayList<String>();
		newNames.add("bob");
		newNames.add("macey");
		newNames.add("anna");

		myHive.renameBees(newNames);

		// Print out the elements in the bee list to make sure the new bees were added
		for (Bee b : myHive.beeList) {
			System.out.println(b.getName());
		}
	}
}
