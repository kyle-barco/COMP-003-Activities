/*
Write a program to compute the gross pay of a worker name Juan Dela Cruz given that
Juan Dela Cruz worked for 40 hours at the rate of 215.75.
 */

package com.num3.computeGrossPay;

public class ComputeGrossPay {
    public static void main(String[] args) {
        // System.out.print("Enter a name: ");
        // Scanner inputName = new Scanner(System.in);
        // String name = inputName.nextLine();

        // assigned value of variables needed
        String workerName = "Juan Dela Cruz";
        int workHrs = 40;
        double rate = 215.75, grossPay;

        // computation
        grossPay = rate * workHrs;

        // output
        System.out.println("\n---------- GROSS PAY ----------");
        System.out.println("Worker Name  : " + workerName);
        System.out.println("Work Hours   : " + workHrs);
        System.out.println("Rate         : " + rate);
        System.out.printf("Gross pay    : %.2f", grossPay);

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");

        //System.out.println("Name: " + name);
    }
}
