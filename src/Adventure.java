import java.util.Scanner;

public class Adventure {

  private Scanner scan = new Scanner(System.in);

  private String playerCommands;
  //private String playerLook;
  //private Player playerName;

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
        System.out.println(player.getCurrentRoom().getLoot());
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

      // Show inventory
      if (playerCommands.equals("inventory") || playerCommands.equals("inv")) {
        System.out.println("Inventory:\n" + player.getInventory());
      }

      // Take item (Player)
      if (playerCommands.equals("take")) {
        if (player.playerCheckItem()) // Fix items


       /* if (player.getCurrentRoom().removeItem("Lamp")) {
          player.takeItem("Lamp", map.lampRoom);*/
          //Slet om lidt
          System.out.println(player.getInventory());
          System.out.println(Map.class.getName());

        } else {
          System.out.println("There is no item with that name here");
        }

        if (playerCommands.equalsIgnoreCase("drop")) {
          player.getInventory().remove("Lamp");
          System.out.println("Which item would you like to drop?");
          //insert 'Drop' method
        }
        // Drop item (Player)
        /*if (playerCommands.equals("drop")) {
          // Fiks!!!!
          if (player.getCurrentRoom().) {

            System.out.println(player.getInventory());
          }
        }
      }*/
    }

  } // Start

  //Help command
  public void help() {
    System.out.println("----------------------------------------");
    System.out.println("#\tYou have these options:");
    System.out.println("go north, go east, go south, go west OR n, e, s, w - To choose directions");
    System.out.println("look - To check your current location");
    System.out.println("exit - To quit game");
    System.out.println("take/drop - to add or remove items in your inventory");
  }
}