import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

UserStory e = new UserStory("names.txt", "players.txt", "rating.txt");

    // Use toString() method to print out all games + their info
    System.out.println(e);

    // Printing out the methods
    System.out.println(e.calcAveragePlayers());
    System.out.println(e.findMostPopular());
    


    
    
    
  }
}