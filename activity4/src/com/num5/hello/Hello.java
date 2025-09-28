package com.num5.hello;

import java.util.Scanner;

/**
 * Hello Sir or Madam
 * --------------------------------------------------
 * This program asks the user to enter a single letter:
 *   'm' or 'M' -> prints "HELLO SIR"
 *   'f' or 'F' -> prints "HELLO MADAM"
 * Any other letter -> prints an error message
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class Hello {
    public static void main(String[] args) {

        // VARIABLE:
        // scannedChar - stores the single character entered by the user
        char scannedChar;

        // INPUT SCANNER:
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("==============================================");
        System.out.println("              Hello Sir or Madam              ");
        System.out.println("==============================================");
        System.out.println("Valid Letters : 'm' or 'M' (Sir), 'f' or 'F' (Madam)");
        System.out.println("----------------------------------------------");

        // Prompt user with aligned colon
        System.out.printf("%-28s: ", "Enter letter (m/f)");
        scannedChar = scanner.next().charAt(0);  // Read first character of user input

        System.out.println("----------------------------------------------");

        // LOGIC / CONDITIONAL:
        String message;
        if (scannedChar == 'm' || scannedChar == 'M') {
            // If user enters 'm' or 'M'
            message = "HELLO SIR";
        } else if (scannedChar == 'f' || scannedChar == 'F') {
            // If user enters 'f' or 'F'
            message = "HELLO MADAM";
        } else {
            // Handle invalid input (any character other than m/M/f/F)
            message = "Only letters 'm' or 'f', not '" + scannedChar + "'";
        }

        // Display the result with aligned label
        System.out.printf("%-28s: %s%n", "Greeting", message);
        System.out.println("==============================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
