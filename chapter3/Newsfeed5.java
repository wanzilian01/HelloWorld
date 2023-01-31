package chapter3;

public class Newsfeed5 {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed5(){

  }
    
	public String[] getTopics() {
		return topics;
  }
  
  public int getNumTopics(){
    return topics.length;
  }
  
  public static void main(String[] args){
    Newsfeed5 sampleFeed = new Newsfeed5();
    
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
   
  }
}

