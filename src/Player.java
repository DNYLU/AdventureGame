import java.util.ArrayList;

public class Player {

  // Instance variables
  private String playerName;
  private int playerHealth;
  private ArrayList <String> inventory;
  private Room currentRoom;


  // Defining Player() constructor
  public Player() {
    this.playerName = "";
    this.playerHealth = 100;
    inventory = new ArrayList<>();
  }

  // Take item
  public void takeItem(String itemName) {
    inventory.add(itemName);
  }
  //Drop item
  public void dropItem(String itemName) {
    inventory.remove(itemName);
  }

  // Player constructor
  public Player(String playerName, Room startingPosition ,int playerHealth) {
    this.playerName = playerName;
    this.playerHealth = playerHealth;
    this.currentRoom = startingPosition;
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

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }


}