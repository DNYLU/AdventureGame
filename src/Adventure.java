import java.util.Scanner;

public class Adventure {

    private Scanner scan = new Scanner(System.in);
    private String playerInput;
    private String playerName;


    public void start() {

        Map map = new Map();
        // currentRoom = map.starterRoom;

        Player player = new Player();
        player.setCurrentRoom(map.starterRoom);

        String itemName;

        System.out.print("\nYou have lost your way in a dark forest in a heavy storm. Suddenly you see a giant manor" +
                " on top of the hill.\nYou make way to the manor, but when you enter it the door shuts" +
                " behind you, and you hear uncomfortable and scary sounds.\nYou try to get out again but the door is" +
                " locked.\nYou have to find a way out\n\n");

        System.out.print("Enter your name: ");
        playerName = scan.nextLine();
        player.setPlayerName(playerName);

        System.out.print("Welcome to the Hunted Manor, " + playerName + "\n\n");
        System.out.println("You are in " + player.getCurrentRoom());

        // While loop - Actions
        while (true) {
            System.out.println("----------------------------------------");
            System.out.print("Where do you want to go?\n");
            playerInput = scan.nextLine().toLowerCase().trim();

            if (playerInput.equals("go north") || playerInput.equals("n")) {
                if (player.getCurrentRoom().getNorth() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getNorth());
                    System.out.println("You are in " + player.getCurrentRoom());
                } else {
                    System.out.println("You cannot go that way!");
                }
            }

            if (playerInput.equals("go east") || playerInput.equals("e")) {
                if (player.getCurrentRoom().getEast() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getEast());
                    System.out.println("You went to " + player.getCurrentRoom());
                } else {
                    System.out.println("You cannot go that way!");
                }
            }
            if (playerInput.equals("go south") || playerInput.equals("s")) {
                if (player.getCurrentRoom().getSouth() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getSouth());
                    System.out.println("You went to " + player.getCurrentRoom());
                } else {
                    System.out.println("You cannot go that way!");
                }
            }

            if (playerInput.equals("go west") || playerInput.equals("w")) {
                if (player.getCurrentRoom().getWest() != null) {
                    player.setCurrentRoom(player.getCurrentRoom().getWest());
                    System.out.println("You went to " + player.getCurrentRoom());
                } else {
                    System.out.println("You cannot go that way!");
                }
            }

            //Look command
            if (playerInput.equals("look")) {
                System.out.println(">You are in " + player.getCurrentRoom());
                System.out.println(player.getCurrentRoom().getDescription());
                System.out.println("Loot: " + player.getCurrentRoom().getLoot());
            }
            //Help command
            if (playerInput.equals("help")) {
                help();
            }
            // Exit command
            if (playerInput.equals("exit")) {
                System.out.println("> You have ended the game");
                break;
            }
            // Show inventory
            if (playerInput.equals("inventory") || playerInput.equals("inv")) {
                System.out.println("Inventory:\n" + player.getInventory());
            }
            // Take item
            if (playerInput.equalsIgnoreCase("take")) {
                player.getCurrentRoom().showLoot();
                System.out.println("What would you like to pick up?");
                itemName = scan.nextLine();
                player.takeItem(itemName);
            }
            // Drop item
            if (playerInput.equalsIgnoreCase("drop")) {
                player.getInventory();
                System.out.println("Which item would you like to drop?");
                itemName = scan.nextLine();
                player.dropItem(itemName);
            }
            // Show Health
            if (playerInput.equalsIgnoreCase("health") || playerInput.equalsIgnoreCase("hp")){
                player.showHealth();
            }
            // Eat food
            if (playerInput.equalsIgnoreCase("eat")) {
                System.out.println("What would you like to eat?" +
                        "\n" + player.getInventory());
                itemName = scan.nextLine();
                player.eatFood(itemName);
            }
            // Equip
            if (playerInput.equalsIgnoreCase("equip")) {
                System.out.println("What would you like to equip?" +
                        "\n" + player.getInventory());
                itemName = scan.nextLine();
                player.equipItem(itemName);
            }
            // Player info
            if (playerInput.equalsIgnoreCase("info")) {
                System.out.println("PlayerName: " + player.getPlayerName());
                System.out.println("HP: " + player.getPlayerHealth());
                System.out.println("Damage: " + player.getDamage());
            }

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