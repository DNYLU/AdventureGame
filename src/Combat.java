/*
import java.util.Scanner;
import java.util.Random;

// combat fra mit eget Adventure program

public class Combat {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();


    public void combat(Enemy currentEnemy, Player player) {

        boolean running = true;

        while (running) {
            System.out.println("--------------------------------------------------------");

            System.out.println("\t¤ \u001B[33m" + currentEnemy + "\u001B[0m has appeared! ¤\n");

            while (currentEnemy.getHealth() > 1) {
                System.out.println("---------------------------------------");
                System.out.println("\tYour HP: \u001B[31m" + player.getPlayerHealth() + "\u001B[0m");
                System.out.println("\t" + currentEnemy + "'s HP: \u001B[31m" + currentEnemy.getHealth() + "\u001B[0m");
                System.out.println("---------------------------------------");
                System.out.println("\n\tWhat would you like to do?");
                System.out.print("\t1.\u001B[31m Attack\u001B[0m");
                System.out.println("\t2.\u001B[0m Drink health potion\u001B[0m" + "\u001B[31m [" + player.getInventory().contains() + "]\u001B[0m");
                System.out.println("\t3.\u001B[36m Run\u001B[0m");

                String input = scan.nextLine();
                if (input.equals("1")) {
                    // Random damage between 0-50
                    int damageDealt = rand.nextInt(player.get);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    // Enemy damage taken
                    enemyHealth -= damageDealt;
                    // Player damage taken
                    health -= damageTaken;

                    System.out.println("\t> You \u001B[31mstrike\u001B[0m the " + currentEnemy + " for \u001B[31m" + damageDealt + "\u001B[0m damage.");
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
                    System.out.println("\tYou run away from the " + currentEnemy);
                } else {
                    // If user input an invalid command, go back to "2nd" while loop
                    System.out.println("\tInvalid command!");
                }
            }
            if (player.getPlayerHealth() < 1) {
                System.out.println("YOU DIED");
                break;
            }

            System.out.println("--------------------------------------------------------");
            System.out.println(" # " + currentEnemy + " was \u001B[31mdefeated!\u001B[0m #");
            System.out.println(" # You have " + health + "HP left. #");

            // Line 21. Health pot drop chance = 50%
            if (rand.nextInt(100) < healthPotionDropChance) {
                numHealthPots++;
                System.out.println("# The " + currentEnemy + " dropped a health hotion. #");
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
