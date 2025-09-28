/*
Write a program that will convert the input number in feet to inches
 */

package com.num9.convertFeetToInches;

import java.util.Scanner;

public class ConvertFeetToInches {
    public static void main(String[] args) {

        // variables needed
        double inputNum, feet = 12, inches;

        // scan the input
        System.out.println("\n---------- FEET TO INCHES ----------");
        System.out.print("Enter a Feet value : ");
        Scanner scanInput = new Scanner(System.in);
        inputNum = scanInput.nextDouble();

        // covert
        inches = inputNum * feet;

        // OUTPUT
        System.out.println("\n********** RESULT **********");
        System.out.printf("Entered Value    : %.2f", inputNum);
        System.out.printf("\nFeet to Inches   : %.2f", inches);
        // System.out.println("\n----------------------------");

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");
    }


}
