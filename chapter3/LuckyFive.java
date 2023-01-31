package chapter3;
// Importing the Random library
import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    Random randomGenerator = new Random();
    
    int dieRoll = randomGenerator.nextInt(6) + 1;

    while (dieRoll != 5) {
      
      System.out.println(dieRoll);
			dieRoll = randomGenerator.nextInt(6) + 1;

    }
    
  }
  
}