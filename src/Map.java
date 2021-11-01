public class Map {

    public Room starterRoom;
    private Room r1, r2, r3, r4, r5, r6, r7, r8, r9;

    public Map() {
      setupMap();
    }

    public void setupMap(){ // Names and descriptions
         r1 = new Room("The Great hall", "\nThere are statues on both sides, with paintings on top of the former owners of the manor");
         r2 = new Room("The Bed Chambers", "\nThere are four-poster bed and mirror on the side");
         r3 = new Room("The Solars", "\nThere is a table and a chair");
         r4 = new Room("The Bathroom", "\nThere is a bath and a toilet");
         r5 = new Room("The Kitchen", "\nThere is a stove and a pantry");
         r6 = new Room("The Gatehouse", "\nThere is an armor of an old knight and a lever");
         r7 = new Room("The Chapels", "\nThere is an old coffin with the description: here lies the duke");
         r8 = new Room("The Storeroom", "\nThere are a lot of chest");
         r9 = new Room("The Guardroom", "\nThere is a tabel with two chairs, and a sword on top on it");

        // Starter room
        starterRoom = r1;

        // Room connection
        r1.setEast(r2);
        r1.setSouth(r4);
        r2.setWest(r1);
        r2.setEast(r3);
        r3.setWest(r2);
        r3.setSouth(r6);
        r4.setNorth(r1);
        r4.setSouth(r7);
        r5.setSouth(r8);
        r6.setNorth(r3);
        r6.setSouth(r9);
        r7.setNorth(r4);
        r7.setEast(r8);
        r8.setNorth(r5);
        r8.setWest(r7);
        r8.setEast(r9);
        r9.setNorth(r6);
        r9.setWest(r8);

        addItems();
    }
    // Items
    Item bread = new Food("Bread", 15, 1);
    Item apple = new Food("Apple", 5, 1);
    Item rottenTomato = new Food("Rotten Tomato", -25, 1);
    Item rustySword = new MeleeWeapon("Rusty Sword", 15);
    Item healthPotion = new Food("Health Potion", 35, 1);

    //Entities
    Enemy goblin = new Enemy("Goblin", 25, 5);
    Enemy zombie = new Enemy("Zombie", 50, 13);
    Enemy skeleton = new Enemy("Skeleton", 45, 17);

    // Add item to r2
    public void addItems() {
        r1.addItem(rustySword);
        r2.addItem(bread);
        r4.addItem(bread);
        r6.addItem(bread);
        r4.addItem(healthPotion);
        r6.addItem(healthPotion);
        r8.addItem(healthPotion);
        r2.addItem(apple);
        r3.addItem(apple);
        r7.addItem(apple);
        r2.addItem(rottenTomato);
        r1.addItem(rottenTomato);

    }
}