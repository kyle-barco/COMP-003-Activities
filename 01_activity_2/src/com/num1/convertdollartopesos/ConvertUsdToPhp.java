/*
Write a program to convert the input dollar (4) into its peso equivalent. Presume that
one dollar is equivalent to 50.75. Then display the result on the screen.
*/

package com.num1.convertdollartopesos;

import java.util.Scanner;

public class ConvertUsdToPhp {
    public static void main(String[] args) {
        // result and peso value variable
        double res, peso = 50.75f;

        // variable of scanner and the input value
        Scanner scanDollar = new Scanner(System.in);
        System.out.println("\n---------- DOLLAR TO PESO ----------");
        System.out.print("Enter dollar value: ");
        double userInput = scanDollar.nextDouble();

        // convert
        res = userInput * peso;

        // message formating
        String msg = String.format("%.2f", userInput);
        String resMsg = String.format("%.2f", res);

        // output
        System.out.println("\n********** RESULT **********");
        System.out.println("Inputted Value  : $" + msg);
        System.out.println("Exchange Rate   : ₱" + peso);
        System.out.println("Peso Conversion : ₱" + resMsg);

        System.out.println("\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");
    }
}