/*
Write a program that will accept two numbers and then swap the arrangement of the two
numbers
 */

package com.num6.swapArrangement;

import java.util.Scanner;

public class SwapArrangement {
    public static void main(String[] args) {

        // needed variables and value
        int xVal, yVal, temp;

        // scan the inputted value
        System.out.println("\n---------- SWAP ARRANGEMENT ----------");
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter Value of x: ");
        xVal = scanInput.nextInt();
        System.out.print("Enter Value of y: ");
        yVal = scanInput.nextInt();

        System.out.println("\n********** RESULT **********");
        System.out.println("Before Swapping : x = " + xVal + "; y = " + yVal);

        // swapping
        temp = xVal;
        xVal = yVal;
        yVal = temp;

        System.out.println("After Swapping  : x = " + xVal + "; y = " + yVal);

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");
    }
}
