public class Store {
  String productType;
  int inventoryCount;
  double inventoryPrice;

  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
    
  }
  public static void main(String[] args) {
	    Store cookieShop = new Store("饼干", 12, 3.75);
	    System.out.println("我的商店卖"+cookieShop.productType);
	  }
	}