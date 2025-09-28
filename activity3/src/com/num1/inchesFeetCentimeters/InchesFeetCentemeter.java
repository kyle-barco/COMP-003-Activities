package com.num1.inchesFeetCentimeters;

import java.util.Scanner;

public class InchesFeetCentemeter {
    public static void main(String[] args) {

        double feetRes, cenRes;

        Scanner inchInput = new Scanner(System.in);
        System.out.println("\n***** INCHES, FEET AND CENTIMETER *****");
        System.out.print("ENTER MEASUREMENT IN INCHES : ");
        double inchVal = inchInput.nextDouble();

        // conversions
        feetRes = inchVal / 12;
        cenRes = inchVal * 2.54;

        // result
        System.out.printf("EQUIVALENT IN FEET          : %.2f",  feetRes);
        System.out.printf("\nEQUIVALENT IN CENTIMETERS   : %.2f",  cenRes);

        System.out.println("\n\nPROGRAMMED BY: KYLE BARCO");
        System.out.println("***** END *****");
    }
}
