public class Map {

    Room starterRoom;

    Map() { // Names and descriptions
        Room r1 = new Room("The Great hall", "\nThere are statues on both sides, with paintings on top of the former owners of the manor");
        Room r2 = new Room("The Bed Chambers", "\nThere are four-poster bed and mirror on the side");
        Room r3 = new Room("The Solars", "\nThere is a table and a chair");
        Room r4 = new Room("The Bathroom", "\nThere is a bath and a toilet");
        Room r5 = new Room("The Kitchen", "\nThere is a stove and a pantry");
        Room r6 = new Room("The Gatehouse", "\nThere is an armor of an old knight and a lever");
        Room r7 = new Room("The Chapels", "\nThere is an old coffin with the description: here lies the duke");
        Room r8 = new Room("The Storeroom", "\nThere are a lot of chest");
        Room r9 = new Room("The Guardroom", "\nThere is a tabel with two chairs, and a sword on top on it");

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

    }
}