package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        String userInput2 = "";

        Random random = new Random();


        String[] famousQuotes = new String[10];

        famousQuotes[0] = "Be the change that you wish to see in the world.";
        famousQuotes[1] = "The only thing we have to fear is fear itself.";
        famousQuotes[2] = "I think, therefore I am.";
        famousQuotes[3] = "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.";
        famousQuotes[4] = "Success is not final, failure is not fatal: It is the courage to continue that counts.";
        famousQuotes[5] = "You miss 100% of the shots you don’t take.";
        famousQuotes[6] = "Not everything that is faced can be changed, but nothing can be changed until it is faced.";
        famousQuotes[7] = "It does not do to dwell on dreams and forget to live.";
        famousQuotes[8] = "The future belongs to those who believe in the beauty of their dreams.";
        famousQuotes[9] = "Imagination is more important than knowledge.";


        System.out.println("\nPick a number from 1-10: ");
        System.out.println("(Or 0 to Exit)");
        userInput = scanner.nextInt();
        scanner.nextLine();

        if (userInput != 0) {
            for (int i = 0; i < famousQuotes.length; i++) {
                if (userInput == i) {
                    System.out.println(famousQuotes[i - 1]);
                }
            }

            do {
                System.out.println("\nWould you like to pick another quote? (Y/N)");
                userInput2 = scanner.nextLine();

                switch (userInput2) {
                    case "y":
                        System.out.println("Pick C to choose a quote, or R to see a random quote: ");
                        userInput2 = scanner.nextLine();

                        if (userInput2.equalsIgnoreCase("C")) {
                            continue;
                        } else if (userInput2.equalsIgnoreCase("R")) {
                            int randomIndex = random.nextInt(famousQuotes.length);
                            System.out.println("\nRandom quote: \n" + famousQuotes[randomIndex]);
                        }
                    case "n":
                        break;
                }


            } while (!userInput2.equalsIgnoreCase("n")) ;
        }
    }

}