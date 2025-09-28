/*
Write a program that will compute and display the area and perimeter of a rectangle.
Formula: area = length * width and perimeter = 2(length + width)
 */

package com.num8.computeAreaAndPerimeter;

import java.util.Scanner;

public class ComputeAreaAndPerimeter {
    public static void main(String[] args) {

        // variables
        double lenVal, widthVal, areaVal, perimeterVal;

        // Scan Values
        Scanner scanVal = new Scanner(System.in);
        System.out.println("\n---------- COMPUTE AREA & PERIMETER ----------");
        System.out.print("Enter Length Value : ");
        lenVal = scanVal.nextDouble();
        System.out.print("Enter Width Value  : " );
        widthVal = scanVal.nextDouble();

        // calculate area
        areaVal = lenVal * widthVal;

        // calculate perimeter
        perimeterVal = 2 * (lenVal + widthVal);

        // OUTPUT
        System.out.println("\n********** RESULT **********");
        System.out.printf("Length    : %.2f" , lenVal);
        System.out.printf("\nWidth     : %.2f", widthVal);
        System.out.printf("\nArea      : %.2f", areaVal);
        System.out.printf("\nPerimeter : %.2f", perimeterVal);
        // System.out.println("\n----------------------------");

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");
    }
}

