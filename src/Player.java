import java.util.ArrayList;

public class Player {

    // Instance variables
    private String playerName;
    private int playerHealth;
    private ArrayList<Item> inventory;
    private Room currentRoom;
    //private Weapon currentWeapon;

    // "Food"? - Spørg Patrick om mapper/package. Weapons, food etc.
    private int numHealthPotions;
    private int healthPotHealAmount;
    private int healthPotionDropChance; // Percentage


    // Defining Player() constructor
    public Player() {
        this.playerName = "";
        this.playerHealth = 100;
        inventory = new ArrayList<>();
    }

    public boolean playerCheckItem(Item itemName) {
        for (Item item : inventory) {
            if (inventory.equals(itemName)) {
                return true; // if the item exists
            }
        }
        return false; // if the item doesn't exist
    }

    // Take item
    public void takeItem(String itemName, Room room) {
        ArrayList<Item> items = room.getLoot();
        for (Item item : items) {
            if (itemName.equals(item.getName())) { // Check item name
                inventory.add(item);
            }
        }
    }
    // Drop item
  public void dropItem(String itemName) {
    inventory.remove(itemName);
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

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }


}