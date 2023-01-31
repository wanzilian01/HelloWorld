package chapter2;
class RandomNumbers {
  public static void main(String[] args) {
    System.out.println(Math.random());
 
    double a = Math.random() * 10;
    System.out.println(a);

    int b = (int)(Math.random() * 10);
    System.out.println(b);

    int c = (int)(Math.random() * 10) + 1;
    System.out.println(c);
  
    int d = (int)(Math.random() * 11 ) + 10;
    System.out.println(d);
  }
}
