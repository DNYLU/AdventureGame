import java.util.ArrayList;
import java.util.Scanner;

public class Adventure {

  private Scanner scan = new Scanner(System.in);

  private String playerCommands;
  //private String playerLook;
  //private Player playerName;
  //private Room currentRoomDescription;


  public Adventure() {
  }

  public void start() {

    Map map = new Map();
    // currentRoom = map.starterRoom;
    Player player = new Player();
    player.setCurrentRoom(map.starterRoom);

    System.out.print("\nYou have lost your way in a dark forest in a heavy storm. Suddenly you see a giant manor" +
        " on top of the hill.\nYou make way to the manor, but when you enter it the door shuts" +
        " behind you, and you hear uncomfortable and scary sounds.\nYou try to get out again but the door is" +
        " locked.\nYou have to find a way out\n\n");
    System.out.print("Welcome to the Hunted Manor\n\n");
    System.out.println("You are in " + player.getCurrentRoom());

    // While loop - Actions
    while (true) {
      System.out.println("----------------------------------------");
      System.out.print("Where do you want to go?\n");
      playerCommands = scan.nextLine().toLowerCase().trim();

      if (playerCommands.equals("go north") || playerCommands.equals("n")) {
        if (player.getCurrentRoom().getNorth() != null) {
          player.setCurrentRoom(player.getCurrentRoom().getNorth());
          System.out.println("You are in " + player.getCurrentRoom());
        } else {
          System.out.println("You cannot go that way!");
        }
      }

      if (playerCommands.equals("go east") || playerCommands.equals("e")) {
        if (player.getCurrentRoom().getEast() != null) {
          player.setCurrentRoom(player.getCurrentRoom().getEast());
          System.out.println("You went to " + player.getCurrentRoom());
        } else {
          System.out.println("You cannot go that way!");
        }
      }
      if (playerCommands.equals("go south") || playerCommands.equals("s") ) {
        if (player.getCurrentRoom().getSouth() != null) {
          player.setCurrentRoom(player.getCurrentRoom().getSouth());
          System.out.println("You went to " + player.getCurrentRoom());
        } else {
          System.out.println("You cannot go that way!");
        }
      }

      if (playerCommands.equals("go west") || playerCommands.equals("w")) {
        if (player.getCurrentRoom().getWest() != null) {
          player.setCurrentRoom(player.getCurrentRoom().getWest());
          System.out.println("You went to " + player.getCurrentRoom());
        } else {
          System.out.println("You cannot go that way!");
        }
      }

      //Look command
      if (playerCommands.equals("look")) {
        System.out.println(">You are in " + player.getCurrentRoom());
      }
      //Help command
      if (playerCommands.equals("help")) {
        help();
      }
      // Exit command
      if (playerCommands.equals("exit")) {
        System.out.println("> You have ended the game");
        break;
      }
    }

    // Forkert, men tester bare, så jeg kan arbejde videre på det i morgen
    ArrayList inventoryTest = new ArrayList();
    if (playerCommands.equals("test")) {
      inventoryTest.add("Lamp");
      System.out.println("You've picked up a " + inventoryTest);
      System.out.println("Test worked");
    }
  } // Start

  //Help command
  public void help() {
    System.out.println("----------------------------------------");
    System.out.println("#\tYou have these options:");
    System.out.println("go north, go east, go south, go west OR n, e, s, w - To choose directions");
    System.out.println("look - To check your current location");
    System.out.println("exit - To quit game");
  }
}