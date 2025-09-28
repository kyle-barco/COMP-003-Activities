/*
Write a program that will compute the average grade of the student based on the three-
grading system. Prelim 85, Midterm 93 and Final 87.
 */

package com.num5.computeAvg;

public class ComputeAvg {
    public static void main(String[] args) {

        // grades and avg variables
        double prelim = 85, midterm = 93, finals = 87, avg;

        // compute average
        avg = (prelim + midterm + finals) / 3;

        // OUTPUT
        System.out.println("\n********** RESULT **********");
        System.out.printf("Prelim  : %.2f", prelim);
        System.out.printf("\nMidterm : %.2f", midterm);
        System.out.printf("\nFinals  : %.2f", finals);
        // System.out.println("\n----------------------------");

        System.out.printf("\nAverage : %.2f", avg);

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");
    }
}
