package com.num2.divisibleOrNotDivisible;

import java.util.Scanner;

/**
 * Divisible by 5 Checker
 * --------------------------------------------
 * This program asks the user to enter an integer
 * and determines whether it is DIVISIBLE by 5 or NOT.
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class DivisibleOrNotDivisible {
    public static void main(String[] args) {

        // VARIABLES:
        // scannedNum - stores the integer input from the user
        // result     - stores the string message ("DIVISIBLE" or "NOT DIVISIBLE")
        int scannedNum;
        String result;

        // INPUT SCANNER:
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("====================================");
        System.out.println("        Divisible by 5 Checker      ");
        System.out.println("====================================");
        System.out.println("------------------------------------");

        // Prompt user input with aligned colon
        System.out.printf("%-28s: ", "Enter a number");
        scannedNum = scanner.nextInt();

        System.out.println("------------------------------------");

        // LOGIC / CONDITIONAL:
        // Use the modulo operator (%) to check if the number is divisible by 5
        if (scannedNum % 5 == 0) {
            // If the remainder is 0 → the number is divisible by 5
            result = new String("DIVISIBLE");
            System.out.printf("%-28s: %s%n", "Result", result);
        } else {
            // Otherwise → not divisible by 5
            result = new String("NOT DIVISIBLE");
            System.out.printf("%-28s: %s%n", "Result", result);
        }

        System.out.println("====================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
