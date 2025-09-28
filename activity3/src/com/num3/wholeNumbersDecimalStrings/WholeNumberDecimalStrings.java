package com.num3.wholeNumbersDecimalStrings;

import java.util.Scanner;

public class WholeNumberDecimalStrings {
    public static void main(String[] args) {
        int intNum1, intNum2;
        double decNum1, decNum2;
        String word1, word2, phrase;

        Scanner scanNum = new Scanner(System.in);
        System.out.println("\n***** WHOLE NUMBER, DECIMAL NUMBER AND STRINGS *****");

        // integer
        System.out.println("Enter the whole numbers separated by one or more spaces : ");
        intNum1 = scanNum.nextInt();
        intNum2 = scanNum.nextInt();
        System.out.println("You entered " + intNum1 + " and " + intNum2 + "." );

        // decimal
        System.out.println("Next enter two numbers.");
        System.out.println("A decimal point is okay.");
        decNum1 = scanNum.nextDouble();
        decNum2 = scanNum.nextDouble();
        System.out.println("You entered " + decNum1 + " and " + decNum2);

        // words
        System.out.println("Next enter two words: ");
        word1 = scanNum.next();
        word2 = scanNum.next();
        scanNum.nextLine();
        System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\"");

        // phrase
        System.out.println("Next enter a line of text: ");
        phrase = scanNum.nextLine();
        System.out.println("You entered \"" + phrase + "\"");

        System.out.println("\n\nPROGRAMMED BY: KYLE BARCO");
        System.out.println("***** END *****");
    }
}
