package com.pluralsight;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String userInput;

        System.out.println("\n• Goldilocks" +
                "\n• Hansel and Gretel" +
                "\n• Mary had a Little Lamb\n" +
                "\nEnter the name of a story: ");
        userInput = scanner.nextLine();

        switch (userInput) {
            case "goldilocks":
                readGoldilocks();
                break;
            case "hansel and gretel":
                readHanselAndGretel();
            case "mary had a little lamb":
                readMaryHadALittleLamb();
        }


    }

    public static void readGoldilocks() {

    }

    public static void readHanselAndGretel() {

    }

    public static void readMaryHadALittleLamb() {

    }
}