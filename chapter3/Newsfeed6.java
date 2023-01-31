package chapter3;

import java.util.Arrays;

public class Newsfeed6 {
  
  String[] topics;
  
  public Newsfeed6(String[] initialTopics){
		topics = initialTopics;
  }
  
  public static void main(String[] args){
		Newsfeed6 feed;
    if(args[0].equals("Robot")){
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed6(robotTopics);
    }
    else if(args[0].equals("Human")){
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Newsfeed6(humanTopics);
    }
    else{
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed6(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}

