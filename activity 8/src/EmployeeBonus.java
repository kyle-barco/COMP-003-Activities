import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        num1();
//        num2();
    }

    public static void num1() {
        int yrsInService, empNum;
        String empName = "";
        char ans;
        double bonus = 0;
        int[] arrYrsInService = {20, 25, 30, 35};

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("EMPLOYEE NUMBER : ");
            empNum = scan.nextInt();

            System.out.print("EMPLOYEE NAME   : ");
            empName = scan.next();

            System.out.print("YEARS OF SERVICE: ");
            yrsInService = scan.nextInt();

            if (yrsInService == arrYrsInService[0]) {
                bonus = 20000;
                System.out.print("BONUS           : " + bonus);

            } else if (yrsInService == arrYrsInService[1]) {
                bonus = 25000;
                System.out.print("BONUS           : " + bonus);

            } else if ( yrsInService == arrYrsInService[2]) {
                bonus = 30000;
                System.out.print("BONUS           : " + bonus);

            } else if (yrsInService == arrYrsInService[3]) {
                bonus = 35000;
                System.out.print("BONUS           : " + bonus);

            } else {
                System.out.print("INVALID INPUT");
            }

            System.out.print("\n\nPROGRAMMED BY   : KYLE BARCO");
            System.out.print("\n\nPROCESS ANOTHER? (Y or X)");
            ans = scan.next().charAt(0);

        } while (ans == 'y' || ans == 'Y');
    }

    public static void num2() {
        int numOfBags;
        double  COST = 5.50, totalCost = 0, discount = 0, totalCharge = 0;
        char ans;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("NUMBER OF BAGS ORDERED : ");
            numOfBags = scan.nextInt();

            //System.out.print("TOTAL COST   : ");
            //totalCost = scan.nextDouble();
            totalCost = COST * numOfBags;

            if (numOfBags <= 25) {
                discount = totalCost *  0.05;

            } else if (numOfBags >= 26 && numOfBags <= 50) {
                discount = totalCost * 0.06;

            } else if (numOfBags >= 51 && numOfBags <= 100) {
                discount = totalCost * 0.07;

            } else if (numOfBags >= 101 && numOfBags <= 150) {
                discount = totalCost * 0.08;

            } else if (numOfBags >= 151 && numOfBags <= 200) {
                discount = totalCost * 0.09;

            } else if (numOfBags > 200 ) {
                discount = totalCost * 0.1;

            } else {
                discount = 0;
            }

            totalCharge = totalCost - discount;

            System.out.print("\nTOTAL COST: " + totalCost);
            System.out.print("\nDISCOUNT: " + discount);
            System.out.print("\nTOTAL CHARGE: " + totalCharge);

            System.out.print("\n\nPROGRAMMED BY   : KYLE BARCO");
            System.out.print("\n\nPROCESS ANOTHER? (Y or X)");
            ans = scan.next().charAt(0);

        } while (ans == 'y' || ans == 'Y');

    }

}
