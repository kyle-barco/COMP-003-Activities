package com.com.num4.temperature;

import java.util.Scanner;

/**
 * Temperature State Checker
 * --------------------------------------------------
 * This program reads a temperature (in °C) from the user
 * and determines whether it is:
 *   ICE   -> less than 0°C
 *   WATER -> between 0°C and 100°C (inclusive)
 *   STEAM -> greater than 100°C
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class Temperature {
    public static void main(String[] args) {

        // VARIABLE:
        // scannedNum - stores the temperature value entered by the user
        double scannedNum;

        // INPUT SCANNER:
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("==============================================");
        System.out.println("           Temperature State Checker          ");
        System.out.println("==============================================");
        System.out.println("Classification : ICE (<0°C), WATER (0–100°C), STEAM (>100°C)");
        System.out.println("----------------------------------------------");

        // Prompt user with aligned colon
        System.out.printf("%-28s: ", "Enter a temperature (°C)");
        scannedNum = scanner.nextDouble();

        System.out.println("----------------------------------------------");

        // LOGIC / CONDITIONAL:
        String state;
        if (scannedNum < 0) {
            // Below 0°C → ICE
            state = "ICE";
        } else if (scannedNum <= 100) {
            // Between 0°C and 100°C → WATER
            state = "WATER";
        } else {
            // Above 100°C → STEAM
            state = "STEAM";
        }

        // Display the result with aligned label
        System.out.printf("%-28s: %s%n", "Water State", state);
        System.out.println("==============================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
