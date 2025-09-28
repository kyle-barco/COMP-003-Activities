package com.num2.eggsInBasket;

import java.util.Scanner;

public class EggsInBasket {
    public static void main(String[] args) {

        int totalEgg, inputEgg, inputBasket, minusTwoEggs, minusTotal;

        Scanner scanNum = new Scanner(System.in);
        System.out.println("\n***** EGGS IN BASKET *****");
        System.out.println("Enter the number of eggs in each basket : ");
        inputEgg = scanNum.nextInt();
        System.out.println("Enter the number of basket : ");
        inputBasket = scanNum.nextInt();

        // conversions
        totalEgg = inputEgg * inputBasket;
        minusTwoEggs = inputEgg - 2;
        minusTotal = minusTwoEggs * inputBasket;

        // result
        System.out.println("\nIf you have");
        System.out.println(inputEgg + " eggs per basket and");
        System.out.println(inputBasket +     " baskets, then");
        System.out.println("the total number of eggs is " + totalEgg + ".");
        System.out.println("Now we take two eggs out of each basket.");
        System.out.println("Now you have");
        System.out.println(minusTwoEggs + " eggs per baskets and");
        System.out.println(inputBasket + " baskets.");
        System.out.println("The new total number of eggs is " + minusTotal);
        System.out.println("\nThank you!");

        System.out.println("\n\nPROGRAMMED BY: KYLE BARCO");
        System.out.println("***** END *****");
    }
}
