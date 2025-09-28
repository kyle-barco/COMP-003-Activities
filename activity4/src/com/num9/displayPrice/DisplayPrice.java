package com.num9.displayPrice;

import java.util.Scanner;

/**
 * Display Price Program
 * --------------------------------------------------
 * This program displays the price of a product
 * based on the entered product ID.
 *
 * Price Table:
 *   • ID 1        → 50.55
 *   • ID 2 or 9   → 12.35
 *   • ID 5, 7, 11 → 11.46
 *   • Others      → Invalid input
 *
 * Author: Kyle Barco
 * Date: 2025-09-28
 */
public class DisplayPrice {
    public static void main(String[] args) {

        int productId;
        double priceOne = 50.55,
                priceTwoAndNine = 12.35,
                priceFiveSevenEleven = 11.46;

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("          Display Price Program     ");
        System.out.println("====================================");
        System.out.println("Valid Product IDs: 1, 2, 5, 7, 9, 11");
        System.out.println("------------------------------------");

        // Prompt with aligned colon
        System.out.printf("%-28s: ", "Enter a product ID number");
        productId = scanner.nextInt();

        System.out.println("------------------------------------");

        // Output header with aligned colon
        System.out.printf("%-28s: ", "Product ID");
        System.out.printf("%d%n", productId);

        switch (productId) {
            case 1 -> System.out.printf("%-28s: ₱%.2f%n", "Price", priceOne);
            case 2, 9 -> System.out.printf("%-28s: ₱%.2f%n", "Price", priceTwoAndNine);
            case 5, 7, 11 -> System.out.printf("%-28s: ₱%.2f%n", "Price", priceFiveSevenEleven);
            default -> System.out.println("Invalid input. Please enter one of the valid IDs: 1, 2, 5, 7, 9, or 11.");
        }

        System.out.println("====================================");

        scanner.close();
    }
}
