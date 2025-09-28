package com.num5.summerJob;

import java.util.Scanner;

public class SummerJob {
    public static void main(String[] args) {
        int sjDuration = 5;
        double  TOTAL_TAX = 0.14, SPEND = 0.10,
                SCHOOL_SUPPLY = 0.01, BONDS = 0.25, PARENTS = 0.50,
                payRate, numOfHrs, incomeBeforeTax, incomeAfterTax;

        Scanner scan = new Scanner(System.in);
        System.out.println("\n***** SUMMER JOB *****");
        System.out.printf("%-44s : ", "Enter the pay rate for an hour");
        payRate = scan.nextDouble();
        System.out.printf("%-35s : ", "Enter the number of hours you work each week");
        numOfHrs = scan.nextDouble();

        // computations
        incomeBeforeTax = payRate * numOfHrs * sjDuration;
        double tax = incomeBeforeTax * TOTAL_TAX;
        incomeAfterTax = incomeBeforeTax - tax;

        double spendsClothes = incomeAfterTax * SPEND;
        double spendSchool = incomeAfterTax * SCHOOL_SUPPLY;

        double remain = incomeAfterTax - spendsClothes - spendSchool;
        double spendsBonds = remain * BONDS;
        double parentBonds = remain * PARENTS;

        // result
        System.out.printf("%-44s : %10.2f%n", "Income before taxes", incomeBeforeTax);
        System.out.printf("%-44s : %10.2f%n", "Income after taxes", incomeAfterTax);
        System.out.printf("%-44s : %10.2f%n", "Money spent on clothes & accessories", spendsClothes);
        System.out.printf("%-44s : %10.2f%n", "Money spent on school supplies", spendSchool);
        System.out.printf("%-44s : %10.2f%n", "Money spent on savings bonds", spendsBonds);
        System.out.printf("%-44s : %10.2f%n", "Parents' contribution to bonds", parentBonds);

        System.out.println("\n\nPROGRAMMED BY: KYLE BARCO");
        System.out.println("***** END *****");
    }
}
