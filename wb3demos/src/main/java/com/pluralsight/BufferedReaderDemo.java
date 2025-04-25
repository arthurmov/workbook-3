package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        FileReader fr = null;
        try {
            fr = new FileReader("jokes.txt");

            BufferedReader br = new BufferedReader(fr);

            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }

            br.close();    



        } catch (Exception e) {
            System.out.println("Oh no! ERROR!");
        }


    }
}
