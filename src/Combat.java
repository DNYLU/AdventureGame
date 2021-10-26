/*import java.util.Scanner;
import java.util.Random;

// ADVENTUREGAME PRIVATE
// 1. Assign "GAME" for defined rooms or randomized rooms

public class Combat {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    enum enemies {
        ZOMBIE, SKELETON;
    }

    public void combat() {

        // Game variables
        String[] enemies = {"Zombie", "Skeleton"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;


        // Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPots = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; // Percentage

        boolean running = true;

        GAME:
        while (running) {
            System.out.println("--------------------------------------------------------");

            // Enemy health = random number between ?-maxEnemyHealth (75)
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            // Random enemy from 0-3 ("Skeleton", "Zombie", "Ghost", "Witch")
            String enemy = enemies[rand.nextInt(enemies.length)];
            // Example:             # Skeleton has appeared! #
            System.out.println("\t¤ \u001B[33m" + enemy + "\u001B[0m has appeared! ¤\n");

            while (enemyHealth > 0) {
                System.out.println("---------------------------------------");
                System.out.println("\tYour HP: \u001B[31m" + health + "\u001B[0m");
                System.out.println("\t" + enemy + "'s HP: \u001B[31m" + enemyHealth + "\u001B[0m");
                System.out.println("---------------------------------------");
                System.out.println("\n\tWhat would you like to do?");
                System.out.print("\t1.\u001B[31m Attack\u001B[0m");
                System.out.println("\t2.\u001B[0m Drink health potion\u001B[0m" + "\u001B[31m [" + numHealthPots + "]\u001B[0m");
                System.out.println("\t3.\u001B[36m Run\u001B[0m");

                String input = scan.nextLine();
                if (input.equals("1")) {
                    // Random damage between 0-50
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    // Enemy damage taken
                    enemyHealth -= damageDealt;
                    // Player damage taken
                    health -= damageTaken;

                    System.out.println("\t> You \u001B[31mstrike\u001B[0m the " + enemy + " for \u001B[31m" + damageDealt + "\u001B[0m damage.");
                    System.out.println("\t> You receive \u001B[31m" + damageTaken + "\u001B[0m in retaliation.");

                    if (health < 1) {
                        System.out.println("\t\u001B[31mYOU DIED");
                        break;
                    }
                } else if (input.equals("2")) {
                    if (numHealthPots > 0) {
                        // Add amount player is healed for (30 atm)
                        health += healthPotionHealAmount;
                        numHealthPots--;
                        System.out.println("\t> You drink a health potion, healing yourself for \u001B[31m" + healthPotionHealAmount + "\u001B[0mHP.");
                        System.out.println("\t> Your HP is now: \u001B[31m" + health + ".");
                        System.out.println("\t> You have \u001B[31m" + numHealthPots + "\u001B[0m health potions left.");
                    } else {
                        System.out.println("\t> You have no health potions left!");
                    }
                } else if (input.equals("3")) {
                    System.out.println("\tYou run away from the " + enemy);
                    // Skips everything beneath and continuing from GAME loop
                    continue GAME;
                } else {
                    // If user input an invalid command, go back to "2nd" while loop
                    System.out.println("\tInvalid command!");
                }
            }
            if (health < 1) {
                System.out.println("YOU DIED");
                break;
            }

            System.out.println("--------------------------------------------------------");
            System.out.println(" # " + enemy + " was \u001B[31mdefeated!\u001B[0m #");
            System.out.println(" # You have " + health + "HP left. #");

            // Line 21. Health pot drop chance = 50%
            if (rand.nextInt(100) < healthPotionDropChance) {
                numHealthPots++;
                System.out.println("# The " + enemy + " dropped a health hotion. #");
                System.out.println("# You have \u001B[31m" + numHealthPots + "\u001B[0m health potions. #");
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting?");
            System.out.println("2. Exit dungeon");

            String input = scan.nextLine();

            // Invalid command
            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = scan.nextLine();
            }
            // Use generic menu assignment
            if (input.equals("1")) {
                System.out.println("You continue on your adventure!");
            } else if (input.equals("2")) {
                System.out.println("You exit the dungeon safely");
                break;
            }
        }
        System.out.println("######################");
    }
}
*/