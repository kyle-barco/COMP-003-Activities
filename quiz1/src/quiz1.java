import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        double totalPrice, totalPriceWithTax;
        String salesTax = "7.25%";

        Scanner scan = new Scanner(System.in);
        System.out.printf("%-28s: ", "Enter number of bags sold" );
        int numOfBag = scan.nextInt();

        System.out.printf("%-28s: ", "Enter number weight");
        double unitWeight = scan.nextDouble();

        // computation
        totalPrice = unitWeight * numOfBag * 5.99;
        totalPriceWithTax = totalPrice + (totalPrice * 0.0725);

        // display
        System.out.print("\n\nNO. OF BAGS SOLD        : " + numOfBag);
        System.out.print("\nWEIGHT PER BAG(POUNDS)  : " + unitWeight);
        System.out.print("\nPRICE PER POUND         : 5.99");
        System.out.print("\nSALES TAX               : " + salesTax);
        System.out.print("\nTOTAL PRICE WITH TAX    : " + totalPriceWithTax);
        System.out.println("\n\nPROGRAMMED BY: KYLE BARCO");
    }
}