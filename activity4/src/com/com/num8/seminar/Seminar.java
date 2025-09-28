package com.com.num8.seminar;

import java.util.Scanner;

/**
 * Seminar Fee Calculator
 * --------------------------------------------------
 * This program calculates the total fee for a seminar
 * based on the number of attendees.
 *
 * Pricing Rules:
 *   • 1–4 people  → 500 pesos per person
 *   • 5–10 people → 400 pesos per person
 *   • 11 or more  → 300 pesos per person
 *   • 0 or negative → Invalid input
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class Seminar {
    public static void main(String[] args) {

        // VARIABLES:
        // numberOfPeople - stores the number of attendees
        // totalFee       - stores the computed total seminar fee
        int numberOfPeople, totalFee;

        // INPUT SCANNER:
        Scanner scanner = new Scanner(System.in);

        // ===== Program Header =====
        System.out.println("==============================================");
        System.out.println("             Seminar Fee Calculator           ");
        System.out.println("==============================================");

        // Prompt user with aligned colon
        System.out.printf("%-28s: ", "How many people will attend");
        numberOfPeople = scanner.nextInt();

        System.out.println("----------------------------------------------");

        // LOGIC:
        // Determine the rate and calculate total fee based on group size
        if (numberOfPeople >= 1 && numberOfPeople <= 4) {
            // Case 1: 1–4 people → 500 pesos each
            totalFee = numberOfPeople * 500;
            System.out.printf("%-28s: %d pesos%n", "Total amount to pay", totalFee);
        } else if (numberOfPeople >= 5 && numberOfPeople <= 10) {
            // Case 2: 5–10 people → 400 pesos each
            totalFee = numberOfPeople * 400;
            System.out.printf("%-28s: %d pesos%n", "Total amount to pay", totalFee);
        } else if (numberOfPeople >= 11) {
            // Case 3: 11 or more people → 300 pesos each
            totalFee = numberOfPeople * 300;
            System.out.printf("%-28s: %d pesos%n", "Total amount to pay", totalFee);
        } else {
            // Case 4: Invalid input (zero or negative number)
            System.out.printf("%-28s: %s%n", "Error", "Invalid input. Please enter a positive number.");
        }

        System.out.println("==============================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
