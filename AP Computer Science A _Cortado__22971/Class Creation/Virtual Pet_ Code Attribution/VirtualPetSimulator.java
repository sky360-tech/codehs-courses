/*
 * Original code author: Karel the Dog
 * Date accessed and adapted: March 5, 2025
 * Link to original: https://codehs.com/sandbox/curriculum/virtual-pet-java
 * 
 * Adaptation details: 
 * - Added a 'Hygiene' attribute to the VirtualPet class.
 * - Added a 'Clean' option (Choice 4) to the simulator menu.
 * - Updated the game loop to handle the new cleaning mechanic.
 */

import java.util.Scanner;

public class VirtualPetSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name for your virtual pet: ");
        String petName = input.nextLine();
        VirtualPet pet = new VirtualPet(petName);

        System.out.println("Welcome to the Virtual Pet Simulator, " + petName + "!");

        /*
         * Main game loop: 
         * Displays a menu of actions and processes user input to update pet stats.
         * After each action, time passes automatically, randomly degrading stats.
         * The loop terminates if the user chooses 'Exit' or if the pet's 
         * vital stats reach critical levels (running away).
         */
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Clean"); // New Adaptation
            System.out.println("5. Exit");

            int choice = input.nextInt();

            if (choice == 1) {
                pet.feed();
            } else if (choice == 2) {
                pet.play();
            } else if (choice == 3) {
                pet.sleep();
            } else if (choice == 4) {
                pet.clean(); // New Adaptation
            } else if (choice == 5) {
                System.out.println("Exiting program. Goodbye!");
                return;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            // Time passes, affecting stats negatively
            pet.passTime();

            // Check if the pet's needs were neglected enough to trigger a loss state
            if (pet.checkRunAway()) {
                return;
            }
        }
    }
}// reviewed: 2026-06-04
