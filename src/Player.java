import java.util.ArrayList;

public class Player {

  // Instance variables
  private String playerName;
  private int playerHealth;
  private ArrayList <String> inventory = new ArrayList<>();
  // private Room currentRoom;

  // Defining Player() constructor
  public Player() {
    this.playerName = "";
    this.playerHealth = 100;
  }

  // Player constructor
  // Skal Arraylist med i parameteren? - Spørg David :)
  public Player(String playerName, Room startPosition ,int playerHealth, ArrayList<String> inventory) {
    this.playerName = playerName;
    this.playerHealth = playerHealth;
    this.inventory = new ArrayList<>();
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerHealth(int playerHealth) {
    this.playerHealth = playerHealth;
  }

  public int getPlayerHealth() {
    return playerHealth;
  }

  public void setInventory(ArrayList<String> inventory) {
    this.inventory = inventory;
  }

  public ArrayList<String> getInventory() {
    return inventory;
  }


}