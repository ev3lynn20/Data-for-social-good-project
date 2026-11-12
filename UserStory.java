import java.util.Scanner;

public class UserStory {

  private Roblox[] robloxData; // The 1D array of Roblox objects

  /*
   * Reads data from namesFile, 
   * playersFile, and ratingFile to initialize UserStory
   */
    public UserStory(String namesFile, String playersFile, String ratingFile) {
    robloxData = createRoblox(namesFile, playersFile, ratingFile);
  }

  /*
   * Returns a 1D array of Company objects using
   * the data from namesFile, playersFile, and ratingFile
   */
    public Roblox[] createRoblox(String namesFile, String playersFile, String ratingFile) {
    String[] namesData = FileReader.toStringArray(namesFile);
    int[] playersData = FileReader.toIntArray(playersFile);
    double[] ratingData = FileReader.toDoubleArray(ratingFile);

    Roblox[] tempGame = new Roblox[namesData.length];

    for (int index = 0; index < tempGame.length; index++) {
      tempGame[index] = new Roblox(namesData[index], playersData[index], ratingData[index]);
    }

    return tempGame;
  }

  /*
   * METHOD #1:Returns the most popular Roblox Game based on rating
   */
    public String findMostPopular(){
      Roblox mostPop = robloxData[0];

      for(Roblox g:robloxData){
        if(g.getRating()>mostPop.getRating()){
          mostPop=g;
        }
      }
      return mostPop.getName();
    } 

  /*
   * METHOD #2:Returns the average number of players in all games
   */
  //2.A method
  public int calcTotalPlayers(){
    int totalPlayers=0;
    
    for(int i =0; i<robloxData.length; i++){
      if(robloxData[i].getPlayers()>0){
        totalPlayers+=robloxData[i].getPlayers();
      }
    }
    return totalPlayers;
  }
  
    //2.B method
    public int calcAveragePlayers(){  
    if(robloxData.length==0){
        return 0;
      }
      int total = calcTotalPlayers();
  
      return total/robloxData.length;
    }
 
  /*
   * Returns a String containing each game's information
   */
  public String toString(){
    String result = "";

    for(Roblox r : robloxData){
      result+=r + "\n";
    }
     return result;
  }
 
}