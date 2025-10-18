import java.util.Scanner;

public class quiz1num2 {
    public static void main(String[] args) {
        // inputs
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int employeeNumber = scan.nextInt();

        System.out.print("Enter employee name: ");
        String employeeName = scan.next();

        System.out.print("Enter basic pay: ");
        double basicPay = scan.nextDouble();

        System.out.print("Enter overtime pay: ");
        double overTimePay = scan.nextDouble();


        // computation
        double grossPay = basicPay + overTimePay;
        double sssGrossPay = grossPay * 0.05;
        double  philHealth = grossPay * 0.04;
        double  tax = grossPay * 0.1;

        double  taxDeduction = sssGrossPay + philHealth + tax ;
        double  netPay = grossPay - taxDeduction;

        System.out.print("\n\nEMPLOYEE NO    : " + employeeNumber);
        System.out.print("\nEMPLOYEE NAME  : " + employeeName);
        System.out.print("\nBASIC PAY      : " + basicPay);
        System.out.print("\nOVERTIME PAY   : " + overTimePay);
        System.out.print("\nGROSS PAY      : " + grossPay);
        System.out.print("\nSSS            : " + sssGrossPay);
        System.out.print("\nPHILHEALTH     : " + philHealth);
        System.out.print("\nTAX            : " + tax);
        System.out.print("\nTAX DEDUCTION  : " + taxDeduction);
        System.out.print("\nNET PAY        : " + netPay);




        System.out.println("\n\nPROGRAMMED BY: KYLE BARCO");



    }



}
