package com.num1.positiveOrNegative;

import java.util.Scanner;

/**
 * Positive or Negative Checker
 * --------------------------------------------
 * This program asks the user to enter an integer
 * and determines whether it is POSITIVE or NEGATIVE.
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class PositiveOrNegative {
    public static void main(String[] args) {

        // VARIABLES:
        // scannedNum - stores the integer input from the user
        // result     - stores the string message ("POSITIVE" or "NEGATIVE")
        int scannedNum;
        String result;

        // INPUT SCANNER:
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("====================================");
        System.out.println("       Positive/Negative Checker    ");
        System.out.println("====================================");
        System.out.println("------------------------------------");

        // Prompt user input with aligned colon
        System.out.printf("%-28s: ", "Enter a number");
        scannedNum = scanner.nextInt();

        System.out.println("------------------------------------");

        // LOGIC / CONDITIONAL:
        // Check if the input number is negative or not
        if (scannedNum < 0) {
            // If less than zero → NEGATIVE
            result = new String("NEGATIVE");
            System.out.printf("%-28s: %s%n", "Result", result);
        } else {
            // Otherwise → POSITIVE (zero counts as positive in this logic)
            result = new String("POSITIVE");
            System.out.printf("%-28s: %s%n", "Result", result);
        }

        System.out.println("====================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
