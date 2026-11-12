public class Roblox{

  private String name; //The name of each Roblox game
  private int players; //The amount of active players
  private double rating; //The rating of each game

  
  /*
   * Sets name, players, and rating to the specified values
   */
  public Roblox (String name, int players, double rating){
    this.name=name;
    this.players=players;
    this.rating=rating;
  }  

  /*
   * Returns the name of the company
   */
  public String getName(){
    return name;
  }

   /*
   * Returns the number of active players
   */
  public int getPlayers(){
    return players;
  }

  /*
   * Returns the game rating
   */
  public double getRating(){
    return rating;
  }

  /*
   * Returns a String containing the name of the
   * game, number of players, and rating
   */
  public String toString(){
    return "Game: " + name + "\n" +  "Active Players in " + name + ": " + players + "\n" + "Rating of " + name + ": "+ rating + "\n";
  }
  
}