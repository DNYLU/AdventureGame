import java.util.ArrayList;

public class Player {

  // Instance variables
  private String playerName;
  private int playerHealth;
  private ArrayList <Item> inventory;
  private Room currentRoom;


  // Defining Player() constructor
  public Player() {
    this.playerName = "";
    this.playerHealth = 100;
    inventory = new ArrayList<>();
  }

  // Take item
  public void takeItem(String itemName, Room room) {
    ArrayList<Item> items = room.getItems();
    for (Item item1 : items) {
      if (itemName.equals(item1.getName())) { // Check if item is the same as
    inventory.add(item1);    
      }
    }
  }

  //Drop item
  /*public void dropItem(String itemName) {
    inventory.remove(itemName);
  }*/

  public boolean playerRemoveItem(String itemName) {
    for (String item : inventory) {
      if (inventory.equals(itemName)) { // Check if item
        return true; // if the item exists
      }
    }
    return false; // if the item doesn't exist
  }

  // Player constructor
  public Player(String playerName, Room startingPosition, int playerHealth) {
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