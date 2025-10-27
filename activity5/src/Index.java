import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        //NumberSeven();
        NumberEight();
    }

    public static void NumberEight() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void NumberSeven() {
        int num1, num2, sum;
        char charDesi = ' ';

        do {
            System.out.print("\nEnter Num 1: ");
            Scanner scan = new Scanner(System.in);
            num1 = scan.nextInt();
            System.out.print("Enter Num 2: ");
            num2 = scan.nextInt();

            sum = num1 + num2;
            System.out.println("Sum       : " + sum);
            System.out.print("PROCESS ANOTHER (Y/N)?: ");
            charDesi = scan.next().charAt(0);
        } while (charDesi == 'y' || charDesi == 'Y');
        System.out.print("Thank you!");
    }

    public static void NumberSix() {
        System.out.print("Input a positive integer: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (isPrimeHandler(number)) {
            System.out.println(number + " is Prime Number!");
        } else {
            System.out.println(number + " is NOT Prime Number!");

        }
    }

    public static boolean isPrimeHandler(int num) {
        if (num <= 1) {
           return false;
        }
        for (int i = 2; i * i <=  num; i++ ) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void NumberFour() {
        String numStr = "";
        int evenSum = 0, oddSum = 0;
        System.out.print("Input a number: ");
        Scanner scan = new Scanner(System.in);
        numStr = scan.nextLine();

        for (int i = 0; i < numStr.length(); i++) {
            int num = numStr.charAt(i) - '0';
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }

    public static void NumberThree() {
        String numStr = "", reverse = "";
        System.out.print("Input a integer: ");
        Scanner scan = new Scanner(System.in);
        numStr = scan.nextLine();

        System.out.println("Before: " + numStr);
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reverse += numStr.charAt(i);
        }

        System.out.println("After: " + reverse);
    }

    public static void NumberTwo() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void NumberOne() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
