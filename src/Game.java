import java.util.Scanner;

public class Game {
  private Scanner scan = new Scanner(System.in);
  private String playerCommands;
  private String playerLook;
  private Room currentRoom;
  private Player playerName;

  public static void main(String[] args) {
    Game adventure = new Game();
    adventure.start();
  }

  //Help command
  public void help() {
    System.out.println("----------------------------------------");
    System.out.println("#\tYou have these options:");
    System.out.println("go north, go east, go west, go south - To choose directions");
    System.out.println("look - To check your current location");
    System.out.println("exit - To quit game");
  }

  // Current room setter getter
  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }
  public Room getCurrentRoom() {
    return currentRoom;
  }

  public Game() {
    Map map = new Map();
    currentRoom = map.starterRoom;
  }

  public void start() {
    System.out.print("Welcome to the Hunted Manor:");
    System.out.print("You have lost your way in a dark forest in a heavy storm. When suddenly see a giant manor on top of the hill.\n You make the way to the manor, but when you enter the manor, the door shuts behind you, and you hear \n" +
        "Uncomfortable sounds.\n you try to get out again but the door is locked.\n You have to find a way out,");
    System.out.println("You are in " + currentRoom);

    // While loop - Actions
    while (true) {
      System.out.println("----------------------------------------");
      System.out.print("Where do you want to go? ");
      playerCommands = scan.nextLine();

      if (playerCommands.equals("go north")) {
        if (currentRoom.getNorth() != null) {
          currentRoom = currentRoom.getNorth();
          System.out.println("You are in " + currentRoom);
        } else {
          System.out.println("You cannot go that way!");
        }
      }

      if (playerCommands.equals("go east")) {
        if (currentRoom.getEast() != null) {
          currentRoom = currentRoom.getEast();
          System.out.println("You went to " + currentRoom);
        } else {
          System.out.println("You cannot go that way!");
        }
      }
      if (playerCommands.equals("go south")) {
        if (currentRoom.getSouth() != null) {
          currentRoom = currentRoom.getSouth();
          System.out.println("You went to " + currentRoom);
        } else {
          System.out.println("You cannot go that way!");
        }
      }

      if (playerCommands.equals("go west")) {
        if (currentRoom.getWest() != null) {
          currentRoom = currentRoom.getWest();
          System.out.println("You went to " + currentRoom);
        } else {
          System.out.println("You cannot go that way!");
        }
      }
      //Look command
      if (playerCommands.equals("look")) {
        System.out.println(">You are in " + currentRoom);
    }
      //Help command
      if (playerCommands.equals("help")) {
        help();
    }
      // Exit command
      if (playerCommands.equals("exit")) {
        System.out.println(">You have ended the game");
        break;
      }

  }
}
}
