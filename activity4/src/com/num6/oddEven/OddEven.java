package com.num6.oddEven;

import java.util.Scanner;

/**
 * Odd or Even Number Checker
 * --------------------------------------------------
 * This program asks the user to enter a number and
 * determines whether it is ODD or EVEN.
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class OddEven {
    public static void main(String[] args) {

        // VARIABLE:
        // scannedNum - stores the number entered by the user
        // NOTE: double is used, but integers are typically expected for odd/even checks
        double scannedNum;

        // INPUT SCANNER:
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("==============================================");
        System.out.println("           Odd or Even Number Checker         ");
        System.out.println("==============================================");

        // Prompt user with aligned colon
        System.out.printf("%-28s: ", "Enter a NUMBER");
        scannedNum = scanner.nextDouble();

        System.out.println("----------------------------------------------");

        // ODD/EVEN LOGIC:
        String result;
        if (scannedNum % 2 == 0) {
            // If remainder is 0 → number is EVEN
            result = "EVEN";
        } else {
            // Otherwise → number is ODD
            result = "ODD";
        }

        // Display the result with aligned label
        System.out.printf("%-28s: %s%n", "The number is", result);
        System.out.println("==============================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
