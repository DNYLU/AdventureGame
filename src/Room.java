import java.util.ArrayList;

public class Room {

    private Room north, east, south, west;


    //ArrayList for items
    private ArrayList<Item> items;

    //Directions to navigate room
    private String name;
    private String description;

    // Constructor
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<Item>();
    }

    public boolean removeItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                items.remove(item);
                return true; // if the item exists
            }
        }
        return false; // if the item doesn't exist
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getName() {
        return this.name;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public String toString() {

        return this.name + description;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}