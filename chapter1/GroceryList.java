package chapter1;

public class GroceryList {
//	public static boolean hasSpecialItem(double[] groceryPrices) {
//		for (double d : groceryPrices) {
//			double s = d % 1;
//		
//			if (s == 0.99) {   //此方法不行
//				return true;
//			}
//		}
//		return false;
//	}
	
	public static boolean hasSpecialItem(double[] groceryPrices) {
	    for (double itemCost : groceryPrices) {
	    	
	      String itemCostStr = String.valueOf(itemCost);
	      if (itemCostStr.length() > 1 && itemCostStr.substring(itemCostStr.length() - 2, itemCostStr.length()).equals("99")) {
	        return true;
	      }
	    }
	 
	    return false;
	  }

	public static void main(String[] args) {
	
		double[] groceryList = { 10.0, 89.9, 8.99, 2.34 };
		System.out.println(hasSpecialItem(groceryList));
	}
}
