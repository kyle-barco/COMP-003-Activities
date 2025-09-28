package com.num7.vote;

import java.util.Scanner;

/**
 * Voting Eligibility Checker
 * --------------------------------------------------
 * This program asks the user to enter their age
 * and determines whether they are qualified to vote.
 * Rule:
 *   Age 18 or older → Qualified
 *   Below 18       → Not qualified
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class Vote {
    public static void main(String[] args) {

        // VARIABLE:
        // scannedNum - stores the age entered by the user
        int scannedNum;

        // INPUT SCANNER:
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("==============================================");
        System.out.println("           Voting Eligibility Checker          ");
        System.out.println("==============================================");

        // Prompt user with aligned colon
        System.out.printf("%-28s: ", "Enter your age");
        scannedNum = scanner.nextInt();

        System.out.println("----------------------------------------------");

        // AGE LOGIC:
        String result;
        if (scannedNum < 18) {
            // If age is less than 18 → not qualified to vote
            result = "YOU ARE NOT QUALIFIED TO VOTE";
        } else {
            // If age is 18 or above → qualified to vote
            result = "YOU ARE QUALIFIED TO VOTE";
        }

        // Display result with aligned label
        System.out.printf("%-28s: %s%n", "Voting Status", result);
        System.out.println("==============================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
