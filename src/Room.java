public class Room {

  private Room north, east, south, west;

  //Directions to navigate room
  private String name;
  private String description;


  // Constructor
  public Room(String name, String description){
    this.name = name;
   this.description = description;
  }

  // Returnerer navnet, så det kan bruges i map
  public String getName() {
    return this.name;
  }

  public String toString() {
    return this.name;
  }

  public void currentRoomDescription() {
    System.out.println(this.description);
  }

  public void setNorth(Room north) {
    this.north = north;
  }

  public void setEast(Room east) {this.east = east;}

  public void setSouth(Room south) {
    this.south = south;
  }

  public void setWest(Room west) {this.west = west;}

  public Room getNorth() {
    return north;
  }

  public Room getEast() {
    return east;
  }

  public Room getSouth() {return south;}

  public Room getWest() {return west;}



}

