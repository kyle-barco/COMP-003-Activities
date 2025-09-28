package com.num4.milkCarton;

import java.util.Scanner;

public class MilkCarton {
    public static void main(String[] args) {
        double CARTON_CAPACITY = 3.78, COST_PER_LITER = 0.38, PROFIT_PER_CARTON = 0.27, costOfProducing, profitProducingMilk;
        int milkCartonsNeed;

        Scanner scan = new Scanner(System.in);
        System.out.println("\n***** MILK CARTON *****");
        System.out.print("Enter the total amount of milk produced in the morning : $");
        double milkAmt = scan.nextDouble();

        // milk cartons needed to hold milk.
        milkCartonsNeed = (int) Math.ceil(milkAmt / CARTON_CAPACITY);

        // cost of producing milk
        costOfProducing = milkAmt * COST_PER_LITER;

        // profit for producing milk
        profitProducingMilk = milkCartonsNeed * PROFIT_PER_CARTON;

        // result
        System.out.println("\nNumber of cartons needed         : " + milkCartonsNeed);
        System.out.printf("The cost of producing milk       : %.2f", costOfProducing);
        System.out.printf("\nThe profit of producing milk     : %.2f", profitProducingMilk);
        System.out.println("\n\nPROGRAMMED BY: KYLE BARCO");
        System.out.println("***** END *****");
    }
}
