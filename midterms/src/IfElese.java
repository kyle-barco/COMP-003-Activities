import java.util.Scanner;

public class IfElese {
    // dividing the employees transaction dollar
        // dollar value / num of transactions = res / num of shift worked

    public static void main(String[] args) {
        String employeeName;
        double dollarVal = 0, numOfTransac = 0, numOfShiftWorked = 0 , res = 0, productScore = 0, bonus = 0;

        Scanner scan = new Scanner(System.in);
        System.out.printf("%-28s: ", "EMPLOYEE'S NAME" );
        employeeName = scan.next();

        System.out.printf("%-28s: ", "NUMBER OF SHIFTS" );
        numOfShiftWorked = scan.nextDouble();

        System.out.printf("%-28s: ", "NUMBER OF TRANSACTION" );
        numOfTransac = scan.nextDouble();

        System.out.printf("%-28s: ", "TRANSACTION DOLLAR VALUE" );
        dollarVal = scan.nextDouble();

        // calculate productivity score
        res  = dollarVal / numOfTransac;
        productScore = res / numOfShiftWorked;

        if(productScore <= 30) {
            bonus = 50;
        } else if (productScore >= 31 && productScore <= 69) {
            bonus = 75;
        } else if (productScore >= 70 && productScore <= 199) {
            bonus = 100;
        } else if (productScore >= 200 ) {
            bonus = 200;
        } else {
            bonus = 0;
        }
        //System.out.printf("%-28s: ", "EMPLOYEE'S NAME", employeeName );
        //System.out.printf("%-28s: ", "EMPLOYEE'S NAME", bonus );

        System.out.println("\tEMPLOYEE'S NAME:\t " + employeeName);
        System.out.println("\tEMPLOYEES BONUS:\t $" + bonus);
    }
}
