package chapter3;

public class Newsfeed1 {
	  
	  
	  public Newsfeed1(){
	    
	  }
	    
	  public String[] getTopics(){
	    String[] topics = {"Opinion", "Tech", "Science", "Health"};
	    return topics;
	  }
	  
	  public static void main(String[] args){
	    Newsfeed1 sampleFeed = new Newsfeed1();
	    String[] topics = sampleFeed.getTopics();
	    System.out.println(topics);
	  }
	}
