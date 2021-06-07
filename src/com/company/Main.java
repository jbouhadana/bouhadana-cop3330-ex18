/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n");

        String sonk = jb.nextLine();

        // formula for C to F
        if(sonk.equalsIgnoreCase("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int tempF = jb.nextInt();
            double tempC = (tempF - 32.0) * 5.0 / 9.0;
            System.out.print("The temperature in Celsius is " + tempC);
        }

        // formula for F to C
        if(sonk.equalsIgnoreCase("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            int tempC = jb.nextInt();
            double tempF = (tempC * 9.0 / 5.0) + 32.0;
            System.out.print("The temperature in Fahrenheit is " + tempF);
        }
    }
}
