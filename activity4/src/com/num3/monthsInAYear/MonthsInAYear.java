package com.num3.monthsInAYear;

import java.util.Scanner;

/**
 * Months in a Year
 * --------------------------------------------------
 * This program asks the user to enter a number (1–12)
 * and displays the corresponding month name.
 * If the input is outside 1–12, it shows an error message.
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class MonthsInAYear {
    public static void main(String[] args) {

        // VARIABLES:
        // scannedNum - stores the number input by the user (1–12)
        // result     - stores the month name or an error message
        int scannedNum;
        String result;

        // INPUT SCANNER:
        Scanner scanner = new Scanner(System.in);

        // ===== Program Title & Instructions =====
        System.out.println("==============================================");
        System.out.println("              Months in a Year               ");
        System.out.println("==============================================");
        System.out.println("Valid Numbers : 1 to 12");
        System.out.println("----------------------------------------------");

        // Prompt user with aligned colon
        System.out.printf("%-28s: ", "Enter a number from 1-12");
        scannedNum = scanner.nextInt();

        System.out.println("----------------------------------------------");

        // LOGIC / SWITCH STATEMENT:
        switch (scannedNum) {
            case 1:  result = "January";    break;
            case 2:  result = "February";   break;
            case 3:  result = "March";      break;
            case 4:  result = "April";      break;
            case 5:  result = "May";        break;
            case 6:  result = "June";       break;
            case 7:  result = "July";       break;
            case 8:  result = "August";     break;
            case 9:  result = "September";  break;
            case 10: result = "October";    break;
            case 11: result = "November";   break;
            case 12: result = "December";   break;
            default: result = "Only numbers 1–12 please!";
        }

        // Display result with aligned label
        System.out.printf("%-28s: %s%n", "Month", result);
        System.out.println("==============================================");

        // Close the scanner to free system resources
        scanner.close();
    }
}
