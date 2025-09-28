package com.num10.letterGrade;

import java.util.Scanner;

/**
 * Display Letter Grade Program
 * --------------------------------------------------
 * This program displays a descriptive remark
 * based on the letter grade entered by the user.
 *
 * Grade Table:
 *   • A → EXCELLENT
 *   • B → ABOVE AVERAGE
 *   • C → AVERAGE
 *   • D → BELOW AVERAGE
 *   • F → FAILED
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class DisplayLetterGrade {
    public static void main(String[] args) {

        // VARIABLE:
        // letterGrade - stores the letter grade entered by the user
        char letterGrade;

        // INPUT SCANNER:
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("====================================");
        System.out.println("         Display Letter Grade       ");
        System.out.println("====================================");
        System.out.println("Valid Letter Grades: A, B, C, D, F ");
        System.out.println("------------------------------------");

        // Prompt user input with aligned colon
        System.out.printf("%-28s: ", "Enter a Letter Grade");
        letterGrade = scanner.next().toUpperCase().charAt(0); // Accept lower/upper case

        System.out.println("------------------------------------");

        // LOGIC:
        // Determine and display the corresponding remark
        switch (letterGrade) {
            case 'A' -> System.out.printf("%-28s: %s%n", "Result", "EXCELLENT");
            case 'B' -> System.out.printf("%-28s: %s%n", "Result", "ABOVE AVERAGE");
            case 'C' -> System.out.printf("%-28s: %s%n", "Result", "AVERAGE");
            case 'D' -> System.out.printf("%-28s: %s%n", "Result", "BELOW AVERAGE");
            case 'F' -> System.out.printf("%-28s: %s%n", "Result", "FAILED");
            default  -> System.out.printf("%-28s: %s%n", "Result", "Enter a valid Letter Grade");
        }

        System.out.println("====================================");

        // Close the scanner to free resources
        scanner.close();
    }
}
