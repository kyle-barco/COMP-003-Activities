/*
Write a program that will compute the sum and product of two input numbers.
 */

package com.num4.computeSumAndProduct;

import java.util.Scanner;

public class ComputeSumAndProduct {
    public static void main(String[] args) {

        // variables needed
        double num1, num2, sum, product;

        // input value
        Scanner inputNum = new Scanner(System.in);
        System.out.println("\n---------- SUM AND PRODUCT ----------");

        // FIRST VALUE
        System.out.print("Enter First Number\t: ");
        num1 = inputNum.nextDouble();

        // SECOND VALUE
        System.out.print("Enter Second Number : ");
        num2 = inputNum.nextDouble();

        // COMPUTATION
        sum = num1 + num2;
        product = num1 * num2;

        // OUTPUT
        System.out.println("\n********** RESULT **********");
        System.out.printf("First Number  : %.2f", num1);
        System.out.printf("\nSecond Number : %.2f", num2);
        // System.out.println("\n----------------------------");

        System.out.printf("\nSum\t\t\t  : %.2f", sum);
        System.out.printf("\nProduct \t  : %.2f", product);

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");

    }
}
