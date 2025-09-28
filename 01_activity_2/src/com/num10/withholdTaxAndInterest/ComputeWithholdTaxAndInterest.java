/*
Mary deposited her money of 250000php at a bank. The bank gave her 12% for a term
of 30 days. There is a 10% withholding tax to be deducted from the interest.
a. Find her withholding tax
b. Find the net interest, she will receive.
Use the following formula: I = PRT where, I-interest, P-principal value, R-rate of
Interest and T-time.
 */
package com.num10.withholdTaxAndInterest;

public class ComputeWithholdTaxAndInterest {
    public static void main(String[] args) {

        // needed variables
        double deposit = 250000, rate = 0.12, days = 30, wht = 0.10, whtRes, interest, netInterest, time;

        // computation of time
        time = days / 365;

        // computation of net income
        interest = (deposit * rate * time);

        // computation of withholding tax
        whtRes = interest * wht ;

        // computation of net interest
        netInterest = interest - whtRes;

        // OUTPUT
        System.out.println("\n********** RESULT **********");
        System.out.printf("Gross Interest     : %.2f", interest);
        System.out.printf("\nWithholding Tax    : %.2f", wht);
        System.out.printf("\nNet Interest       : %.2f", netInterest);

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");
    }
}
