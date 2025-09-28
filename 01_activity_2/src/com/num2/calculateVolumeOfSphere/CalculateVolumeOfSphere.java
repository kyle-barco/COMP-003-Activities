/*
Write a program to calculate the volume of a sphere. Then display the result. Use the
following formula: vsphere = 4/3 π r3
* */

package com.num2.calculateVolumeOfSphere;

import java.util.Scanner;

public class CalculateVolumeOfSphere {
    public static void main(String[] args) {

        // userInput and prompt
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n---------- VOLUME OF SPHERE ----------");
        System.out.print("Enter a value: ");
        double r = userInput.nextDouble();

        // computation
        double vSphere = (4/3 * Math.PI * Math.pow(r,3));

        // formating
        String vSphereMsg = String.format("%.2f", vSphere);

        // output
        System.out.println("\n********** RESULT **********");
        System.out.printf("Inputted Value   : %.2f", r);
        System.out.println("\nVolume of Sphere : " + vSphereMsg);

        System.out.println("\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");

    }
}


